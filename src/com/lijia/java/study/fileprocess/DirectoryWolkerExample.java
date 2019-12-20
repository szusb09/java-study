package com.lijia.java.study.fileprocess;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.DirectoryWalker;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.HiddenFileFilter;

/**
 * The Class FileSearcher.
 */
public class DirectoryWolkerExample {

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String baseDir = "f:/";
		String targetDir = null;
		String targetFile = "第1期第3周答案.txt";
		DirectoryWolkerExample searcher = new DirectoryWolkerExample();

//		if (args == null || args.length == 0) {
//			System.err.println("Error: Missing start directory name");
//			System.exit(-1);
//		}
//		if (args == null || args.length == 1) {
//			System.err.println("Error: Missing target file name");
//			System.exit(-1);
//		}
//
//		DirectoryWolkerExample searcher = new DirectoryWolkerExample();
//		// Only base directory and file name are given
//		if (args != null && args.length == 2) {
//			baseDir = args[0];
//			targetFile = args[1];
//			searcher.search(baseDir, targetFile);
//		}
//		// Both base and parent directories name and file name are given
//		if (args != null && args.length >= 3) {
//			baseDir = args[0];
//			targetDir = args[1];
//			targetFile = args[2];
//			searcher.search(baseDir, targetDir, targetFile);
//		}
		searcher.search(baseDir, targetFile);
	}

	/**
	 * Search by file name
	 * 
	 * @param baseDir    the base dir
	 * @param targetFile the target file
	 */
	public void search(String baseDir, String targetFile) {
		search(baseDir, null, targetFile);
	}

	/**
	 * Search by file name and parent directory name
	 * 
	 * @param baseDir    the base dir
	 * @param targetDir  the target dir
	 * @param targetFile the target file
	 */
	public void search(String baseDir, String targetDir, String targetFile) {
		// File existence check
		if ((baseDir == null || baseDir.trim().length() == 0)
				|| (targetFile == null || (targetFile.trim().length() == 0))) {
			System.err.println("Error: Missing base directory or file name");
			System.exit(-1);
		}

		File startDirectory = new File(baseDir);
		if (!startDirectory.exists()) {
			System.err.println("Error: Couldn't find path by given parameter");
			System.exit(-1);
		}
		// Create a new thread and start to search
		SearchFileWalker walker = new SearchFileWalker(startDirectory, targetDir, targetFile);
		Thread searchThread = new Thread(walker);
		searchThread.start();
		System.out.println("Start to search ");

		try {
			searchThread.join(); // child thread join to main thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		walker.displaySearchResult();
	}

	class SearchFileWalker extends DirectoryWalker implements Runnable {

		private volatile boolean cancelled = false;

		private boolean matchByFileNameOnly = true;

		private File baseDir;

		private String targetDirName;

		private String targetFileName;

		private List<File> finalResult = new ArrayList<File>();

		/**
		 * Instantiates a new search directory walker.
		 * 
		 * @param startDir   the start dir
		 * @param targetFile the target file
		 */
		public SearchFileWalker(File startDir, String targetFile) {
			this(startDir, null, targetFile);
		}

		/**
		 * Instantiates a new search directory walker.
		 * 
		 * @param startDir   the start dir
		 * @param targetDir  the target dir
		 * @param targetFile the target file
		 */
		public SearchFileWalker(File startDir, String targetDir, String targetFile) {
			super(HiddenFileFilter.VISIBLE, FileFilterUtils.suffixFileFilter(".txt"), -1);
			baseDir = startDir;
			targetDirName = targetDir;
			targetFileName = targetFile;
			matchByFileNameOnly = (targetDirName == null) ? true : false;
		}

		/**
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Runnable#run()
		 */
		public void run() {
			search();
		}

		/**
		 * Search.
		 */
		public void search() {
			List<File> searchResult = new ArrayList<File>();
			try {
				walk(baseDir, searchResult);
			} catch (IOException e) {
				e.printStackTrace();
			}
			finalResult = searchResult;
		}

		/**
		 * Gets the result.
		 * 
		 * @return the result
		 */
		public List<File> getResult() {
			return finalResult;
		}

		/**
		 * Display search result.
		 */
		public void displaySearchResult() {
			File f = null;
			System.out.println("\n=======================================");
			for (int i = 0; i < finalResult.size(); i++) {
				f = (File) finalResult.get(i);
				System.out.println("  File found: " + f.getAbsolutePath());
			}
			System.out.println("=======================================/n");
		}

		/**
		 * (non-Javadoc)
		 * 
		 * @see org.apache.commons.io.DirectoryWalker#handleDirectory(java.io.File, int,
		 *      java.util.Collection)
		 */
		protected boolean handleDirectory(File directory, int depth, Collection results) throws IOException {

			System.out.println("Searching under directory: " + directory.getAbsolutePath());
			if (matchByFileNameOnly) {
				return true; // Match by file name only
			} else if (FilenameUtils.equalsNormalizedOnSystem(targetDirName, directory.getName())) {
				return true; // Parent directory name matched
			} else if (directory.list(FileFilterUtils.directoryFileFilter()).length > 0) {
				return true; // Has child directory
			} else {
				return false; // Empty directory or file name doesn't match
			}
		}

		/**
		 * (non-Javadoc)
		 * 
		 * @see org.apache.commons.io.DirectoryWalker#handleFile(java.io.File, int,
		 *      java.util.Collection)
		 */
		protected void handleFile(File file, int depth, Collection results) throws IOException {
			System.out.println(file.getAbsolutePath());
			// Matches by file name only
			if (targetFileName.equals(file.getName()) && matchByFileNameOnly) {
				results.add(file);
			}
			// Matches by directory name and file name
			if (FilenameUtils.equalsNormalizedOnSystem(targetFileName, file.getName()) && (!matchByFileNameOnly)) {
				String fullPath = FilenameUtils.getFullPathNoEndSeparator(file.getAbsolutePath());
				String fileParentDir = fullPath.substring(FilenameUtils.indexOfLastSeparator(fullPath) + 1);
				if (FilenameUtils.equalsOnSystem(targetDirName, fileParentDir)) {
					results.add(file);
				}
			}
		}

		/**
		 * Cancel.
		 */
		public void cancel() {
			cancelled = true;
		}

		/**
		 * (non-Javadoc)
		 * 
		 * @see org.apache.commons.io.DirectoryWalker#handleIsCancelled(java.io.File,
		 *      int, java.util.Collection)
		 */
		protected boolean handleIsCancelled(File file, int depth, Collection results) {
			return cancelled;
		}

		/**
		 * (non-Javadoc)
		 * 
		 * @see org.apache.commons.io.DirectoryWalker#handleCancelled(java.io.File,
		 *      java.util.Collection,
		 *      org.apache.commons.io.DirectoryWalker.CancelException)
		 */
		protected void handleCancelled(File startDirectory, Collection results, CancelException cancel) {
			if (cancelled) {
				cancel();
			}
			System.out.println("/nCancelled by external or interal thread");
			finalResult = (List<File>) results;
		}
	}

}