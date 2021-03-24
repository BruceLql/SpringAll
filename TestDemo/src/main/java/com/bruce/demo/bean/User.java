package com.bruce.demo.bean;

import lombok.Data;

/**
 * @author: 李启岚(起冉)
 */
@Data
public class User {

    private String name;
    private int age;

    public User() {
        System.out.println("调用无参构造器创建User");
    }

    public void init() {
        System.out.println("初始化User");
    }

    public void destory() {
        System.out.println("销毁User");
    }
}
