# Java NIO系列教程（十一） Pipe

Java NIO管道是2个线程之间的单向数据连接。Pipe有一个source通道和一个sink通道。数据会被写到sink通道，从source通道读取。下面是Pipe原理的图示：
![11-Pipe/11-Pipe-2019-11-29-15-40-34](https://tracking56.oss-cn-beijing.aliyuncs.com/images/11-Pipe/11-Pipe-2019-11-29-15-40-34)

## 创建管道

通过Pipe.open()方法打开管道。例如：

```java {.line-numbers}
Pipe pipe = Pipe.open();
```

## 向管道写数据

要想管道写数据，需要访问sink通道。像这样：

```java {.line-numbers}
Pipe.SinkChannel sinkChannel = pipe.sink();
```

通过调用SinkChannel的write()方法，将数据写入SinkChannel，像这样：

```java {.line-numbers}
String newData = "New String to write to file..." + System.currentTimeMillis();
ByteBuffer buf = ByetBuffer.allocate(48);
buf.clear();
buf.put(newData.getBytes());

buf.flip();

while(buf.hasRemaining()) {
    sinkChannel.write(buf);
}
```

## 从管道读取数据

读取管道的数据，需要访问source通道，像这样：

```java {.line-numbers}
Pipe.SourceChannel sourceChannel = pipe.source();
```
调用source通道的read()方法来读取数据，像这样：

```java {.line-numbers}
ByteBuffer buf = ByteBuffer.allocate(48);
int bytesRead = sourceChannel.read(buf);
```

read()方法返回的int值会告诉我们多少字节被读尽量缓冲区。

## 完整示例

```java {.line-numbers}
public static void pipeExample(){
    Pipe pipe = null;
    ExecutorService exec = Executors.newFixedThreadPool(2);
    try{
        //创建pipe
        pipe = Pipe.open();
            final Pipe pipeTemp = pipe;
        //线程一向管道中写入数据
        exec.submit(new Callable<Object>(){
            @Override
             public Object call() throws Exception
            {
                   Pipe.SinkChannel sinkChannel = pipeTemp.sink();//向通道中写数据
                   while(true){
                       TimeUnit.SECONDS.sleep(1);
                       String newData = "hello world"+System.currentTimeMillis();
                       ByteBuffer buf = ByteBuffer.allocate(1024);
                       buf.clear();
                       buf.put(newData.getBytes());
                       //反转后可读
                       buf.flip();
                       while(buf.hasRemaining()){
                           System.out.println(buf);
                           sinkChannel.write(buf);
                       }
                   }
               }
           });
        //线程二读取管道中的数据
        exec.submit(new Callable<Object>(){
            @Override
            public Object call() throws Exception
            {
                Pipe.SourceChannel sourceChannel = pipeTemp.source();//向通道中读数据
                while(true){
                    TimeUnit.SECONDS.sleep(1);
                    ByteBuffer buf = ByteBuffer.allocate(1024);
                    buf.clear();
                    //可读大小
                    int bytesRead = sourceChannel.read(buf);
                    System.out.println("bytesRead="+bytesRead);
                    while(bytesRead >0 ){
                        buf.flip();
                        byte b[] = new byte[bytesRead];
                        int i=0;
                        while(buf.hasRemaining()){
                            b[i]=buf.get();
                            System.out.printf("%X",b[i]);
                            i++;
                        }
                        String s = new String(b);
                        System.out.println("========>>>>>>"+s);
                        //无数据时跳出当前循环体
                        bytesRead = sourceChannel.read(buf);
                    }
                }
            }
        });
    }catch(IOException e){
        e.printStackTrace();
    }finally{
        exec.shutdown();
    }
}
```