# Java NIO系列教程（八） SocketChannel

Java NIO中的SocketChannel是一个连接到TCP网络套接字的通道。可以通过以下2种方式创建SocketChannel：
1. 打开一个SocketChannel并连接到互联网上的某台服务器。
2. 一个新连接到达ServerSocketChannel时，会创建一个SocketChannel。

## 打开SocketChannel

下面是SockeChannel的打开方式：

```java {.line-numbers}
SocketChannel socketChannel = SocketChannel.open();
socketChannel.connect(new InetSocketAddress("http://jenkov.com"), 80);
```

## 关闭SocketChannel

当用完SocketChannel之后调用SocketChannel.close()方法关闭SocketChannel：

```java {.line-numbers}
socketChannel.close();
```

## 从SocketChannel读取数据

要从SocketChannel中读取数据，调用一个read()的方法之一。以下是例子：

```java {.line-numbers}
ByteBuffer buf = ByteBuffer.allocate(48);
int butesRead = socketChannel.read(buf);
```

首先分配一个Buffer。从SocketChannel读取到的数据将会放到这个Buffer中。

然后，调用SocketChannel.read()。该方法将数据从SocketChannel读到Buffer中。read()方法返回的int值表示毒了多少字节进Buffer里。如果返回的是-1，表示已经读到了流的末尾（连接关闭了）。

## 写入SockeChannel

写数据到SocketChannel用的是SocketChannel.write()方法，该方法以一个Buffer作为参数。示例如下：

```java {.line-numbers}
String newData = "New String to write to file..." + System.currentTimeMillis();

ByteBuffer buf = ByteBuffer.allocate(48);
buf.clear();
buf.put(newDate.getBytes());

buf.flip();

while(buf.hasRemaining()) {
    Channel.write(buf);
}
```

注意SocketChannel.write()方法的调用是在一个while循环中的。write()方法无法保证能写多少字节到SockeChannel。所有，我们重复调用write()知道Buffer没有要写的字节为止。

## 非阻塞模式

可以设置SocketChannle位非阻塞模式（non-blocking mode）。设置时候，就可以在异步模式下调用connect()、read()和write()了。

## connect()

如果SockeChannel在非阻塞模式下，此时调用connect(),该方法可能在连接建立之前就返回了。为了确定连接是否建立，可以调用finishConnect()的方法，像这样：

```java {.line-numbers}
socketChannel.configureBlocking(false);
socketChannel.connect(new InetSocketAddress("http://jenkov.com", 80));

while(!socketChannel.finishConnect()) {
    // wait, or do something else...
}
```

## write()

非阻塞模式下，write()方法在尚未写出任何内容时可能就返回了。所有需要在循环中调用write()。前面已经有例子了，这里就不再举例了。

## read()

非阻塞莫下，read()方法在尚未读取到任何数据时可能就返回了。所以需要关注它的int放回在，它会告诉你读取了多少字节。

## 非阻塞模式与选择器

非阻塞模式与选择器搭配回宫做得更好，通过将一或多个SocketChannel注册到Selector，可以徐文选择器哪个通道已经准备好了读取、写入等。Selector与SocektChannel的搭配使用会在后面详讲。