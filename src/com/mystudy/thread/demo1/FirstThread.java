package com.mystudy.thread.demo1;

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (LockObject.obj) {
                System.out.println(getName() + "打出：" + 1);
                LockObject.obj.notify(); //先唤醒具有同一个锁对象的线程
                try {
                    LockObject.obj.wait();//让当前线程等待，并释放锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
