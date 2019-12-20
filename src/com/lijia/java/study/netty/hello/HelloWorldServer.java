package com.lijia.java.study.netty.hello;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.channel.socket.SocketChannel;

import java.net.InetSocketAddress;

import io.netty.bootstrap.ServerBootstrap;

/**
 * Netty的服务器端,我们需要写一个ServerBootstrap，ServerBootstrap的写法是现在比较流行的流式编程法，
 * 我们需要指定它的transports，是NIO还是OIO,还需要指定端口号，最最重要的是安装server端的处理器，
 * 也就是我们之前写的HelloWorldServerHandler，还有一些Option的配置，这里只是用到，
 * 以后我们一起分析这些Option的作用，写server端还有一点需要注意，就是需要关闭连接，释放线程资源
 * 
 * @@author lijia
 */
public class HelloWorldServer {

    // 服务端口号
    private int port;

    public HelloWorldServer(int port) {
        this.port = port;
    }

    public void start() {
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap sbs = new ServerBootstrap().group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class).localAddress(new InetSocketAddress(port))
                    .childHandler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast("decoder", new StringDecoder());
                            ch.pipeline().addLast("encoder", new StringEncoder());
                            ch.pipeline().addLast(new HelloWorldServerHandler());
                        }

                    }).option(ChannelOption.SO_BACKLOG, 128).childOption(ChannelOption.SO_KEEPALIVE, true);
            // 绑定端口,开始接收进来的连接
            ChannelFuture future = sbs.bind(port).sync();

            System.out.println("Server start listen at " + port);
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        int port;

        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = 8081;
            System.out.println("端口号:" + port);
        }

        new HelloWorldServer(port).start();
    }
}
