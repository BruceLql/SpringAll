package com.bruce;

import com.bruce.demo.bean.User;
import com.bruce.demo.config.WebConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * @author: 李启岚(起冉)
 */
@SpringBootApplication
@ComponentScan("com.bruce.demo")
@Slf4j
public class Application {

    public static void main(String[] args) {

        // 返回 IOC 容器，使用注解配置，传入配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user);
        log.info("================================================");

        // 查看基于注解的 IOC容器中所有组件名称
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(System.out::println);
        log.info("------------------------------------------------");

        // 组件的作用域
        Object user1 = context.getBean("user");
        Object user2 = context.getBean("user");
        System.out.println(user1 == user2);

        SpringApplication.run(Application.class, args);
    }

}
