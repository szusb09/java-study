package com.lijia.java.study.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 基本Channel的示例
 * 
 * @author lijia
 *
 */
public class StudyChannelOne {
	public static void main(String[] args) throws IOException {
		// 已读写方式打开文件
		RandomAccessFile accessFile = new RandomAccessFile("E:\\git_workspace\\java-study\\data.txt", "rw");
		// 获取文件channel
		FileChannel fileChannel = accessFile.getChannel();
		// 创建10个字节大小的ByteBuffer
		ByteBuffer buffer = ByteBuffer.allocate(10);
		// 读取文件内容到buffer
		int byteReads = fileChannel.read(buffer);
		while (byteReads != -1) {
			System.out.println("Read:" + byteReads);
			// Flip()函数将一个能够继续添加数据元素的填充状态的缓冲区翻转成一个准备读出元素的释放状态.
			// 我们定义一个容量为10的字节缓冲区，这里它有一个上界limit和当前位置position,limit这时的大小是10，
			// 假如我们这时加入3个数字，这时position位置指向4，这时你如果想读数据的话，使用这个方法后，position变为0，而limit变为4
			// 注意 buffer.flip() 的调用，首先读取数据到Buffer，然后反转Buffer,接着再从Buffer中读取数据。
			buffer.flip();

			// 判断缓冲区是否取完
			while (buffer.hasRemaining()) {
				// 缓冲区有数据,则通过get方法获取
				System.out.print((char) buffer.get());
			}
			// Clear()函数将缓冲区重置为空状态。它并不改变缓冲区中的任何数据元素，而是仅仅将上界设为容量的值，并把位置设回0
			buffer.clear();
			// 继续读取数据到缓冲区
			byteReads = fileChannel.read(buffer);
			System.out.println();
		}
		// 关闭文件
		accessFile.close();
	}

}
