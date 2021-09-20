/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package mygame;

import com.jme3.input.InputManager;
import com.jme3.material.Material;
import com.jme3.material.RenderState;
import com.jme3.texture.Texture;


public class Game {
     static boolean turnMark=false;
     static boolean turnInactive=false;
    static int finished;
   static double mineNoInactived=0;
    public static InputManager input;
   static gameCube gameCube;
   static GameLevel gameLevel;
    public Game(GameLevel level,InputManager input){
        finished=0;
        this.input=input;
    this.gameLevel=level;
    this.gameCube=new gameCube();
    
    }
    public void start(){
    gameLevel.setLevel();
  
    }
    static void restart(){
          Texture wood = Jungle.manager.loadTexture(
            "Textures/wood.jpg");
  
    Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
  
     mat.setTexture("ColorMap", wood);
      mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
    
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                for(int k=0;k<=5;k++){
                   gameCube.cube[i][j][k] .setMaterial(mat);
            }
        }
        }
    gameLevel.setLevel();
  
    }
    
}
