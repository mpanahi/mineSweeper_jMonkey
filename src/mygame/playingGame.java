
package mygame;

import com.jme3.collision.CollisionResults;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.input.controls.Trigger;
import com.jme3.material.Material;
import com.jme3.material.RenderState;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Ray;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Quad;
import com.jme3.texture.Texture;
import java.awt.Color;
import javax.swing.JLabel;
import static mygame.Main.mineNo;


public class playingGame {
 
    public void Inactive(Geometry target){
            Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
          mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
      Texture wood = Jungle.manager.loadTexture(
            "Textures/flaggywood.jpg");
     mat.setTexture("ColorMap", wood);
          int f1=Integer.valueOf((target.getName()).substring(0,1));
                 
                     int f2=Integer.valueOf((target.getName()).substring(1,2));
                   
                      int f3=Integer.valueOf((target.getName()).substring(2));
                      gameCube.state[f1][f2][f3]="f";
  
                        target.setMaterial(mat);
                        Game.mineNoInactived=Game.mineNoInactived+1.0;
                        mineNo.setText(String.valueOf((int)(Game.mineNoInactived))+"/"+"12");
    
    
    }
     public void redo(){
           for(int i=0;i<=3;i++){
           for(int j=0;j<=3;j++){
             for(int k=0;k<=5;k++){
               gameCube.state[i][j][k]=gameCaretaker.gameStateredo[i][j][k];
             
             }}}
     
       for(int i=0;i<=3;i++){
           for(int j=0;j<=3;j++){
             for(int k=0;k<=5;k++){
                 
               if(gameCube.state[i][j][k]=="f"){
                   Texture wood1 = Jungle.manager.loadTexture(
            "Textures/bombywood.jpg");
                       Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                 mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
      Texture wood = Jungle.manager.loadTexture(
            "Textures/flaggywood.jpg");
     mat.setTexture("ColorMap", wood);
     gameCube.cube[i][j][k].setMaterial(mat);
               }
                 if(gameCube.state[i][j][k]=="mu"){
                       Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
   
      mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  Texture wood1 = Jungle.manager.loadTexture(
            "Textures/bombywood.jpg");
     mat.setTexture("ColorMap", wood1);
                   gameCube.cube[i][j][k].setMaterial(mat);
                 }
                   if(gameCube.state[i][j][k]=="u"){
                        Material matUncover = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      Texture woodUncover = Jungle.manager.loadTexture(
            "Textures/uncover.jpg");
                         matUncover.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matUncover.setTexture("ColorMap", woodUncover);
                     gameCube.cube[i][j][k].setMaterial(matUncover);
                   }
                   if(gameCube.state[i][j][k]=="1u"){
                         Texture woodNo1 = Jungle.manager.loadTexture(
            "Textures/number1.jpg");
     Material matNo1 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                          matNo1.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo1.setTexture("ColorMap", woodNo1);
                     gameCube.cube[i][j][k].setMaterial(matNo1);
                   
                   }
                    if(gameCube.state[i][j][k]=="2u"){
                           
    Texture woodNo2 = Jungle.manager.loadTexture(
            "Textures/number2.jpg");
     Material matNo2 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                            matNo2.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo2.setTexture("ColorMap", woodNo2);
                       gameCube.cube[i][j][k].setMaterial(matNo2);
                     }
                       if(gameCube.state[i][j][k]=="3u"){
                            Texture woodNo3 = Jungle.manager.loadTexture(
            "Textures/number3.jpg");
     Material matNo3 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                              matNo3.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo3.setTexture("ColorMap", woodNo3);
                         gameCube.cube[i][j][k].setMaterial(matNo3);
                       
                       }
                         if(gameCube.state[i][j][k]=="4u"){
                              Texture woodNo4 = Jungle.manager.loadTexture(
            "Textures/number4.jpg");
     Material matNo4 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                matNo4.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo4.setTexture("ColorMap", woodNo4);
                           gameCube.cube[i][j][k].setMaterial(matNo4);
                         }
                           if(gameCube.state[i][j][k]=="5u"){
                                     Texture woodNo5 = Jungle.manager.loadTexture(
            "Textures/number5.jpg");
     Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                  matNo5.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo5.setTexture("ColorMap", woodNo5);
                             gameCube.cube[i][j][k].setMaterial(matNo5);
                           }
                            if(gameCube.state[i][j][k]=="6u"){
                                   Texture woodNo6 = Jungle.manager.loadTexture(
            "Textures/6.jpg");
     Material matNo6 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                    matNo6.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo6.setTexture("ColorMap", woodNo6);
                               gameCube.cube[i][j][k].setMaterial(matNo6);
                             
                             }
                               if(gameCube.state[i][j][k]=="7u"){
                                           Texture woodNo7 = Jungle.manager.loadTexture(
            "Textures/7.jpg");
     Material matNo7 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                   matNo7.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo7.setTexture("ColorMap", woodNo7);
                                 gameCube.cube[i][j][k].setMaterial(matNo7);
                               }
                                 if(gameCube.state[i][j][k]=="8u"){
                                            Texture woodNo8 = Jungle.manager.loadTexture(
            "Textures/8.jpg");
     Material matNo8 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                          matNo8.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
   
     matNo8.setTexture("ColorMap", woodNo8);
                                   gameCube.cube[i][j][k].setMaterial(matNo8);
                                 }
                          if(gameCube.state[i][j][k]!="8u"&&gameCube.state[i][j][k]!="7u"&&gameCube.state[i][j][k]!="6u"&&gameCube.state[i][j][k]!="5u"&&gameCube.state[i][j][k]!="4u"&&gameCube.state[i][j][k]!="3u"&&gameCube.state[i][j][k]!="2u"&&gameCube.state[i][j][k]!="1u"&&gameCube.state[i][j][k]!="mu"&&gameCube.state[i][j][k]!="u"&&gameCube.state[i][j][k]!="f"){
                                Texture wood = Jungle.manager.loadTexture(
            "Textures/wood.jpg");
  
    Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
   mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
     mat.setTexture("ColorMap", wood);
      gameCube.cube[i][j][k].setMaterial(mat);
                                }         
           }  
           }
       }
       
       }
       public void undo(){
       for(int i=0;i<=3;i++){
           for(int j=0;j<=3;j++){
             for(int k=0;k<=5;k++){
                 
               if(gameCube.state[i][j][k]=="f"){
        
                       Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                 mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
      Texture wood = Jungle.manager.loadTexture(
            "Textures/flaggywood.jpg");
     mat.setTexture("ColorMap", wood);
     gameCube.cube[i][j][k].setMaterial(mat);
               }
                 if(gameCube.state[i][j][k]=="mu"){
                       Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
   
      mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  Texture wood1 = Jungle.manager.loadTexture(
            "Textures/bombywood.jpg");
     mat.setTexture("ColorMap", wood1);
                   gameCube.cube[i][j][k].setMaterial(mat);
                 }
                   if(gameCube.state[i][j][k]=="u"){
                        Material matUncover = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      Texture woodUncover = Jungle.manager.loadTexture(
            "Textures/uncover.jpg");
                         matUncover.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matUncover.setTexture("ColorMap", woodUncover);
                     gameCube.cube[i][j][k].setMaterial(matUncover);
                   }
                   if(gameCube.state[i][j][k]=="1u"){
                         Texture woodNo1 = Jungle.manager.loadTexture(
            "Textures/number1.jpg");
     Material matNo1 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                          matNo1.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo1.setTexture("ColorMap", woodNo1);
                     gameCube.cube[i][j][k].setMaterial(matNo1);
                   
                   }
                    if(gameCube.state[i][j][k]=="2u"){
                           
    Texture woodNo2 = Jungle.manager.loadTexture(
            "Textures/number2.jpg");
     Material matNo2 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                            matNo2.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo2.setTexture("ColorMap", woodNo2);
                       gameCube.cube[i][j][k].setMaterial(matNo2);
                     }
                       if(gameCube.state[i][j][k]=="3u"){
                            Texture woodNo3 = Jungle.manager.loadTexture(
            "Textures/number3.jpg");
     Material matNo3 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                              matNo3.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo3.setTexture("ColorMap", woodNo3);
                         gameCube.cube[i][j][k].setMaterial(matNo3);
                       
                       }
                         if(gameCube.state[i][j][k]=="4u"){
                              Texture woodNo4 = Jungle.manager.loadTexture(
            "Textures/number4.jpg");
     Material matNo4 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                matNo4.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo4.setTexture("ColorMap", woodNo4);
                           gameCube.cube[i][j][k].setMaterial(matNo4);
                         }
                           if(gameCube.state[i][j][k]=="5u"){
                                     Texture woodNo5 = Jungle.manager.loadTexture(
            "Textures/number5.jpg");
     Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                  matNo5.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo5.setTexture("ColorMap", woodNo5);
                             gameCube.cube[i][j][k].setMaterial(matNo5);
                           }
                            if(gameCube.state[i][j][k]=="6u"){
                                   Texture woodNo6 = Jungle.manager.loadTexture(
            "Textures/6.jpg");
     Material matNo6 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                    matNo6.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo6.setTexture("ColorMap", woodNo6);
                               gameCube.cube[i][j][k].setMaterial(matNo6);
                             
                             }
                               if(gameCube.state[i][j][k]=="7u"){
                                           Texture woodNo7 = Jungle.manager.loadTexture(
            "Textures/7.jpg");
     Material matNo7 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                   matNo7.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo7.setTexture("ColorMap", woodNo7);
                                 gameCube.cube[i][j][k].setMaterial(matNo7);
                               }
                                 if(gameCube.state[i][j][k]=="8u"){
                                            Texture woodNo8 = Jungle.manager.loadTexture(
            "Textures/8.jpg");
     Material matNo8 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                                          matNo8.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
   
     matNo8.setTexture("ColorMap", woodNo8);
                                   gameCube.cube[i][j][k].setMaterial(matNo8);
                                 }
                          if(gameCube.state[i][j][k]!="8u"&&gameCube.state[i][j][k]!="7u"&&gameCube.state[i][j][k]!="6u"&&gameCube.state[i][j][k]!="5u"&&gameCube.state[i][j][k]!="4u"&&gameCube.state[i][j][k]!="3u"&&gameCube.state[i][j][k]!="2u"&&gameCube.state[i][j][k]!="1u"&&gameCube.state[i][j][k]!="mu"&&gameCube.state[i][j][k]!="u"&&gameCube.state[i][j][k]!="f"){
                                Texture wood = Jungle.manager.loadTexture(
            "Textures/wood.jpg");
  
    Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
   mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
     mat.setTexture("ColorMap", wood);
      gameCube.cube[i][j][k].setMaterial(mat);
                                }         
           }  
           }
       }
       
       }
    public void mark(Geometry target){
    
     int f1=Integer.valueOf((target.getName()).substring(0,1));
                 
                     int f2=Integer.valueOf((target.getName()).substring(1,2));
                   
                      int f3=Integer.valueOf((target.getName()).substring(2));
                   
                    if(gameCube.state[f1][f2][f3]=="m"){
                     
    Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
   
      mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  Texture wood1 = Jungle.manager.loadTexture(
            "Textures/bombywood.jpg");
     mat.setTexture("ColorMap", wood1);
                        target.setMaterial(mat);
                        for(int i=0;i<=3;i++){
                            for(int j=0;j<=3;j++){
                            for(int k=0;k<=5;k++){
                            if(gameCube.state[i][j][k]=="m"){
                            gameCube.cube[i][j][k].setMaterial(mat);
                            gameCube.state[i][j][k]="mu";
                            
                           }
                            
                            }
                            }
                        }
                       
     
      
                    }
     if(gameCube.state[f1][f2][f3]=="1"){
         System.out.println("asd");
                        gameCube.state [f1][f2][f3]="1u";
                            Texture woodNo1 = Jungle.manager.loadTexture(
            "Textures/number1.jpg");
     Material matNo1 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo1.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  
   
  
     matNo1.setTexture("ColorMap", woodNo1);
     
                        target.setMaterial(matNo1);
                      
                      }
                        if(gameCube.state[f1][f2][f3]=="2"){
                            gameCube.state [f1][f2][f3]="2u";
                                
    Texture woodNo2 = Jungle.manager.loadTexture(
            "Textures/number2.jpg");
     Material matNo2 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                         //Material matNo2 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo2.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  
     matNo2.setTexture("ColorMap", woodNo2);
     
                        gameCube.cube[f1][f2][f3].setMaterial(matNo2);
                      
                      }
                          if(gameCube.state[f1][f2][f3]=="3"){
                              gameCube.state [f1][f2][f3]="3u";
                                Texture woodNo3 = Jungle.manager.loadTexture(
            "Textures/number3.jpg");
     Material matNo3 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                         //  Material matNo3 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo3.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
 
      matNo3.setTexture("ColorMap", woodNo3);
                        gameCube.cube[f1][f2][f3].setMaterial(matNo3);
                      
                      }
                          if(gameCube.state[f1][f2][f3]=="4"){
                                  Texture woodNo4 = Jungle.manager.loadTexture(
            "Textures/number4.jpg");
     Material matNo4 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                              gameCube.state [f1][f2][f3]="4u";
                   
      matNo4.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

      matNo4.setTexture("ColorMap", woodNo4);
                        gameCube.cube[f1][f2][f3].setMaterial(matNo4);
                      
                      }
                            if(gameCube.state[f1][f2][f3]=="5"){
                                gameCube.state [f1][f2][f3]="5u";
                                       Texture woodNo5 = Jungle.manager.loadTexture(
            "Textures/number5.jpg");
     Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                          // Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo5.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  
      matNo5.setTexture("ColorMap", woodNo5);
                        gameCube.cube[f1][f2][f3].setMaterial(matNo5);
                      
                      }
     if(gameCube.state[f1][f2][f3]=="6"){
         gameCube.state [f1][f2][f3]="6u";
             Texture woodNo6 = Jungle.manager.loadTexture(
            "Textures/6.jpg");
     Material matNo6 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                   
      matNo6.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
 
      matNo6.setTexture("ColorMap", woodNo6);
                        gameCube.cube[f1][f2][f3].setMaterial(matNo6);
                      
                      }
    if(gameCube.state[f1][f2][f3]=="7"){
        gameCube.state [f1][f2][f3]="7u";
                 Texture woodNo7 = Jungle.manager.loadTexture(
            "Textures/7.jpg");
     Material matNo7 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                          // Material matNo7 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo7.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  
      matNo7.setTexture("ColorMap", woodNo7);
                        gameCube.cube[f1][f2][f3].setMaterial(matNo7);
                      
                      }
    if(gameCube.state[f1][f2][f3]=="8"){
        gameCube.state [f1][f2][f3]="8u";
                Texture woodNo8 = Jungle.manager.loadTexture(
            "Textures/8.jpg");
     Material matNo8 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                 
      matNo8.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  
      matNo8.setTexture("ColorMap", woodNo8);
                        gameCube.cube[f1][f2][f3].setMaterial(matNo8);
                      
                      }
       if(gameCube.state[f1][f2][f3]=="0"){
                               
                             
     iteration(f1,f2,f3);
                          
                           
                     } 
    }

       
       private void iteration(int f1,int f2,int f3)  {
           String status;
            Material matUncover = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      Texture woodUncover = Jungle.manager.loadTexture(
            "Textures/uncover.jpg");
      matUncover.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matUncover.setTexture("ColorMap", woodUncover);
     gameCube.cube[f1][f2][f3].setMaterial(matUncover);
      gameCube.state[f1][f2][f3]="u";
      cubicIterator iterator=new cubicIterator();
     status= iterator.nextUp(f1, f2, f3);
      if(iterator.hasNext(status)==true){
      iteration(cubicIterator.r,cubicIterator.c,cubicIterator.h);
      }
      else{
      setState(status);
      
      
      }
       status= iterator.nextDown(f1, f2, f3);
      if(iterator.hasNext(status)==true){
      iteration(cubicIterator.r,cubicIterator.c,cubicIterator.h);
      }
      else{
      setState(status);
      
      
      }
       status= iterator.nextEast(f1, f2, f3);
      if(iterator.hasNext(status)==true){
      iteration(cubicIterator.r,cubicIterator.c,cubicIterator.h);
      }
      else{
      setState(status);
      
      
      }
       status= iterator.nextWest(f1, f2, f3);
      if(iterator.hasNext(status)==true){
      iteration(cubicIterator.r,cubicIterator.c,cubicIterator.h);
      }
      else{
      setState(status);
      
      
      }
       status= iterator.nextUpEast(f1, f2, f3);
      if(iterator.hasNext(status)==true){
      iteration(cubicIterator.r,cubicIterator.c,cubicIterator.h);
      }
      else{
      setState(status);
      
      
      }
       status= iterator.nextUpWest(f1, f2, f3);
      if(iterator.hasNext(status)==true){
      iteration(cubicIterator.r,cubicIterator.c,cubicIterator.h);
      }
      else{
      setState(status);
      
      
      }
       status= iterator.nextDownEast(f1, f2, f3);
      if(iterator.hasNext(status)==true){
      iteration(cubicIterator.r,cubicIterator.c,cubicIterator.h);
      }
      else{
      setState(status);
      
      
      }
       status= iterator.nextDownWest(f1, f2, f3);
      if(iterator.hasNext(status)==true){
      iteration(cubicIterator.r,cubicIterator.c,cubicIterator.h);
      }
      else{
      setState(status);
      
      
      }
    
       
       
       }   
           
         private void setState(String s) {
         
         	  if(s=="1"){
                          Texture woodNo1 = Jungle.manager.loadTexture(
            "Textures/number1.jpg");
     Material matNo1 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                    //Material matNo1 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo1.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
 
   
  
     matNo1.setTexture("ColorMap", woodNo1);
     gameCube.cube[cubicIterator.r][cubicIterator.c][cubicIterator.h].setMaterial(matNo1);
     gameCube.state[cubicIterator.r][cubicIterator.c][cubicIterator.h]="1u";
           }
                 if(s=="2"){
                         
    Texture woodNo2 = Jungle.manager.loadTexture(
            "Textures/number2.jpg");
     Material matNo2 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                   //  Material matNo2 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo2.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
 
   
  
     matNo2.setTexture("ColorMap", woodNo2);
     gameCube.cube[cubicIterator.r][cubicIterator.c][cubicIterator.h].setMaterial(matNo2);
     gameCube.state[cubicIterator.r][cubicIterator.c][cubicIterator.h]="2u";
           }
                  if(s=="3"){
                        Texture woodNo3 = Jungle.manager.loadTexture(
            "Textures/number3.jpg");
     Material matNo3 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                    // Material matNo3 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo3.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo3.setTexture("ColorMap", woodNo3);
     gameCube.cube[cubicIterator.r][cubicIterator.c][cubicIterator.h].setMaterial(matNo3);
     gameCube.state[cubicIterator.r][cubicIterator.c][cubicIterator.h]="3u";
           }
                 if(s=="4"){
                         Texture woodNo4 = Jungle.manager.loadTexture(
            "Textures/number4.jpg");
     Material matNo4 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                   //  Material matNo4 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo4.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
  
   
  
     matNo4.setTexture("ColorMap", woodNo4);
     gameCube.cube[cubicIterator.r][cubicIterator.c][cubicIterator.h].setMaterial(matNo4);
     gameCube.state[cubicIterator.r][cubicIterator.c][cubicIterator.h]="4u";
           }
                  if(s=="5"){
                             Texture woodNo5 = Jungle.manager.loadTexture(
            "Textures/number5.jpg");
     Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                    // Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo5.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
 
   
  
     matNo5.setTexture("ColorMap", woodNo5);
     gameCube.cube[cubicIterator.r][cubicIterator.c][cubicIterator.h].setMaterial(matNo5);
     gameCube.state[cubicIterator.r][cubicIterator.c][cubicIterator.h]="5u";
           }
           if(s=="6"){
                   Texture woodNo6 = Jungle.manager.loadTexture(
            "Textures/6.jpg");
     Material matNo6 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                    // Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo6.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo6.setTexture("ColorMap", woodNo6);
     gameCube.cube[cubicIterator.r][cubicIterator.c][cubicIterator.h].setMaterial(matNo6);
     gameCube.state[cubicIterator.r][cubicIterator.c][cubicIterator.h]="6u";
           }
           if(s=="7"){
                        Texture woodNo7 = Jungle.manager.loadTexture(
            "Textures/7.jpg");
     Material matNo7 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                    // Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo7.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

   
  
     matNo7.setTexture("ColorMap", woodNo7);
     gameCube.cube[cubicIterator.r][cubicIterator.c][cubicIterator.h].setMaterial(matNo7);
     gameCube.state[cubicIterator.r][cubicIterator.c][cubicIterator.h]="7u";
           }
           if(s=="8"){
                       Texture woodNo8 = Jungle.manager.loadTexture(
            "Textures/8.jpg");
     Material matNo8 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
                    // Material matNo5 = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
      matNo8.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
   
   
  
     matNo8.setTexture("ColorMap", woodNo8);
     gameCube.cube[cubicIterator.r][cubicIterator.c][cubicIterator.h].setMaterial(matNo8);
     gameCube.state[cubicIterator.r][cubicIterator.c][cubicIterator.h]="8u";
           }
         
         }        
             public  String[][][] createMemento(){
             
             Memento gameMemento=new  Memento();
             return gameMemento.gameState;
             }   
                public void setMemento(String[][][] gameState){
                       for(int i=0;i<=3;i++){
                        for(int j=0;j<=3;j++){
                            for(int k=0;k<=5;k++){
                             gameCaretaker.gameStateredo[i][j][k]= gameCube.state[i][j][k];
                            
                            }}}
                    for(int i=0;i<=3;i++){
                        for(int j=0;j<=3;j++){
                            for(int k=0;k<=5;k++){
                               
                                   gameCube.state[i][j][k]=gameCaretaker.gameState[i][j][k];
                    }
                    }
                    }
             
                }       
         private class Memento{
             String[][][] gameState =new String[4][4][6];
             private Memento(){
                 for(int i=0;i<=3;i++){
                        for(int j=0;j<=3;j++){
                            for(int k=0;k<=5;k++){
                                   this.gameState[i][j][k]=gameCube.state[i][j][k];
                    }
                    }
                 }
             }
   
   } 
    
          
}
                    
                   
                    
                     
    

