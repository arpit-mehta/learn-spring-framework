package com.myCode.learnspringframework.SpringGaming;

//import com.myCode.learnspringframework.SpringGaming.GamingConsole;
import com.myCode.learnspringframework.Gaming.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //spring will create instance of this class itself
@Primary
public class PacManGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("eat down");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Accelerate");
    }

}