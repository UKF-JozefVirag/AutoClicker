package com.jv;

import java.awt.*;
import java.awt.event.InputEvent;

public class BotClick {
    Robot bot = null;
    public BotClick(int repeat, int pause){
        botCreate(repeat, pause);
    }

    public void botCreate(int repeats, int pause){
        try{
            bot = new Robot();
        }catch (Exception failed){
            System.err.println("Failed instantiating Robot: " + failed);
        }
        int mask = InputEvent.BUTTON1_DOWN_MASK;
        try{
            for(int i = 0; i<repeats; i++){
                Thread.sleep(pause);
                bot.mousePress(mask);
                bot.mouseRelease(mask);
            }
        }catch (Exception failed){
            System.out.println("Failed : " + failed);
        }
    }




}
