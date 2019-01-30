package com.mystudy.thread.demo1;

public class Main {

    public static void main(String[] args) {
        //线程之间是相互独立、互不联系的，所以要实现线程间通信，两个线程必须通过中间人————对象锁，
        // 线程具有相同的对象所LockObject.obj,才能实现唤醒等待
        Thread first = new FirstThread();
        first.setName("FirstThread");
        Thread second = new SecondThread();
        second.setName("SecondThread");
        first.start();
        second.start();
    }
}
