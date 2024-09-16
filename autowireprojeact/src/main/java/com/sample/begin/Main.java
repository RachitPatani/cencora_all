package com.sample.begin;

import com.sample.begin.model.Dev;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj =  context.getBean(Dev.class);
        //  System.out.println(obj.getAge());
        obj.build();
    }
}
