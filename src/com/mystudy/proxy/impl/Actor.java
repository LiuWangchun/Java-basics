package com.mystudy.proxy.impl;

import com.mystudy.proxy.IActor;

/**
 * @ClassName Actor
 * @Description TODO
 * @Author MrLiu
 * Date 2019/2/16 10:31
 */
public class Actor implements IActor {

    @Override
    public void basicAct(float money) {
        System.out.println("拿到钱，开始基本的表演：" + money);
    }

    @Override
    public void dangerAct(float money) {
        System.out.println("拿到钱，开始危险表演：" + money);
    }
}
