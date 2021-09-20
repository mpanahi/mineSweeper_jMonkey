
package mygame;

import javax.swing.JMenu;


public class SettingMenuItem {
    public void clicked(String s){
    if(s=="model1"){ChangeMenuAppearance ma=new ChangeMenuAppearance();
    ma.execute(s);
    }
    if(s=="model2"){
    ChangeMenuAppearance ma=new ChangeMenuAppearance();
    ma.execute(s);
    }
    if(s=="jungle"){
    ChangeBoardAppearance ma=new ChangeBoardAppearance();
    ma.execute(s);
    }
    if(s=="snow"){
    ChangeBoardAppearance ma=new ChangeBoardAppearance();
    ma.execute(s);
    }
    if(s=="easy"||s=="medium"||s=="hard"){
    ChooseGameLevel ma=new ChooseGameLevel();
    ma.execute(s);
    }
    }
}
