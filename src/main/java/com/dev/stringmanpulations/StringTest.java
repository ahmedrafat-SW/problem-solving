package com.dev.stringmanpulations;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class StringTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // String Performance
        String str = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i; // Creates new object each time
        }
        endTime = System.currentTimeMillis();
        System.out.println("String time: " + (endTime - startTime) + "ms");

        // StringBuilder Performance
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + "ms");

        // StringBuffer Performance
        StringBuffer sbf = new StringBuffer();
        startTime = System.currentTimeMillis();
        ThreadPoolExecutor fixedThreadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10000; i++) {
            fixedThreadPool.submit(() -> sbf.append("e"));
        }
        System.out.println("fixedThreadPool.getPoolSize() = " + fixedThreadPool.getPoolSize());
        fixedThreadPool.shutdown();

        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + "ms");
    }
}
