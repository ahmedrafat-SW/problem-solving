package com.dev.threads;

import java.util.List;

public class MultiThreadingCls extends Thread {

    private List<String> names = List.of("first", "second", "third", "fourth");
    private int threadNumber;


    public MultiThreadingCls(){
    }

    public MultiThreadingCls(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        names.forEach(item -> System.out.printf("%s , thread number %s \n", item, this.threadNumber ));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
