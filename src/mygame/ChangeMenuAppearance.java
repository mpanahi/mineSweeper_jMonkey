/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;


public class ChangeMenuAppearance extends GameCommands{
     public void execute(String s)
    {
    if(s=="model1"){
    SettingMenuModel1.setIconModel1();
    }
    if(s=="model2"){
    SettingMenuModel1.setIconModel2();
    }
    }
    
}
