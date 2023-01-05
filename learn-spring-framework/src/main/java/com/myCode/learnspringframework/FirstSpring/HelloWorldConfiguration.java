package com.myCode.learnspringframework.FirstSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name,int age){ }
record Address (String firstLine,String city){ }

//in here we define spring beans
//in the configuration class we define methods to define beans
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Arpit Mehta";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Eva",14);
    }

    @Bean(name="CustomBeanName")
    public Address address(){
        return new Address("Opposite Uco Bank","Dharamshala");
    }




}
