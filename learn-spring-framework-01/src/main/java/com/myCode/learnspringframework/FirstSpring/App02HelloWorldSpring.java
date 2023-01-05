package com.myCode.learnspringframework.FirstSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1) Launch Spring Context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            //2) Configure the things we want Spring to manage
            //HelloWordConfiguration -> @Configuration

            //3) access Beans manages by spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("CustomBeanName"));

            //Using MethodCall
            System.out.println("Method Call:");
            System.out.println(context.getBean("person2MethodCall"));

            //Using parameters
            System.out.println("Parameters:");
            System.out.println(context.getBean("person3Parameters"));

            //Bean can be accessed using Bean type as well
            //if we have multiple matching candidates spring throws an exception for this
            //1) we can solve this by making 1 of these primary
            System.out.println(context.getBean(Address.class));
            //2)or by using a qualifier
            System.out.println("Qualifier:");
            System.out.println(context.getBean("person4Parameters"));
        }


        //sOUT all the names using array
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
