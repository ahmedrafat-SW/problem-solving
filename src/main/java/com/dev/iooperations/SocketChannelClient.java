package com.dev.iooperations;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannelClient {
    public static void main(String[] args) throws Exception {
        try (SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost", 5000))) {
            socketChannel.configureBlocking(false);

            ByteBuffer buffer = ByteBuffer.wrap("Hello Server!".getBytes());
            socketChannel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
