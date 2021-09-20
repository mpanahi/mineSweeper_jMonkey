package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.Trigger;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.renderer.queue.RenderQueue.Bucket;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
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
import com.jme3.input.InputManager;
import com.jme3.material.Material;
import com.jme3.renderer.Camera;
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
/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {
static JLabel levelText1;
    static EasyLevel easy;
   static InputManager input;
    static Window w;
   static JLabel mineNo;
    static Material mat;
     private TerrainQuad terrain;
  Material mat_terrain;
   
static Main app;
    public static void main(String[] args) {
     
        AppSettings settings = new AppSettings(true);
settings.setWidth(640);
settings.setHeight(480);
 app = new Main();
app.setSettings(settings);
app.createCanvas();
JmeCanvasContext ctx = (JmeCanvasContext) app.getContext();
ctx.setSystemListener(app);
Dimension dim = new Dimension(640, 480);
ctx.getCanvas().setPreferredSize(dim);

w = Window.instance();//unique instance of window

  JMenuBar menubar = new JMenuBar();
  CommandMenuModel1 m1=new CommandMenuModel1(menubar);
 SettingMenuModel1 m2=new SettingMenuModel1(menubar);
       
            for(int i=0;i<30;i++){
             JMenu shiftToRight1 = new JMenu("");
             menubar.add(shiftToRight1);
            }
             
          JLabel level=new JLabel();
        level.setText("level:");
        menubar.add(level);
          levelText1=new JLabel();
       levelText1.setText("Easy");
       
        menubar.add(levelText1);
        for(int i=0;i<5;i++){
        JMenu shiftToRight1 = new JMenu("");
             menubar.add(shiftToRight1);
        }
         JLabel mine=new JLabel();
        mine.setText("mines:");
        menubar.add(mine);
         mineNo =new JLabel();
       mineNo.setText("0/12");
        menubar.add(mineNo);
w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
w.add(ctx.getCanvas());
w.setJMenuBar(menubar);

w.pack();
w.setTitle("Minesweeper3D");
w.setVisible(true);

app.startCanvas();

    }
   
    
    @Override
    public void simpleInitApp() {
        setDisplayFps(false);
setDisplayStatView(false);
        easy=new EasyLevel();
        flyCam.setDragToRotate(true); 
        inputManager.setCursorVisible(true);
               
    Jungle board=new Jungle(assetManager,app);
    board.setBoard();
              
                Game mineSweeperGame=new Game(easy,inputManager);
      input=Game.input;
      mineSweeperGame.start();
    }
         

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
