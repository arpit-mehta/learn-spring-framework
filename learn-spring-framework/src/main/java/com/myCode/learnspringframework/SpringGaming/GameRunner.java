package com.myCode.learnspringframework.SpringGaming;


import com.myCode.learnspringframework.Gaming.GamingConsole;

public class GameRunner {

    //instead of specific games we make use of GamingConsole
    //private MarioGame game;
    //private SuperContraGame game;

    private com.myCode.learnspringframework.Gaming.GamingConsole game;

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