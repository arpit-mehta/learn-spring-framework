package com.myCode.learnspringframework.FirstSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1) Launch Spring Context
        var context = new AnnotationConfigApplicationContext (HelloWorldConfiguration.class);

        //2) Configure the things we want Spring to manage
        //HelloWordConfiguration -> @Configuration

        //3) access Beans manages by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("CustomBeanName"));

        //
    }
}
