package com.spring.test.config;

import com.spring.lu.lu.context.SpringApplicationContext;
import com.spring.test.config.service.impl.AService;

public class ApplicationTest {

    public static void main(String[] args) {
        SpringApplicationContext context = new SpringApplicationContext(SpringConfig.class);
        AService aService = (AService) context.getBean("aService");
        aService.say();

//        System.out.println(context.getBean("aService"));
//        System.out.println(context.getBean("userDao"));
//        System.out.println(context.getBean("userDao"));
    }


}
