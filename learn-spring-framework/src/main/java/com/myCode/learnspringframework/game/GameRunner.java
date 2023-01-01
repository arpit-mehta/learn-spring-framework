package com.myCode.learnspringframework.game;

//This class will run the various games
//Tightly coupled -> our game runner class runs specific game only
public class GameRunner {
    private MarioGame game;

    public GameRunner(MarioGame game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Running " + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
