
package mygame;


public class undo extends GameCommands{
    public void execute(){
    gameCaretaker gc=new  gameCaretaker();
    gc.undo();
    }
}
