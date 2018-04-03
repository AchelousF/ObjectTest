package com.achelous.food.impl;

/**
 * @Author: FanJiang.
 * @date: Created by ody on 11:25 2018/4/3.
 */
public class SimpleFood extends AbstractFood {

    public void readyCook() {
        System.out.println("准备食材");
    }

    public void startCook() {
        System.out.println("开始做菜");
    }

    public void cookComplete() {
        System.out.println("菜做好了！");
    }
}
