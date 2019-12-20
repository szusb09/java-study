# Java NIO系列教程（九） ServerSocketChannel

Java NIO中的ServerSocektChannel是一个可以监听新进来的TCP连接的通道，就像标准IO中的ServerSocket一样。ServerSocektChannel在java.nio.channels保重。

这里有个例子：

```java {.line-numbers}
ServerSocektChannel serverSocektChannel = ServerSocektChannel.open();
serverSocektChannel.socket().bind(new InetSockeAddress(999));

while(true) {
    SocektChannel socketChannel = serverSocektChannel.accept();

    // do something with socketChannel
}
```

## 打开ServerSocektChannel

通过调用ServerSocektChannel.open()方法来打开ServerSocektChannel。如：
```java {.line-numbers}
ServerSocektChannel serverSocektChannel = ServerSocektChannel.open();
```

## 关闭ServerSocektChannel

通过调用ServerSocektChannel.close()方法来关闭ServerSocektChannel。如：

```java {.line-numbers}
serverSocektChannel.close();
```

## 监听新进来的连接

通过ServerSocektChannel.accept()方法监听新进来的连接。当accept()方法返回的时候。它返回一个包含新进来的连接的SocketChannel。因此，accept()方法会一直阻塞到有新连接到达。

通常不会仅仅只监听一个连接，在while循环中调用accept()方法，如下面的例子：

```java {.line-numbers}
while(true) {
    SockeeChannel socketChannel = serverSocekChannel.accept();

    // do something with socketChannel
}
```

当然，也可以在while循环中使用除了true以外的其它退出准则。

## 非阻塞模式

ServerSocektChannel可以设置成非阻塞模式，在非阻塞模式下，accept()方法会立刻返回，如果还没有新进来的连接，返回的将是null。因此，需要检查返回的SocketChannel是否是null。如：

```java {.line-numbers}
ServerSocektChannel serverSocektChannel = ServerSocektChannel.open();

serverSocektChannel.socket().bind(new InetSockeAddress(999));
serverSocektChannel.configureBlocking(fasle);

while(true) {
    SocketChannel socketChannel = serverSocektChannel.accept();

    if(socketChannel != null) {
        // do something with socketChannel...
    }
}
```