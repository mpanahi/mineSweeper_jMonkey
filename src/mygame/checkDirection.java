
package mygame;


public class checkDirection {
      public Boolean checkUp(int i1,int i2,int i3,int r,int c,int h){
    if((i1+1==4)&& (i3==0)){
               h=5;
               r=0;
               c=i2;
               }
               if((i1+1==4)&& (i3==1)){
               h=5;
               c=i2;
               r=3;
               }
               if((i1+1==4)&& (i3==2)){
               h=5;
               r=3-i2;
               c=0;
               }
               if((i1+1==4)&& (i3==3)){
               h=5;
               r=3-i2;
               c=3;
               }
               if((i1+1==4)&& (i3==4)){
               h=1;
               r=0;
               c=i2;
               }
               if((i1+1==4)&& (i3==5)){
               h=1;
               r=3;
               c=i2;
               }
               if((i1+1!=4)){
              // i1=0;
               r=i1+1;
               c=i2;
               h=i3;
               }
               if(gameCube.state[r][c][h]=="m"){
           return true;}
               else{
               return false;}
    
    }
    public Boolean checkDown(int i1,int i2,int i3,int r,int c,int h){
    if((i1-1==-1)&& (i3==0)){
               h=4;
               r=0;
               c=i2;
               }
               if((i1-1==-1)&& (i3==1)){
               h=4;
               c=i2;
               r=3;
               }
               if((i1-1==-1)&& (i3==2)){
               h=4;
               r=3-i2;
               c=0;
               }
               if((i1-1==-1)&& (i3==3)){
               h=4;
               r=3-i2;
               c=3;
               }
               if((i1-1==-1)&& (i3==4)){
               h=0;
               r=0;
               c=i2;
               }
               if((i1-1==-1)&& (i3==5)){
               h=0;
               r=3;
               c=i2;
               }
               if((i1-1!=-1)){
              // i1=0;
               r=i1-1;
               c=i2;
               h=i3;
               }
               if(gameCube.state[r][c][h]=="m"){
           return true;}
               else{
               return false;}
    
    }
    public Boolean checkEast(int i1,int i2,int i3,int r,int c,int h){
    if((i2+1==4)&& (i3==0)){
               h=3;
               c=3;
               r=i1;
               }
               if((i2+1==4)&& (i3==1)){
               h=3;
               c=0;
               r=i1;
               }
               if((i2+1==4)&& (i3==2)){
               h=0;
               c=0;
               r=i1;
               }
               if((i2+1==4)&& (i3==3)){
               h=0;
               c=3;
               r=i1;
               }
                if((i2+1==4)&& (i3==4)){
               h=3;
               c=3-i1;
               r=0;
               }
                 if((i2+1==4)&& (i3==5)){
               h=3;
               c=3-i1;
               r=3;
               }
               if((i2+1!=4)){
               h=i3;
               c=i2+1;
               r=i1;
               } 
                if(gameCube.state[r][c][h]=="m"){
           return true;}
                else{
                return false;
                }
    }
                public Boolean checkUpEast(int i1,int i2,int i3,int r,int c,int h){
                   if((i1+1==4)&& (i3==0)){
               h=5;
               r=0;
               c=i2;
               }
               if((i1+1==4)&& (i3==1)){
               h=5;
               c=i2;
               r=3;
               }
               if((i1+1==4)&& (i3==2)){
               h=5;
               r=3-i2;
               c=0;
               }
               if((i1+1==4)&& (i3==3)){
               h=5;
               r=3-i2;
               c=3;
               }
               if((i1+1==4)&& (i3==4)){
               h=1;
               r=0;
               c=i2;
               }
               if((i1+1==4)&& (i3==5)){
               h=1;
               r=3;
               c=i2;
               }
               if((i1+1!=4)){
              // i1=0;
               r=i1+1;
               c=i2;
               h=i3;
               }
                 if((c+1==4)&& (h==0)){
               h=3;
               c=3;
               r=r;
               }
               if((c+1==4)&& (h==1)){
               h=3;
               c=0;
               r=r;
               }
               if((c+1==4)&& (h==2)){
               h=0;
               c=0;
               r=r;
               }
               if((c==4)&& (h==3)){
               h=0;
               c=3;
               r=r;
               }
                if((c+1==4)&& (h==4)){
               h=3;
               c=3-r;
               r=0;
               }
                 if((c+1==4)&& (h==5)){
               h=3;
               c=3-r;
               r=3;
               }
               if((c+1!=4)){
               h=h;
               c=c+1;
               r=r;
               } 
               
                if(gameCube.state[r][c][h]=="m"){
           return true;}
                else{
                return false;
                }
                
                
                
    
    }
    public Boolean checkWest(int i1,int i2,int i3,int r,int c,int h){
     if((i2-1==-1)&& (i3==0)){
               h=2;
               c=3;
               r=i1;
               }
               if((i2-1==-1)&& (i3==1)){
               h=2;
               c=0;
               r=i1;
               }
               if((i2-1==-1)&& (i3==2)){
               h=1;
               c=0;
               r=i1;
               }
               if((i2-1==-1)&& (i3==3)){
               h=1;
               c=3;
               r=i1;
               }
                if((i2-1==-1)&& (i3==4)){
               h=2;
               c=3-i1;
               r=0;
               }
                 if((i2-1==-1)&& (i3==5)){
               h=2;
               c=3-i1;
               r=3;
               }
               if((i2-1!=-1)){
               h=i3;
               c=i2-1;
               r=i1;
               } 
                
                if(gameCube.state[r][c][h]=="m"){
           return true;}
                else{
                return false;
                }
   
    }
public Boolean checkUpWest(int i1,int i2,int i3,int r,int c,int h){
  if((i1+1==4)&& (i3==0)){
               h=5;
               r=0;
               c=i2;
               }
               if((i1+1==4)&& (i3==1)){
               h=5;
               c=i2;
               r=3;
               }
               if((i1+1==4)&& (i3==2)){
               h=5;
               r=3-i2;
               c=0;
               }
               if((i1+1==4)&& (i3==3)){
               h=5;
               r=3-i2;
               c=3;
               }
               if((i1+1==4)&& (i3==4)){
               h=1;
               r=0;
               c=i2;
               }
               if((i1+1==4)&& (i3==5)){
               h=1;
               r=3;
               c=i2;
               }
               if((i1+1!=4)){
              // i1=0;
               r=i1+1;
               c=i2;
               h=i3;
               }
   if((c-1==-1)&& (h==0)){
               h=2;
               c=3;
               r=r;
               }
               if((c-1==-1)&& (h==1)){
               h=2;
               c=0;
               r=r;
               }
               if((c-1==-1)&& (h==2)){
               h=1;
               c=0;
               r=r;
               }
               if((c-1==-1)&& (h==3)){
               h=1;
               c=3;
               r=r;
               }
                if((c-1==-1)&& (h==4)){
               h=2;
               c=3-r;
               r=0;
               }
                 if((c-1==-1)&& (h==5)){
               h=2;
               c=3-r;
               r=3;
               }
               if((c-1!=-1)){
               h=h;
               c=c-1;
               r=r;
               } 
                
                if(gameCube.state[r][c][h]=="m"){
           return true;}
                else{
                return false;
                }

}
public Boolean checkDownEast(int i1,int i2,int i3,int r,int c,int h){
   if((i1-1==-1)&& (i3==0)){
               h=4;
               r=0;
               c=i2;
               }
               if((i1-1==-1)&& (i3==1)){
               h=4;
               c=i2;
               r=3;
               }
               if((i1-1==-1)&& (i3==2)){
               h=4;
               r=3-i2;
               c=0;
               }
               if((i1-1==-1)&& (i3==3)){
               h=4;
               r=3-i2;
               c=3;
               }
               if((i1-1==-1)&& (i3==4)){
               h=0;
               r=0;
               c=i2;
               }
               if((i1-1==-1)&& (i3==5)){
               h=0;
               r=3;
               c=i2;
               }
               if((i1-1!=-1)){
              // i1=0;
               r=i1-1;
               c=i2;
               h=i3;
               }
               
               
                 if((c+1==4)&& (h==0)){
               h=3;
               c=3;
               r=r;
               }
               if((c+1==4)&& (h==1)){
               h=3;
               c=0;
               r=r;
               }
               if((c+1==4)&& (h==2)){
               h=0;
               c=0;
               r=r;
               }
               if((c==4)&& (h==3)){
               h=0;
               c=3;
               r=r;
               }
                if((c+1==4)&& (h==4)){
               h=3;
               c=3-r;
               r=0;
               }
                 if((c+1==4)&& (h==5)){
               h=3;
               c=3-r;
               r=3;
               }
               if((c+1!=4)){
               h=h;
               c=c+1;
               r=r;
               } 
               
                if(gameCube.state[r][c][h]=="m"){
           return true;}
                else{
                return false;
                }

}
public Boolean checkDownWest(int i1,int i2,int i3,int r,int c,int h){
    if((i1-1==-1)&& (i3==0)){
               h=4;
               r=0;
               c=i2;
               }
               if((i1-1==-1)&& (i3==1)){
               h=4;
               c=i2;
               r=3;
               }
               if((i1-1==-1)&& (i3==2)){
               h=4;
               r=3-i2;
               c=0;
               }
               if((i1-1==-1)&& (i3==3)){
               h=4;
               r=3-i2;
               c=3;
               }
               if((i1-1==-1)&& (i3==4)){
               h=0;
               r=0;
               c=i2;
               }
               if((i1-1==-1)&& (i3==5)){
               h=0;
               r=3;
               c=i2;
               }
               if((i1-1!=-1)){
              // i1=0;
               r=i1-1;
               c=i2;
               h=i3;
               }
                  if((c-1==-1)&& (h==0)){
               h=2;
               c=3;
               r=r;
               }
               if((c-1==-1)&& (h==1)){
               h=2;
               c=0;
               r=r;
               }
               if((c-1==-1)&& (h==2)){
               h=1;
               c=0;
               r=r;
               }
               if((c-1==-1)&& (h==3)){
               h=1;
               c=3;
               r=r;
               }
                if((c-1==-1)&& (h==4)){
               h=2;
               c=3-r;
               r=0;
               }
                 if((c-1==-1)&& (h==5)){
               h=2;
               c=3-r;
               r=3;
               }
               if((c-1!=-1)){
               h=h;
               c=c-1;
               r=r;
               } 
                
                if(gameCube.state[r][c][h]=="m"){
           return true;}
                else{
                return false;
                }
}
}