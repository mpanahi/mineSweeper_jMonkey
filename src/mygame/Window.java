package mygame;
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
import com.jme3.material.Material;
import com.jme3.renderer.Camera;
import com.jme3.terrain.geomipmap.TerrainLodControl;
import com.jme3.terrain.heightmap.AbstractHeightMap;
import com.jme3.terrain.geomipmap.TerrainQuad;
import com.jme3.terrain.geomipmap.lodcalc.DistanceLodCalculator;
import com.jme3.terrain.heightmap.HillHeightMap; 
import com.jme3.terrain.heightmap.ImageBasedHeightMap;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture.WrapMode;
import java.util.ArrayList;
import java.util.List;
import java.awt.ImageCapabilities;

public class Window extends JFrame implements GameComponent  {
    private static Window uniqueInstance = new Window();
    public static Window instance() {
return uniqueInstance;
}
   private Window() {
  JFrame  window = new JFrame();
   }
   @Override
   public void operation(){}

} 

