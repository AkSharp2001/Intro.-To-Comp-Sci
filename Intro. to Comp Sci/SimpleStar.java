public class SimpleStar {

 public static void main(String[] args)  {
       StdDraw.setPenRadius(0.005);
       StdDraw.setPenColor(StdDraw.BLUE);
       int minX = -100;
       int maxX = 100;
       int minY = -100;
       int maxY = 100;
       StdDraw.setXscale(minX, maxX);
       StdDraw.setYscale(minY,maxY);
        int width  = maxX - minX;
        int height = maxY - minY;
        int min;
        if ( height > width )
          min = width;
        else
          min = height;
        drawStar( 0, 0, min/4 );
   }

  public static void drawStar( int x, int y, int size ){
    int endX, endY ;
    
    // Six lines radiating from (x,y)
    if (size<=1){
      return;
    }
    for ( int i = 0; i< 6; i++ )
    {
      endX = x + (int)(size*Math.cos( (2*Math.PI/6)*i ));
      endY = y - (int)(size*Math.sin( (2*Math.PI/6)*i ));
      StdDraw.line( x, y, endX, endY );
      drawStar(endX, endY, size/3);
    } 
  }
}


   	  

