package com.myCode.learnspringframework.couple;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        //var game= new MarioGame();
        //var game= new SuperContraGame();
        var game= new PacManGame();

        //our game Runner is Tightly coupled to a specific game
        //we have to pass the game object we want to run either superContra or marioGame
        var gameRunner= new GameRunner(game);
        gameRunner.run();
    }
}
