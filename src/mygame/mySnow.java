/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.asset.AssetManager;
import com.jme3.math.FastMath;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;

/**
 *
 * @author 94131079
 */
public class mySnow {
    private AssetManager asset;
    Node snowNode;
    
    mySnow(AssetManager am, Node r)
    {
        this.asset=am;
        this.snowNode=r;
    }
    public void showSnow()
    {
        Spatial terrainGeo =asset.loadModel("Scenes/mySnow.j3o");
        snowNode.attachChild(terrainGeo);
 
        //Spatial snowman =asset.loadModel("Models/snowman/snowman.j3o");
        //snowman.setLocalTranslation(70, 8, 30);
        //snowman.setLocalScale(4, 4, 4);
        //float r1=FastMath.DEG_TO_RAD -20;
        //float r2=FastMath.DEG_TO_RAD +27;
        
        //snowman.rotate(r1, r2, FastMath.DEG_TO_RAD -16);
        
        //snowNode.attachChild(snowman);
    }
    
}
