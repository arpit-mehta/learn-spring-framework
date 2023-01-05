package com.myCode.learnspringframework.Gaming;


public class GameRunner {

    //instead of specific games we make use of GamingConsole
    //private MarioGame game;
    //private SuperContraGame game;

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}