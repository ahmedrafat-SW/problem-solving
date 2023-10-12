package com.dev.hackerrankproblems;

public class HackerRankJavaBasicTestSolution {

    public static void main(String[] args) {
//        int mask = 0x000f;
//        int value = 0x2222;
//        System.out.println(value & mask);

        TestThread t1 = new TestThread("A");
        TestThread t2 = new TestThread("B");
        t2.start();
        t1.start();
    }
}

class  TestThread implements Runnable{
    private Thread t;
    private String threadName;
   TestThread (String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true){
            System.out.print(threadName);
        }
    }
    public void start(){
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}