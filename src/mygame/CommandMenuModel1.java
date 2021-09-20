/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import javax.swing.JMenuBar;
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

public class CommandMenuModel1 {
    static JMenu file;
    JMenuBar menubar;
    MenuItem redo;
    MenuItem undo;
    MenuItem exit;
    public CommandMenuModel1(JMenuBar menubar1){
      
    this.menubar=menubar1;
     file = new JMenu("");
  
   ImageIcon icon=new ImageIcon("F:\\jmonkeyProject\\Game127\\assets\\Textures\\Games-icon.png");
   file.setIcon(icon);
        file.setMnemonic(KeyEvent.VK_F);
        JMenuItem undo = new JMenuItem("undo", null);
        JMenuItem redo = new JMenuItem("redo", null);
         JMenuItem exit = new JMenuItem("Exit", null);
            JMenuItem newGame = new JMenuItem("New Game", null);
        undo.setMnemonic(KeyEvent.VK_E);
        redo.setMnemonic(KeyEvent.VK_E);
        exit.setMnemonic(KeyEvent.VK_E);
        newGame.setMnemonic(KeyEvent.VK_E);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        redo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                CommandMenuItem cmi=new CommandMenuItem(); 
                 
              cmi.clicked("redo");
            }
        });
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                CommandMenuItem cmi=new CommandMenuItem(); 
                 
              cmi.clicked("newGame");
            }
        });
        
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                 CommandMenuItem cmi=new CommandMenuItem(); 
                 
              cmi.clicked("undo");
            }
        });
        file.add(undo);
        file.add(redo);
        file.add(exit);
      file.add(newGame);
    
       
        menubar.add(file);
        
        
    
    }
   
    
}
