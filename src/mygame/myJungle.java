/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.asset.AssetManager;
import com.jme3.math.Vector3f;
import com.jme3.renderer.queue.RenderQueue;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;

/**
 *
 * @author 94131079
 */
public class myJungle {
    private AssetManager asset;
    Node jungleNode;
    
    myJungle(AssetManager am, Node r)
    {
        this.asset=am;
        this.jungleNode=r;
    }
    public void showJungle()
    {
        Spatial terrainGeo =asset.loadModel("Scenes/myJungle.j3o");
        jungleNode.attachChild(terrainGeo);
        
        Spatial tree1 = asset.loadModel("Models/Beech/Beech.j3o");
        tree1.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree1.scale(5.0f);
        jungleNode.attachChild(tree1);
        Vector3f treeLoc1 = new Vector3f(95,-10,80);
        tree1.setLocalTranslation(treeLoc1);
        
        Spatial tree2 = asset.loadModel("Models/Beech/Beech.j3o");
        tree2.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree2.scale(5.0f);
        jungleNode.attachChild(tree2);
        Vector3f treeLoc2 = new Vector3f(85,-10,105);
        tree2.setLocalTranslation(treeLoc2);
        
        Spatial tree3 = asset.loadModel("Models/Beech/Beech.j3o");
        tree3.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree3.scale(5.0f);
        jungleNode.attachChild(tree3);
        Vector3f treeLoc3 = new Vector3f(45,-10,90);
        tree3.setLocalTranslation(treeLoc3);
        
        Spatial tree4 = asset.loadModel("Models/Beech/Beech.j3o");
        tree4.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree4.scale(5.0f);
        jungleNode.attachChild(tree4);
        Vector3f treeLoc4 = new Vector3f(80,-10,82);
        tree4.setLocalTranslation(treeLoc4);
        
        Spatial tree5 = asset.loadModel("Models/Beech/Beech.j3o");
        tree5.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree5.scale(5.0f);
        jungleNode.attachChild(tree5);
        Vector3f treeLoc5 = new Vector3f(30,-10,115);
        tree5.setLocalTranslation(treeLoc5);
        
        Spatial tree6 = asset.loadModel("Models/Beech/Beech.j3o");
        tree6.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree6.scale(5.0f);
        jungleNode.attachChild(tree6);
        Vector3f treeLoc6 = new Vector3f(5,-10,85);
        tree6.setLocalTranslation(treeLoc6);
        
        Spatial tree7 = asset.loadModel("Models/Beech/Beech.j3o");
        tree7.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree7.scale(5.0f);
        jungleNode.attachChild(tree7);
        Vector3f treeLoc7 = new Vector3f(-25,-10,90);
        tree7.setLocalTranslation(treeLoc7);
        
        Spatial tree8 = asset.loadModel("Models/Beech/Beech.j3o");
        tree8.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree8.scale(5.0f);
        jungleNode.attachChild(tree8);
        Vector3f treeLoc8 = new Vector3f(-55,-10,115);
        tree8.setLocalTranslation(treeLoc8);
        
        Spatial tree9 = asset.loadModel("Models/Beech/Beech.j3o");
        tree9.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree9.scale(5.0f);
        jungleNode.attachChild(tree9);
        Vector3f treeLoc9 = new Vector3f(-65,-10,55);
        tree9.setLocalTranslation(treeLoc9);
        
        Spatial tree10 = asset.loadModel("Models/Beech/Beech.j3o");
        tree10.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree10.scale(5.0f);
        jungleNode.attachChild(tree10);
        Vector3f treeLoc10 = new Vector3f(-40,-10,65);
        tree10.setLocalTranslation(treeLoc10);
        
        Spatial tree11 = asset.loadModel("Models/Beech/Beech.j3o");
        tree11.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree11.scale(5.0f);
        jungleNode.attachChild(tree11);
        Vector3f treeLoc11 = new Vector3f(-75,-10,23);
        tree11.setLocalTranslation(treeLoc11);
        
        Spatial tree12 = asset.loadModel("Models/Beech/Beech.j3o");
        tree12.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree12.scale(5.0f);
        jungleNode.attachChild(tree12);
        Vector3f treeLoc12 = new Vector3f(-70,-10,13);
        tree12.setLocalTranslation(treeLoc12);
        
        Spatial tree13 = asset.loadModel("Models/Beech/Beech.j3o");
        tree13.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree13.scale(5.0f);
        jungleNode.attachChild(tree13);
        Vector3f treeLoc13 = new Vector3f(-110,-10,-20);
        tree13.setLocalTranslation(treeLoc13);
        
        Spatial tree14 = asset.loadModel("Models/Beech/Beech.j3o");
        tree14.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree14.scale(5.0f);
        jungleNode.attachChild(tree14);
        Vector3f treeLoc14 = new Vector3f(-85,-10,-5);
        tree14.setLocalTranslation(treeLoc14);
        
        Spatial tree15 = asset.loadModel("Models/Beech/Beech.j3o");
        tree15.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree15.scale(5.0f);
        jungleNode.attachChild(tree15);
        Vector3f treeLoc15 = new Vector3f(-65,-10,-30);
        tree15.setLocalTranslation(treeLoc15);
        
        Spatial tree16 = asset.loadModel("Models/Beech/Beech.j3o");
        tree16.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree16.scale(5.0f);
        jungleNode.attachChild(tree16);
        Vector3f treeLoc16 = new Vector3f(-85,-10,-60);
        tree16.setLocalTranslation(treeLoc16);
        
        Spatial tree17 = asset.loadModel("Models/Beech/Beech.j3o");
        tree17.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree17.scale(5.0f);
        jungleNode.attachChild(tree17);
        Vector3f treeLoc17 = new Vector3f(-70,-10,-75);
        tree17.setLocalTranslation(treeLoc17);
        
        Spatial tree18 = asset.loadModel("Models/Beech/Beech.j3o");
        tree18.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree18.scale(5.0f);
        jungleNode.attachChild(tree18);
        Vector3f treeLoc18 = new Vector3f(-60,-10,-105);
        tree18.setLocalTranslation(treeLoc18);
        
        Spatial tree19 = asset.loadModel("Models/Beech/Beech.j3o");
        tree19.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree19.scale(5.0f);
        jungleNode.attachChild(tree19);
        Vector3f treeLoc19 = new Vector3f(-5,-10,-80);
        tree19.setLocalTranslation(treeLoc19);
        
        Spatial tree20 = asset.loadModel("Models/Beech/Beech.j3o");
        tree20.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree20.scale(5.0f);
        jungleNode.attachChild(tree20);
        Vector3f treeLoc20 = new Vector3f(-60,-10,-50);
        tree20.setLocalTranslation(treeLoc20);
        
        Spatial tree21 = asset.loadModel("Models/Beech/Beech.j3o");
        tree21.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree21.scale(5.0f);
        jungleNode.attachChild(tree21);
        Vector3f treeLoc21 = new Vector3f(-40,-10,-95);
        tree21.setLocalTranslation(treeLoc21);
        
        Spatial tree22 = asset.loadModel("Models/Beech/Beech.j3o");
        tree22.setQueueBucket(RenderQueue.Bucket.Transparent);
        tree22.scale(5.0f);
        //jungleNode.attachChild(tree22);
        Vector3f treeLoc22 = new Vector3f(55,-10,75);
        tree22.setLocalTranslation(treeLoc22);
    }
    
}
