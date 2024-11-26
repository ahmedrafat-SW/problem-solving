package com.dev.threads;

public class ThreadExecutor {

    public static void main(String[] args) {
        MultiThreadingCls multiThreadingCls_1 = new MultiThreadingCls();
        MultiThreadingCls multiThreadingCls_2 = new MultiThreadingCls();

//        multiThreadingCls_1.start();
//        multiThreadingCls_2.start();

//        multiThreadingCls_1.run();
//        multiThreadingCls_2.run();

        for (int i = 1; i < 10 ; i++){
            MultiThreadingCls multiThreadingCls = new MultiThreadingCls(i);
            multiThreadingCls.start();
            try {
                multiThreadingCls.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
