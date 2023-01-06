package com.myCode.learnspringframework.SpringGaming;


import com.myCode.learnspringframework.FirstSpring.HelloWorldConfiguration;
import com.myCode.learnspringframework.Gaming.GameRunner;
import com.myCode.learnspringframework.Gaming.GamingConsole;
import com.myCode.learnspringframework.Gaming.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
class GamingConfiguration {

    @Bean
    public GamingConsole game1(){
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GamingConsole game2(){
        var game = new MarioGame();
        return game;
    }

    @Bean
    public GamingConsole game3(){
        var game = new SuperContraGame();
        return game;
    }

    @Bean
    @Primary
    public GameRunner gameRunner1(GamingConsole game1){
        var gameRunner = new GameRunner(game1);
        return gameRunner;
    }
    @Bean
    public GameRunner gameRunner2(GamingConsole game2){
        var gameRunner = new GameRunner(game2);
        return gameRunner;
    }
    @Bean
    public GameRunner gameRunner3(GamingConsole game3){
        var gameRunner = new GameRunner(game3);
        return gameRunner;
    }
}

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
