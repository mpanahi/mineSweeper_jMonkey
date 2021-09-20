
package mygame;

import com.jme3.material.Material;
import com.jme3.material.RenderState;
import com.jme3.terrain.geomipmap.TerrainLodControl;
import com.jme3.terrain.geomipmap.TerrainQuad;
import com.jme3.terrain.heightmap.AbstractHeightMap;
import com.jme3.terrain.heightmap.ImageBasedHeightMap;
import com.jme3.texture.Texture;

public class Desert extends Board {
     static  TerrainQuad terrain;
    public static void setBoard(){
 
   Material  mat_terrain = new Material(Jungle.manager, 
            "Common/MatDefs/Terrain/Terrain.j3md");
   
    mat_terrain.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
 
    mat_terrain.setTexture("Alpha", Jungle.manager.loadTexture(
            "Textures/Terrain/splat/alphamap.png"));
 
  
    Texture grass = Jungle.manager.loadTexture(
            "Textures/Terrain/splat/grass.jpg");
    grass.setWrap(Texture.WrapMode.Repeat);
    mat_terrain.setTexture("Tex1", grass);
    mat_terrain.setFloat("Tex1Scale", 64f);
 
   
    Texture dirt = Jungle.manager.loadTexture(
            "Textures/Terrain/splat/dirt.jpg");
    dirt.setWrap(Texture.WrapMode.Repeat);
    mat_terrain.setTexture("Tex2", dirt);
    mat_terrain.setFloat("Tex2Scale", 32f);
 
 
    Texture rock = Jungle.manager.loadTexture(
            "Textures/Terrain/splat/grass.jpg");
    rock.setWrap(Texture.WrapMode.Repeat);
    mat_terrain.setTexture("Tex3", rock);
    mat_terrain.setFloat("Tex3Scale", 128f);
 
    /** 2. Create the height map */
    AbstractHeightMap heightmap = null;
    Texture heightMapImage = Jungle.manager.loadTexture(
            "Textures/Terrain/splat/mountains512.png");
    heightmap = new ImageBasedHeightMap(heightMapImage.getImage());
    heightmap.load();
 
    
    int patchSize = 65;
    terrain = new TerrainQuad("my terrain", patchSize, 513, heightmap.getHeightMap());
 
  
    terrain.setMaterial(mat_terrain);
    terrain.setLocalTranslation(0, -150, 0);
    terrain.setLocalScale(2f, 1f, 2f);
   Main.app.getRootNode().attachChild(terrain);
 
  
    TerrainLodControl control = new TerrainLodControl(terrain, Main.app.getCamera());
    terrain.addControl(control);
 }
    
}
