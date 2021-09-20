
package mygame;


public class newGame extends GameCommands{
    public void execute(String s){
   
     EasyLevel easy=new EasyLevel();
    Game.gameLevel=easy;
    Game.restart();
    
    }
}
