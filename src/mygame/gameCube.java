
package mygame;

import com.jme3.collision.CollisionResults;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.AnalogListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.Trigger;
import com.jme3.material.Material;
import com.jme3.material.RenderState;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Quad;
import com.jme3.texture.Texture;
import com.jme3.input.InputManager;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.math.Ray;
import com.jme3.math.Vector2f;

public class gameCube {
    static String[][][] state =new String[4][4][6];
    InputManager input;
      private final static Trigger TRIGGER_SUSPECT =    new MouseButtonTrigger(MouseInput.BUTTON_RIGHT);
    private final static String MAPPING_SUSPECT = "Chosen";
      private final static Trigger TRIGGER_UNCOVER =    new MouseButtonTrigger(MouseInput.BUTTON_LEFT);
    private final static String MAPPING_UNCOVER = "Chosen1";
    private final static Trigger TRIGGER_ROTATE_DOWN =    new KeyTrigger(KeyInput.KEY_DOWN);
       private final static String MAPPING_ROTATE_DOWN = "RotateDown";
         private final static Trigger TRIGGER_ROTATE_UP =    new KeyTrigger(KeyInput.KEY_UP);
       private final static String MAPPING_ROTATE_UP = "RotateUp";
        private final static Trigger TRIGGER_ROTATE_LEFT =    new KeyTrigger(KeyInput.KEY_LEFT);
       private final static String MAPPING_ROTATE_LEFT = "RotateLeft";
               private final static Trigger TRIGGER_ROTATE_RIGHT =    new KeyTrigger(KeyInput.KEY_RIGHT);
       private final static String MAPPING_ROTATE_RIGHT = "RotateRight";
     float r = FastMath.DEG_TO_RAD * 90f;
  float r1 = FastMath.DEG_TO_RAD * -90f;
  int k;
   
     Node pivot1 = new Node("pivot");//for each rotated page page
  Node pivot2 = new Node("pivot");//for each rotated page
   Node pivot3 = new Node("pivot");// for each rotated page
    Node pivot4 = new Node("pivot");
     Node pivot5 = new Node("pivot");
      Node pivot6 = new Node("pivot");
      Node pivot7 = new Node("pivot");
         static Geometry[][][] cube =new Geometry[4][4][6];
    public Geometry[] quads = new Geometry[96];
    public gameCube(){
        
        Quad q=new Quad(1,1);
     
gameQuad geom = new gameQuad("quad", q);

for( int i=0;i<=95;i++){
 quads[i]= geom.clone();


}
   Texture wood = Jungle.manager.loadTexture(
            "Textures/wood.jpg");
  
    Material mat = new Material(Jungle.manager, "Common/MatDefs/Misc/Unshaded.j3md");
  
     mat.setTexture("ColorMap", wood);
      mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
       for(int i=0;i<=3;i++){
      
      k=4*i;
      
  for(int j=0;j<=3;j++){
    quads[j+k].setLocalTranslation(new Vector3f(0.5f+j,3.5f-i,0));
     //quads[j+k].rotate(0.0f, r, 0.0f);
   
           
    quads[j+k].setMaterial(mat);
    
      pivot1.attachChild(quads[j+k]);
     
  }
  }
  int count=0;
  for(int j=0;j<=3;j++){
  for(int i=0;i<=3;i++){
     
  cube[j][i][0]=quads[count];
   
  cube[j][i][0].setName(Integer.toString(j)+Integer.toString(i)+"0");
  
 
          count=count+1;
         
  }
  }
   pivot1.setLocalTranslation(new Vector3f(-2.5f,-2,0));
  //back page
  for(int i=0;i<=3;i++){
      
      k=4*i;
      
  for(int j=0;j<=3;j++){
    quads[16+j+k].setLocalTranslation(new Vector3f(0.5f+j,3.5f-i,2));
   
   
           
    quads[16+j+k].setMaterial(mat);
    
    
      pivot2.attachChild(quads[16+j+k]);
     
  }
  }
  int count1=16;
  for(int j=0;j<=3;j++){
  for(int i=0;i<=3;i++){
     
  cube[j][i][1]=quads[count1];
   cube[j][i][1].setName(Integer.toString(j)+Integer.toString(i)+"1");
          count1=count1+1;
  }
  }
   pivot2.setLocalTranslation(new Vector3f(-2.5f,-2,-6));
 
  //left page
   for(int i=0;i<=3;i++){
      
      k=4*i;
      
  for(int j=0;j<=3;j++){
    quads[32+j+k].setLocalTranslation(new Vector3f(4.5f+j,3.5f-i,0));
     
    
           
    quads[32+j+k].setMaterial(mat);
    
      pivot3.attachChild(quads[32+j+k]);
     
  }
  }
   int count2=32;
  for(int j=0;j<=3;j++){
  for(int i=0;i<=3;i++){
     
  cube[j][i][2]=quads[count2];
   cube[j][i][2].setName(Integer.toString(j)+Integer.toString(i)+"2");
          count2=count2+1;
  }
  }
      pivot3.setLocalTranslation(new Vector3f(-2.5f,-2,0));
      pivot3.rotate(0.0f, r1, 0.0f);
        pivot3.setLocalTranslation(new Vector3f(-2.0f,-2,-8.5f));
        
      
       
   //right page
   for(int i=0;i<=3;i++){
      
      k=4*i;
      
  for(int j=0;j<=3;j++){
    quads[48+j+k].setLocalTranslation(new Vector3f(-3.5f+j,3.5f-i,0));
 
   
           
    quads[48+j+k].setMaterial(mat);
   
     pivot4.attachChild(quads[48+j+k]);
  }
  }
    pivot4.setLocalTranslation(new Vector3f(5.5f,-2,0));
      pivot4.rotate(0.0f, r1, 0.0f);
      pivot4.move(-3.5f,0.0f,-0.5f);
      int count3=48;
  for(int j=0;j<=3;j++){
  for(int i=0;i<=3;i++){
     
  cube[j][i][3]=quads[count3];
   cube[j][i][3].setName(Integer.toString(j)+Integer.toString(i)+"3");
          count3=count3+1;
  }
  }
      
   
   //up page
   for(int i=0;i<=3;i++){
      
      k=4*i;
      
  for(int j=0;j<=3;j++){
    quads[64+j+k].setLocalTranslation(new Vector3f(4.5f+j,7.5f-i,0));
    
    
           
    quads[64+j+k].setMaterial(mat);
  
      pivot5.attachChild(quads[64+j+k]);
  }
  }
 
    pivot5.setLocalTranslation(new Vector3f(-2.5f,2,-6));
    pivot5.rotate(r,0.0f,0);
    pivot5.move(-4,0.5f,-2.5f);
    int count4=64;
  for(int j=0;j<=3;j++){
  for(int i=0;i<=3;i++){
     
  cube[j][i][4]=quads[count4];
   cube[j][i][4].setName(Integer.toString(j)+Integer.toString(i)+"4");
          count4=count4+1;
  }
  }
        //down page
        for(int i=0;i<=3;i++){
      
      k=4*i;
      
  for(int j=0;j<=3;j++){
    quads[80+j+k].setLocalTranslation(new Vector3f(-3.5f+j,-0.5f-i,0));
  
   
           
    quads[80+j+k].setMaterial(mat);
   
      pivot6.attachChild(quads[80+j+k]);
  }
  }
        pivot6.setLocalTranslation(new Vector3f(-2.5f,2,-6));
    pivot6.rotate(r,0.0f,0);
    pivot6.move(4,-3.5f,5.5f);
       int count5=80;
  for(int j=0;j<=3;j++){
  for(int i=0;i<=3;i++){
     
  cube[j][i][5]=quads[count5];
   cube[j][i][5].setName(Integer.toString(j)+Integer.toString(i)+"5");
          count5=count5+1;
  }
  }
  pivot7.attachChild(pivot1);
          pivot7.attachChild(pivot2);
             pivot7.attachChild(pivot3);
                pivot7.attachChild(pivot4);
                 pivot7.attachChild(pivot5);
                  pivot7.attachChild(pivot6);
                 pivot7.setLocalTranslation(new Vector3f(0,0,-8));
                  Game.input.addMapping(MAPPING_ROTATE_UP, TRIGGER_ROTATE_UP);
       Game.input.addMapping(MAPPING_ROTATE_DOWN, TRIGGER_ROTATE_DOWN);
        Game.input.addMapping(MAPPING_ROTATE_RIGHT, TRIGGER_ROTATE_RIGHT);
        Game.input.addMapping(MAPPING_ROTATE_LEFT, TRIGGER_ROTATE_LEFT);
         Game.input.addMapping(MAPPING_SUSPECT, TRIGGER_SUSPECT);
      Game.input.addMapping(MAPPING_UNCOVER, TRIGGER_UNCOVER);
       Game.input.addListener(actionListener,    new String[]{MAPPING_SUSPECT});
      Game.input.addListener(actionListener,    new String[]{MAPPING_UNCOVER});
     Game.input.addListener(analogListener,     new String[]{MAPPING_ROTATE_UP});
     Game.input.addListener(analogListener,     new String[]{MAPPING_ROTATE_DOWN});
     Game.input.addListener(analogListener,     new String[]{MAPPING_ROTATE_LEFT});
     Game. input.addListener(analogListener,     new String[]{MAPPING_ROTATE_RIGHT});
                       Main.app.getRootNode().attachChild (pivot7);
    }
    private AnalogListener analogListener = new AnalogListener() { 
        
        public void onAnalog(String name, float intensity, float tpf) {
            rotate(name,intensity,tpf);
             
       } };
    private void rotate(String name,float intensity,float tpf){
       
       if (name.equals(MAPPING_ROTATE_UP)) {   
                 // implement action here
                  pivot7.rotate(-intensity, 0, 0);
                 
             }
            if (name.equals(MAPPING_ROTATE_DOWN)) { 
                // implement action here  
                pivot7.rotate(intensity, 0 , 0);
                
            } 
             if (name.equals(MAPPING_ROTATE_RIGHT)) { 
                // implement action here  
                pivot7.rotate(0, 0 , -intensity);
             
            }
              if (name.equals(MAPPING_ROTATE_LEFT)) { 
                // implement action here  
                pivot7.rotate(0, 0 , intensity);
              
            }
       
    
    }
       private ActionListener actionListener = new ActionListener() {
        public void onAction(String name, boolean isPressed, float tpf) {  
            
            if (name.equals(MAPPING_SUSPECT)) {          
                   
                CollisionResults results = new CollisionResults();
                Vector2f click2d = Game.input.getCursorPosition();
                Vector3f click3d =Main.app.getCamera().getWorldCoordinates(    new Vector2f(click2d.getX(), click2d.getY()), 0f);
                Vector3f dir = Main.app.getCamera().getWorldCoordinates(    new Vector2f(click2d.getX(), click2d.getY()), 1f).      subtractLocal(click3d);
                Ray ray = new Ray(click3d, dir);
                 Main.app.getRootNode().collideWith(ray, results);
                if (results.size() > 0) { 
                    Geometry target = results.getClosestCollision().getGeometry();
                    gameCaretaker gameTaker=new  gameCaretaker();
                    gameTaker.inactive(target);
                 
                     
                    
                     } 
                  
                
                       }
            if (name.equals(MAPPING_UNCOVER)) {          
                   
                CollisionResults results = new CollisionResults();
                Vector2f click2d = Game.input.getCursorPosition();
                Vector3f click3d = Main.app.getCamera().getWorldCoordinates(    new Vector2f(click2d.getX(), click2d.getY()), 0f);
                Vector3f dir = Main.app.getCamera().getWorldCoordinates(    new Vector2f(click2d.getX(), click2d.getY()), 1f).      subtractLocal(click3d);
                Ray ray = new Ray(click3d, dir);
                  Main.app.getRootNode().collideWith(ray, results);
                if (results.size() > 0) { 
                    Geometry target = results.getClosestCollision().getGeometry();
                
                     gameCaretaker playing=new gameCaretaker();
                   playing.mark(target);
                  
                }
            }
               
            }
         
   };
       
}
