package com.myCode.learnspringframework;

import com.myCode.learnspringframework.game.GameRunner;
import com.myCode.learnspringframework.game.MarioGame;
import com.myCode.learnspringframework.game.SuperContraGame;

//in this class we create GameRunner class instance
public class AppGamingBasicJava {
    public static void main(String[] args) {

        //making marioGame Object
        var marioGame =  new MarioGame();

        var superContraGame= new SuperContraGame();


        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
