package com.myCode.learnspringframework.SpringGaming;

import com.myCode.learnspringframework.Gaming.GamingConsole;
//import com.myCode.learnspringframework.SpringGaming.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("lean");
    }
    public void left(){
        System.out.println("Dodge");
    }
    public void right(){
        System.out.println("Shoot");
    }
}