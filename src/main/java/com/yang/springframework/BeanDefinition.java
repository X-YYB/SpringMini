package com.yang.springframework;

/**
 * @title BeanDefinition
 * @description bean定义
 * @author: yangyongbing
 * @date: 2023/11/17
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
