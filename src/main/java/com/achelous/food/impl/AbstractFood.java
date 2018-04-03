package com.achelous.food.impl;

import com.achelous.food.Food;

/**
 * @Author: FanJiang.
 * @date: Created by ody on 11:21 2018/4/3.
 */
public abstract class AbstractFood implements Food{


    public abstract void readyCook();

    public abstract void startCook();

    public abstract void cookComplete();

    public void getFood() {
        readyCook();
        startCook();
        cookComplete();
    }
}
