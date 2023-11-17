package com.yang.springframework.test;

import com.yang.springframework.BeanDefinition;
import com.yang.springframework.BeanFactory;
import com.yang.springframework.bean.UserService;

/**
 * @title UnitTest
 * @description 单元测试
 * @author: yangyongbing
 * @date: 2023/11/17 17:15
 */
public class UnitTest {
    public static void main(String[] args) {
        // 1、初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBean("userService",beanDefinition );
        // 3、获取bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryInfo();
    }
}
