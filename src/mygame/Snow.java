/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.scene.Spatial;

/**
 *
 * @author dell
 */
public class Snow extends Board {
    static Spatial terrainGeo;
    public static void setBoard(){
     terrainGeo =Jungle.manager.loadModel("Scenes/mySnow.j3o");
        Main.app.getRootNode().attachChild(terrainGeo);
    }
    
}
