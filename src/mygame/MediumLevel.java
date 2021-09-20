/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dell
 */
public class MediumLevel implements GameLevel{
        public void setLevel(){
    
     for(int k=0;k<=5;k++){
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
        
   gameCube.state [i][j][k]="0";
           }
    }
    
    }
     checkDirection cd=new checkDirection();
      int size = 96;
int j=1;
int count=0;
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= 96; i++) {
            list.add(i);
        }

        Random rand = new Random();
        while(j<=15) {
            int index = rand.nextInt(list.size());
           // index=index-1;
            
            list.remove(index);
             gameCube.state[(int)(Math.floor((index%16)/4))][((index%16)%4)][(int)(Math.floor(index/16))]="m";
             j=j+1;
        }
        int r=0,c=0,h=0;
   for(int i1=0;i1<=3;i1++){
       for(int i2=0;i2<=3;i2++){
           for(int i3=0;i3<=5;i3++){
               count=0;
               if(gameCube.state[i1][i2][i3]!="m"){
               //check up
               if(cd.checkUp(i1,i2,i3,r,c,h)==true){
               count=count+1;
               //r=i1;c=i2;h=i3;
               }
               //check down
               if(cd.checkDown(i1,i2,i3,r,c,h)==true){
               count=count+1;
                 //r=i1;c=i2;h=i3;
               }
               //check east
                if(cd.checkEast(i1,i2,i3,r,c,h)==true){
               count=count+1;
                // r=i1;c=i2;h=i3;
               }
               //check west
                 if(cd.checkWest(i1,i2,i3,r,c,h)==true){
               count=count+1;
                // r=i1;c=i2;h=i3;
               }
               //check up-east
                  if(cd.checkUpEast(i1,i2,i3,r,c,h)==true){
               count=count+1;
                // r=i1;c=i2;h=i3;
               }
               //check up-west
                   if(cd.checkUpWest(i1,i2,i3,r,c,h)==true){
               count=count+1;
               //  r=i1;c=i2;h=i3;
               }
               //check down-east
                    if(cd.checkDownEast(i1,i2,i3,r,c,h)==true){
               count=count+1;
                // r=i1;c=i2;h=i3;
               }
               //check down-west
                if(cd.checkDownWest(i1,i2,i3,r,c,h)==true){
               count=count+1;
               //  r=i1;c=i2;h=i3;
               }
              if(count>0){
                  System.out.println(count);
                  if(count==1){
                  gameCube.state[i1][i2][i3]="1";
                  }
                  if(count==2){
                  gameCube.state[i1][i2][i3]="2";
                  }
              if(count==3){
                  gameCube.state[i1][i2][i3]="3";
                  }
              if(count==4){
                  gameCube.state[i1][i2][i3]="4";
                  }
              if(count==5){
                  gameCube.state[i1][i2][i3]="5";
                  }
              if(count==6){
                  gameCube.state[i1][i2][i3]="6";
                  }
              if(count==7){
                  gameCube.state[i1][i2][i3]="7";
                  }
              if(count==8){
                  gameCube.state[i1][i2][i3]="8";
                  }
             // System.out.println(EasyState[i1][i2][i3]);
              }
                //
               }
               //up up
                
               
                //
              
               
           }}  }

    
     
     
    
    }
}
