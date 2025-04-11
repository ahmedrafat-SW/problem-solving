package com.dev.iooperations;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class FileReadChannelExample {

    public static void main(String[] args) throws Exception {

        try(
            RandomAccessFile file = new RandomAccessFile("example.txt", "r")
        ) {

            FileChannel channel = file.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(64);
            channel.read(buffer);

            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }

            channel.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
