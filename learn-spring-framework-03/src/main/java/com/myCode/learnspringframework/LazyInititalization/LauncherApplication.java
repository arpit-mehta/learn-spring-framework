package com.myCode.learnspringframework.LazyInititalization;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA) {
        //Logic
        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Running");
    }
}

@Configuration
@ComponentScan
public class LauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LauncherApplication.class)) {
            System.out.println("Application Started");
            context.getBean(ClassB.class).doSomething();
        }
    }
}



