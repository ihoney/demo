package com.rainbow.cloud.learn.multithread;

/**
 * Created by caihongli on 2017/6/28.
 */
class MyThreads extends Thread {

    public MyThreads() {
        System.out.println("构造方法打印:" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法打印：" + Thread.currentThread().getName());
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThreads myThread2 = new MyThreads();
        myThread2.start();
        //myThread2.run();
    }
}
