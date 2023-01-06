package com.myCode.learnspringframework.SpringGaming;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.myCode.learnspringframework.SpringGaming")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
