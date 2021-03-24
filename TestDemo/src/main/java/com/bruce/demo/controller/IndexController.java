package com.bruce.demo.controller;

import com.bruce.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 李启岚(起冉)
 */
@RestController
public class IndexController {

    @Autowired
    private User user;

    @RequestMapping("/index")
    String index() {
        return user.getName() == null ? "zhangsan" : "lisi";
    }
}
