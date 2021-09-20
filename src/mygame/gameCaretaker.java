package mygame;
import com.jme3.scene.Geometry;
public class gameCaretaker {
static String[][][] gameState =new String[4][4][6];
static String[][][] gameStateredo =new String[4][4][6];
public void inactive(Geometry target){
    if((target.getName().substring(2).equals("0"))||(target.getName().substring(2).equals("1"))||(target.getName().substring(2).equals("2"))||(target.getName().substring(2).equals("3"))||(target.getName().substring(2).equals("4"))||(target.getName().substring(2).equals("5"))){
      if(Game.turnInactive==false)
      
      {
       playingGame playing=new playingGame();
       gameState=playing.createMemento();
       playing.Inactive(target);
      }
        Game.turnInactive= !(Game.turnInactive);
        }
}
    public void mark(Geometry target){
       if((target.getName().substring(2).equals("0"))||(target.getName().substring(2).equals("1"))||(target.getName().substring(2).equals("2"))||(target.getName().substring(2).equals("3"))||(target.getName().substring(2).equals("4"))||(target.getName().substring(2).equals("5"))){
        if(Game.turnMark==false){
       playingGame playing=new playingGame();
       gameState=playing.createMemento();
       System.out.println(target.getName());
       playing.mark(target);
        }
        Game.turnMark= !(Game.turnMark);
       
       }             
    }
    public void redo(){
       playingGame playing=new playingGame();
       
       gameState=playing.createMemento();
      playing.redo();
    }
    public void undo(){
            playingGame playing=new playingGame();
        
       playing.setMemento(gameState);
            playing.undo();
    }
}
