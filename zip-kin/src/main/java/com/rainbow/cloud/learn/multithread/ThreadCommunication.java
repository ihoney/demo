package com.rainbow.cloud.learn.multithread;

/**
 * 例子: 子线程循环5次，主线程循环10次，如此交替50次
 * Created by caihongli on 2017/6/28.
 */
public class ThreadCommunication {

    public static void main(String[] args) {
        Business business = new Business();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=1;i<=50;i++){
                            business.sub(i);
                        }
                    }
                }
        ).start();

        for(int i=1;i<=50;i++){
            business.main(i);
        }
    }
}
