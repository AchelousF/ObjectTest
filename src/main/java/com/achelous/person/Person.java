package com.achelous.person;

import com.achelous.food.Food;
import com.achelous.food.impl.OutFood;
import com.achelous.food.impl.SimpleFood;

/**
 * @Author: FanJiang.
 * @date: Created by ody on 11:14 2018/4/3.
 */
public class Person {

    // hungry status. if the status equals 0. person can't eat.
    private Integer status = 0;

    private String name;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Integer type){
        if (this.status == 1) {
            System.out.println(this.name + "吃饱了，不能再吃了");
            return ;
        }
        Food food;
        if (type == 0) {
            food = new SimpleFood();
        } else {
            food = new OutFood();
        }
        System.out.println(this.name);
        food.getFood();
        doEat();
        this.status = 1;
    }

    private void doEat(){
        System.out.println("获得食物，准备吃饭");
        System.out.println("正在吃饭...");
        System.out.println("吃完了");
    }
}
