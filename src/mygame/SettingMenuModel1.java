

package mygame;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
import com.jme3.terrain.heightmap.HillHeightMap; // for exercise 2
import com.jme3.terrain.heightmap.ImageBasedHeightMap;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture.WrapMode;
import java.util.ArrayList;
import java.util.List;
import java.awt.ImageCapabilities;

public class SettingMenuModel1 {
    
    static JMenu fileMenu;
    JMenuBar menubar;
    MenuItem jungle;
    MenuItem desrt;
    MenuItem easy;
    MenuItem medium;
    MenuItem hard;
    MenuItem model1;
    MenuItem model2;
    public SettingMenuModel1(JMenuBar menubar1){
      
    this.menubar=menubar1;
       fileMenu = new JMenu("");
 ImageIcon icon1=new ImageIcon("F:\\jmonkeyProject\\Game127\\assets\\Textures\\setting1.png");
   fileMenu.setIcon(icon1);
        JMenu impMenu1 = new JMenu("MenuModel");
        JMenuItem model1 = new JMenuItem("model1");
        
       model1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                
              SettingMenuItem smi=new SettingMenuItem(); 
             
              smi.clicked("model1");
            }
        });
        JMenuItem model2 = new JMenuItem("model2");
    model2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               
                 SettingMenuItem smi=new SettingMenuItem(); 
                 
              smi.clicked("model2");
              
            }
        });

        impMenu1.add(model1);
        impMenu1.add(model2);
       
         JMenu impMenu2 = new JMenu("Board");
         JMenuItem jungle = new JMenuItem("jungle");
         jungle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                SettingMenuItem smi=new SettingMenuItem(); 
                 
              smi.clicked("jungle");
            }
        });
        JMenuItem snow = new JMenuItem("snow");
    snow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                SettingMenuItem smi=new SettingMenuItem(); 
                 
              smi.clicked("snow");
            }
        });

        impMenu2.add(jungle);
        impMenu2.add(snow);
          JMenu impMenu3 = new JMenu("GameLevel");
          JMenuItem easy = new JMenuItem("easy");
          easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                 SettingMenuItem smi=new SettingMenuItem(); 
                 
              smi.clicked("easy");
            }
        });
        JMenuItem medium = new JMenuItem("medium");
        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                 SettingMenuItem smi=new SettingMenuItem(); 
                 
              smi.clicked("medium");
            }
        });
         JMenuItem hard = new JMenuItem("hard");
    hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                 SettingMenuItem smi=new SettingMenuItem(); 
                 
              smi.clicked("hard");
            }
        });

        impMenu3.add(easy);
        impMenu3.add(medium);
          impMenu3.add(hard);
          fileMenu.add(impMenu1);
               fileMenu.addSeparator();
           fileMenu.add(impMenu2);
                fileMenu.addSeparator();
            fileMenu.add(impMenu3);
            menubar.add(fileMenu);
        
        
    
    }
    public static void  setIconModel1(){
    ImageIcon icon1=new ImageIcon("F:\\jmonkeyProject\\Game127\\assets\\Textures\\setting1.png");
   fileMenu.setIcon(icon1);
   ImageIcon icon2=new ImageIcon("F:\\jmonkeyProject\\Game127\\assets\\Textures\\Games-icon.png");
   CommandMenuModel1.file.setIcon(icon2);
    
    }
    public static void  setIconModel2(){
    ImageIcon icon1=new ImageIcon("F:\\jmonkeyProject\\Game127\\assets\\Textures\\setting2.png");
   fileMenu.setIcon(icon1);
    ImageIcon icon2=new ImageIcon("F:\\jmonkeyProject\\Game127\\assets\\Textures\\command2.png");
   CommandMenuModel1.file.setIcon(icon2);
    
    }
    
}
