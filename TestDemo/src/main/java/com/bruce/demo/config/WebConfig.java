package com.bruce.demo.config;

import com.bruce.demo.bean.Bird;
import com.bruce.demo.bean.Fish;
import com.bruce.demo.bean.MyBeanPostProcessor;
import com.bruce.demo.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 李启岚(起冉)
 */
@Configuration
public class WebConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public User user() {
        return new User();
    }

    @Bean
    public Bird bird() {
        return new Bird();
    }

    @Bean
    public Fish fish() {
        return new Fish();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
