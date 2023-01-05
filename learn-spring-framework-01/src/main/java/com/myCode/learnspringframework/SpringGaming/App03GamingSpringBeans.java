package com.myCode.learnspringframework.SpringGaming;


import com.myCode.learnspringframework.FirstSpring.HelloWorldConfiguration;
import com.myCode.learnspringframework.Gaming.GameRunner;
import com.myCode.learnspringframework.Gaming.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
