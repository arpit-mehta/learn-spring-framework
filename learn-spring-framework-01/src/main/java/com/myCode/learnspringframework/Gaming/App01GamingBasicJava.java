package com.myCode.learnspringframework.Gaming;

import com.myCode.learnspringframework.FirstSpring.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //var game= new MarioGame();
        //var game= new SuperContraGame();
        var game= new PacManGame();

        //our game Runner is Tightly coupled to a specific game
        //we have to pass the game object we want to run either superContra or marioGame
        var gameRunner= new GameRunner(game);
        gameRunner.run();
    }
}