package com.achelous;

import com.achelous.person.Person;

/**
 * @Author: FanJiang.
 * @date: Created by ody on 11:30 2018/4/3.
 */
public class Client {


    public static void main(String[] args) {
        Person xiaoming = new Person();
        xiaoming.setName("小明");
        xiaoming.eat(0);
        xiaoming.eat(1);
    }
}
