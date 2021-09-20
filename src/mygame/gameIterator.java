
package mygame;

public interface gameIterator {
    public boolean hasNext(String s);
	
	public String nextUp(int i1,int i2,int i3);
        public String nextDown(int i1,int i2,int i3);
        public String nextEast(int i1,int i2,int i3);
        public String nextWest(int i1,int i2,int i3);
        public String nextUpEast(int i1,int i2,int i3);
         public String nextDownEast(int i1,int i2,int i3);
       public String nextDownWest(int i1,int i2,int i3);
        public String nextUpWest(int i1,int i2,int i3);
    
}
