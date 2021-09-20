/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

/**
 *
 * @author dell
 */
public class CommandMenuItem {
       public void clicked(String s){
       if(s=="undo"){
       undo u=new undo();
       u.execute();
       }
       if(s=="redo"){
       redo r=new redo();
       r.execute();
       }
       if(s=="newGame"){
       newGame nw=new newGame();
       nw.execute("newGame");
       }
       }
}
