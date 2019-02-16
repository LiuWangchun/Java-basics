package com.mystudy.proxy;

public interface IActor {

    /**
     * 基本演出
     * @param money
     */
    void basicAct(float money);

    /**
     * 危险演出
     * @param money
     */
    public void dangerAct(float money);
}
