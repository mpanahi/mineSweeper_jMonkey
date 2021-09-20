
package mygame;

import com.jme3.material.Material;
import com.jme3.material.RenderState;
import com.jme3.terrain.geomipmap.TerrainLodControl;
import com.jme3.terrain.geomipmap.TerrainQuad;
import com.jme3.terrain.heightmap.AbstractHeightMap;
import com.jme3.terrain.heightmap.ImageBasedHeightMap;
import com.jme3.texture.Texture;
import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;
import com.jme3.system.JmeCanvasContext;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.jme3.scene.Spatial;
import com.jme3.light.*;
import com.jme3.material.RenderState;
import com.jme3.terrain.GeoMap;
import com.jme3.terrain.Terrain;
import com.jme3.terrain.geomipmap.*;
import com.jme3.terrain.geomipmap.grid.*;
import com.jme3.terrain.geomipmap.lodcalc.util.*;
import com.jme3.app.SimpleApplication;
import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.renderer.Camera;
import com.jme3.renderer.queue.RenderQueue;
import com.jme3.terrain.geomipmap.TerrainLodControl;
import com.jme3.terrain.heightmap.AbstractHeightMap;
import com.jme3.terrain.geomipmap.TerrainQuad;
import com.jme3.terrain.geomipmap.lodcalc.DistanceLodCalculator;
import com.jme3.terrain.heightmap.HillHeightMap; // for exercise 2
import com.jme3.terrain.heightmap.ImageBasedHeightMap;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture.WrapMode;
import java.util.ArrayList;
import java.util.List;
import java.awt.ImageCapabilities;
import com.jme3.asset.AssetManager;
import com.jme3.math.Vector3f;
import com.jme3.renderer.queue.RenderQueue;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;

//import java.util.stream.*;

/**
 *
 * @author dell
 */
public class Jungle  {
  //  static  TerrainQuad terrain;
    static Spatial terrainGeo,tree1,tree2,tree3,tree4,tree5,tree6,tree7,tree8,tree9,tree10,tree11,tree12,tree13,tree14,tree15,tree16,tree17,tree18,tree19,tree20,tree21,tree22;
    Main m;
    static AssetManager manager;
    public Jungle(AssetManager manager1,Main app){
    manager=manager1;
    m=app;
    
    }
 public static void setBoard(){
 
    terrainGeo =manager.loadModel("Scenes/myJungle.j3o");
        Main.app.getRootNode().attachChild(terrainGeo);
        terrainGeo.setName("s");
         tree1 = manager.loadModel("Models/Beech/Beech.j3o");
        tree1.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree1.scale(5.0f);
        Main.app.getRootNode().attachChild(tree1);
        Vector3f treeLoc1 = new Vector3f(95,-10,80);
        tree1.setLocalTranslation(treeLoc1);
        
         tree2 = manager.loadModel("Models/Beech/Beech.j3o");
        tree2.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree2.scale(5.0f);
         Main.app.getRootNode().attachChild(tree2);
        Vector3f treeLoc2 = new Vector3f(85,-10,105);
        tree2.setLocalTranslation(treeLoc2);
        
         tree3 = manager.loadModel("Models/Beech/Beech.j3o");
        tree3.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree3.scale(5.0f);
        Main.app.getRootNode().attachChild(tree3);
        Vector3f treeLoc3 = new Vector3f(45,-10,90);
        tree3.setLocalTranslation(treeLoc3);
        
         tree4 = manager.loadModel("Models/Beech/Beech.j3o");
        tree4.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree4.scale(5.0f);
        Main.app.getRootNode().attachChild(tree4);
        Vector3f treeLoc4 = new Vector3f(80,-10,82);
        tree4.setLocalTranslation(treeLoc4);
        
         tree5 = manager.loadModel("Models/Beech/Beech.j3o");
        tree5.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree5.scale(5.0f);
        Main.app.getRootNode().attachChild(tree5);
        Vector3f treeLoc5 = new Vector3f(30,-10,115);
        tree5.setLocalTranslation(treeLoc5);
        
         tree6 = manager.loadModel("Models/Beech/Beech.j3o");
        tree6.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree6.scale(5.0f);
        Main.app.getRootNode().attachChild(tree6);
        Vector3f treeLoc6 = new Vector3f(5,-10,85);
        tree6.setLocalTranslation(treeLoc6);
        
         tree7 = manager.loadModel("Models/Beech/Beech.j3o");
        tree7.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree7.scale(5.0f);
        Main.app.getRootNode().attachChild(tree7);
        Vector3f treeLoc7 = new Vector3f(-25,-10,90);
        tree7.setLocalTranslation(treeLoc7);
        
         tree8 = manager.loadModel("Models/Beech/Beech.j3o");
        tree8.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree8.scale(5.0f);
        Main.app.getRootNode().attachChild(tree8);
        Vector3f treeLoc8 = new Vector3f(-55,-10,115);
        tree8.setLocalTranslation(treeLoc8);
        
         tree9 = manager.loadModel("Models/Beech/Beech.j3o");
        tree9.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree9.scale(5.0f);
        Main.app.getRootNode().attachChild(tree9);
        Vector3f treeLoc9 = new Vector3f(-65,-10,55);
        tree9.setLocalTranslation(treeLoc9);
        
         tree10 = manager.loadModel("Models/Beech/Beech.j3o");
        tree10.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree10.scale(5.0f);
        Main.app.getRootNode().attachChild(tree10);
        Vector3f treeLoc10 = new Vector3f(-40,-10,65);
        tree10.setLocalTranslation(treeLoc10);
        
         tree11 = manager.loadModel("Models/Beech/Beech.j3o");
        tree11.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree11.scale(5.0f);
        Main.app.getRootNode().attachChild(tree11);
        Vector3f treeLoc11 = new Vector3f(-75,-10,23);
        tree11.setLocalTranslation(treeLoc11);
        
         tree12 = manager.loadModel("Models/Beech/Beech.j3o");
        tree12.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree12.scale(5.0f);
        Main.app.getRootNode().attachChild(tree12);
        Vector3f treeLoc12 = new Vector3f(-70,-10,13);
        tree12.setLocalTranslation(treeLoc12);
        
         tree13 = manager.loadModel("Models/Beech/Beech.j3o");
        tree13.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree13.scale(5.0f);
        Main.app.getRootNode().attachChild(tree13);
        Vector3f treeLoc13 = new Vector3f(-110,-10,-20);
        tree13.setLocalTranslation(treeLoc13);
        
         tree14 = manager.loadModel("Models/Beech/Beech.j3o");
        tree14.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree14.scale(5.0f);
        Main.app.getRootNode().attachChild(tree14);
        Vector3f treeLoc14 = new Vector3f(-85,-10,-5);
        tree14.setLocalTranslation(treeLoc14);
        
         tree15 = manager.loadModel("Models/Beech/Beech.j3o");
        tree15.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree15.scale(5.0f);
        Main.app.getRootNode().attachChild(tree15);
        Vector3f treeLoc15 = new Vector3f(-65,-10,-30);
        tree15.setLocalTranslation(treeLoc15);
        
         tree16 = manager.loadModel("Models/Beech/Beech.j3o");
        tree16.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree16.scale(5.0f);
        Main.app.getRootNode().attachChild(tree16);
        Vector3f treeLoc16 = new Vector3f(-85,-10,-60);
        tree16.setLocalTranslation(treeLoc16);
        
         tree17 = manager.loadModel("Models/Beech/Beech.j3o");
        tree17.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree17.scale(5.0f);
        Main.app.getRootNode().attachChild(tree17);
        Vector3f treeLoc17 = new Vector3f(-70,-10,-75);
        tree17.setLocalTranslation(treeLoc17);
        
         tree18 = manager.loadModel("Models/Beech/Beech.j3o");
        tree18.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree18.scale(5.0f);
        Main.app.getRootNode().attachChild(tree18);
        Vector3f treeLoc18 = new Vector3f(-60,-10,-105);
        tree18.setLocalTranslation(treeLoc18);
        
         tree19 = manager.loadModel("Models/Beech/Beech.j3o");
        tree19.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree19.scale(5.0f);
        Main.app.getRootNode().attachChild(tree19);
        Vector3f treeLoc19 = new Vector3f(-5,-10,-80);
        tree19.setLocalTranslation(treeLoc19);
        
         tree20 = manager.loadModel("Models/Beech/Beech.j3o");
        tree20.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree20.scale(5.0f);
        Main.app.getRootNode().attachChild(tree20);
        Vector3f treeLoc20 = new Vector3f(-60,-10,-50);
        tree20.setLocalTranslation(treeLoc20);
        
         tree21 = manager.loadModel("Models/Beech/Beech.j3o");
        tree21.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree21.scale(5.0f);
        Main.app.getRootNode().attachChild(tree21);
        Vector3f treeLoc21 = new Vector3f(-40,-10,-95);
        tree21.setLocalTranslation(treeLoc21);
        
         tree22 = manager.loadModel("Models/Beech/Beech.j3o");
        tree22.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree22.scale(5.0f);
        //jungleNode.attachChild(tree22);
        Vector3f treeLoc22 = new Vector3f(55,-10,75);
        tree22.setLocalTranslation(treeLoc22);
        tree1.setName("s");
        tree2.setName("s");
        tree3.setName("s");
        tree4.setName("s");
        tree5.setName("s");
        tree6.setName("s");
        tree7.setName("s");
        tree8.setName("s");
        tree9.setName("s");
        tree10.setName("s");
        tree11.setName("s");
        tree12.setName("s");
        tree13.setName("s");
        tree14.setName("s");
        tree15.setName("s");
        tree16.setName("s");
        tree17.setName("s");
        tree18.setName("s");
        tree19.setName("s");
        tree20.setName("s");
        tree21.setName("s");
        tree22.setName("s");
    
 }
    
}

