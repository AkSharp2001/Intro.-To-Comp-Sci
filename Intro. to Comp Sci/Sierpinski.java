/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Akshar Patel, aap279@scarletmail.rutgers.edu, aap279
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
    	double h = (length/2)*Math.pow(3,.5);
    	return h;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

		double[] xVals = {x, x-length/2, x+length/2};
		double[] yVals = {y, y+height(length), y+height(length)};

		StdDraw.filledPolygon(xVals, yVals);
		
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

    	if (n <= 0) {
    		return;
    	}
    	else {
    		n--;
	    	filledTriangle(x, y, length);
	    	sierpinski(n, x-length/2, y, length/2);
	    	sierpinski(n, x+length/2, y, length/2);
	    	sierpinski(n, x, y+height(length), length/2);
    	}
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

    	int n = Integer.parseInt(args[0]);

    	double[] x = {0, 1, .5};
    	double[] y = {0, 0, height(1)};
    	StdDraw.polygon(x,y);

    	sierpinski(n, .5, 0, .5);
    	
    }
}
