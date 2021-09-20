/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mygame;

import static mygame.Main.mineNo;


public class ChooseGameLevel extends GameCommands{
    public void execute(String s)
    {
    if(s=="easy"){
        Main.levelText1.setText("Esay");
        mineNo.setText("0/12");
        EasyLevel easy=new EasyLevel();
    Game.gameLevel=easy;
    Game.restart();
    }
    if(s=="medium"){
    Main.levelText1.setText("Medium");
                    mineNo.setText("0/15");
                     
                    MediumLevel medium=new MediumLevel();
                     Game.gameLevel=medium;
    Game.restart();
    }
     if(s=="hard"){
         Main.levelText1.setText("Hard");
         mineNo.setText("0/20");
     HardLevel hard=new HardLevel();
                   Game.gameLevel=hard;
    Game.restart();      
    }
    }
}
