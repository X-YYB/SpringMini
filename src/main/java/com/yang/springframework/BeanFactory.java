package com.yang.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @title BeanFactory
 * @description bean工厂
 * @author: yangyongbing
 * @date: 2023/11/17
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap= new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBean(String name,BeanDefinition bean){
        beanDefinitionMap.put(name,bean);
    }
}
