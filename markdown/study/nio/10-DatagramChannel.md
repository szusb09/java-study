# Java NIO系列教程（十） Java NIO DatagramChannel

## 打开DatagramChannel

下面时DatagramChannel的打开方式：

```java {.line-numbers}
DatagramChannel channel = DatagramChannel.open();
channel.socket().bind(new InetSocketAddress(999));
```

这个例子打开的DatagramChannel可以在UDP端口9999上接收数据包。

## 接收数据

通过receive()方法从DatagramChannel接收数据，如：

```java {.line-numbers}
ByteBuffer buf = ByteBuffer.allocate(48);
buf.clear();
channel.receive(buf);
```

receive()方法会将接收到的数据包内容复制到指定的Buffer。如果Buffer容不下收到的数据，多处的数据将被丢弃。

## 发送数据

通过send()方法从DatagramChannel发送数据，如：

```java {.line-numbers}
String newData = "New String to write to file..." + System.currentTimeMillis();

ByteBuffer buf = ByteBuffer.allocate(48);
buf.clear();
buf.put(newData.getBytes());
buf.flip();

int bytesSent = channel.send(buf, new InetSocketAddress("jenkov.com", 80));
```

这个例子发送一串字符到“jenkov.com”服务器的UDP端口80.因为服务端并没有监听这个端口，所有什么也不会发生。也不会通知你发出的数据包是否已收到，因为UDP在数据传送方面没有任何保证。

## 连接到特定的地址

可以将DatagramChannel连接到网络中的特定的地址。由于UDP时无连接的，连接到特定地址并不会像TCP通道那样创建一个真正的连接。而是锁住DatagramChannel，让其只能从特定地址收发数据。这里有个例子：

```java {.line-numbers}
channel.connect(new InetSocketAddress("jenkov.com", 80));

int bytesRead = channel.read(buf);
int byteWriten= channel.write(but);
```

当连接后，可以使用read()和write()方法，就像在用传统的通道一样。只是在数据传送方面没有任何保证。