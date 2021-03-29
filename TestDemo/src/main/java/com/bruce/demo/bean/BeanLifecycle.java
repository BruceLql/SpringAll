package com.bruce.demo.bean;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: 李启岚(起冉)
 */
@Slf4j
@Component
public class BeanLifecycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor,
        InitializingBean, DisposableBean {

    @Override
    public void setBeanName(@NonNull String beanName) {
        log.info("BeanLifecycle#setBeanName -> {}", beanName);
    }

    @Override
    public void setBeanFactory(@NonNull BeanFactory beanFactory) throws BeansException {
        log.info("BeanLifecycle#setBeanFactory -> beanFactory");
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        log.info("BeanLifecycle#setApplicationContext -> applicationContext");
    }

    @Override
    public Object postProcessBeforeInitialization(@NonNull Object bean, @NonNull String beanName) throws BeansException {
        log.info("BeanLifecycle#postProcessBeforeInitialization -> {}", bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(@NonNull Object bean, @NonNull String beanName) throws BeansException {
        log.info("BeanLifecycle#postProcessAfterInitialization");
        return bean;
    }

    @Override
    public void afterPropertiesSet() {
        log.info("BeanLifecycle#afterPropertiesSet");
    }

    @Override
    public void destroy() {
        log.info("BeanLifecycle#destroy");
    }
}
