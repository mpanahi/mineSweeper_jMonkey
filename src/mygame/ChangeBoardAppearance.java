
package mygame;


public class ChangeBoardAppearance extends GameCommands {
    public void execute(String s)
    {
    if(s=="jungle"){
        if(Jungle.terrainGeo==null){
         Main.app.getRootNode().detachChild(Snow.terrainGeo);
    
    Jungle.setBoard();
        }
    }
    if(s=="snow"){
        
        
    Main.app.getRootNode().detachChild(Jungle.terrainGeo);
     Main.app.getRootNode().detachChild(Jungle.tree1);
      Main.app.getRootNode().detachChild(Jungle.tree2);
       Main.app.getRootNode().detachChild(Jungle.tree3);
        Main.app.getRootNode().detachChild(Jungle.tree4);
         Main.app.getRootNode().detachChild(Jungle.tree5);
          Main.app.getRootNode().detachChild(Jungle.tree6);
           Main.app.getRootNode().detachChild(Jungle.tree7);
            Main.app.getRootNode().detachChild(Jungle.tree8);
             Main.app.getRootNode().detachChild(Jungle.tree9);
              Main.app.getRootNode().detachChild(Jungle.tree10);
               Main.app.getRootNode().detachChild(Jungle.tree11);
                Main.app.getRootNode().detachChild(Jungle.tree12);
                 Main.app.getRootNode().detachChild(Jungle.tree13);
                  Main.app.getRootNode().detachChild(Jungle.tree14);
                   Main.app.getRootNode().detachChild(Jungle.tree15);
                    Main.app.getRootNode().detachChild(Jungle.tree16);
                     Main.app.getRootNode().detachChild(Jungle.tree17);
                      Main.app.getRootNode().detachChild(Jungle.tree18);
                       Main.app.getRootNode().detachChild(Jungle.tree19);
                        Main.app.getRootNode().detachChild(Jungle.tree20);
                         Main.app.getRootNode().detachChild(Jungle.tree21);
                          Main.app.getRootNode().detachChild(Jungle.tree22);
    Jungle.terrainGeo=null;
    Snow.setBoard();
    }
    }
    
}
