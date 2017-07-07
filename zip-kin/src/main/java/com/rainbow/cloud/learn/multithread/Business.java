package com.rainbow.cloud.learn.multithread;

/**
 * Created by caihongli on 2017/6/28.
 */
public class Business {
    private boolean isPass = true;

    public synchronized void sub(int j) {

        while (!isPass) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        for(int i=1;i<=5;i++) {
            System.out.println("sub thread count:"+i+", num:"+j+"/50");
        }
        isPass = false;
        this.notify();
    }

    public synchronized void main(int j) {
        while (isPass) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        for(int i=1;i<=10;i++) {
            System.out.println("main thread count:"+i+", num:"+j+"/50");
        }
        isPass = true;
        this.notify();
    }
}
