/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Akshar Patel, aap279@scarletail.rutgers.edu, aap279
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

    	double[] newArray = new double[array.length];
    	for(int i=0; i<array.length; i++){
    		newArray[i] = array[i];
    	}
    	return newArray;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

    	for(int i=0; i<x.length; i++){
    		x[i] = x[i]*alpha;
    		y[i] = y[i]*alpha;
    	}
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

    	for(int i=0; i<x.length; i++){
    		x[i] = x[i] + dx;
    		y[i] = y[i] + dy;
    	}
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
    	double[] originalx = new double[x.length];
    	for(int i=0; i<x.length; i++){
    		originalx[i] = x[i];
    		x[i] = x[i]*Math.cos(theta*Math.PI/180) - y[i]*Math.sin(theta*Math.PI/180);
    		y[i] = y[i]*Math.cos(theta*Math.PI/180) + originalx[i]*Math.sin(theta*Math.PI/180);
    	}
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

    	// double[] x = new double[args.length];
    	// for(int i=0; i<args.length; i++){
    	//    	x[i] = Double.parseDouble(args[i]);
    	// }
    	// double[] c = copy(x);
    	// for(int i=0; i<c.length; i++){
    	// 	System.out.println(c[i]);
    	// }

		// StdDraw.setScale(-5.0, +5.0);
 	    //double[] arr1 = {0, 1, 1, 0 };
		// double[] arr2 = {0, 0, 2, 1 };

		// double val = 2;
		// StdDraw.setPenColor(StdDraw.RED); 
		// StdDraw.polygon(arr1, arr2); 
		// scale(arr1,arr2,val);
		// StdDraw.setPenColor(StdDraw.BLUE);
		// StdDraw.polygon(arr1, arr2);

		// double deltax = 2.0, deltay = 1.0; 
		// StdDraw.setPenColor(StdDraw.RED); 
		// StdDraw.polygon(arr1, arr2); 
		// translate(arr1, arr2, deltax, deltay); 
		// StdDraw.setPenColor(StdDraw.BLUE);
		// StdDraw.polygon(arr1, arr2);

		// double theta = 45.0; 
		// StdDraw.setPenColor(StdDraw.RED); 
		// StdDraw.polygon(arr1, arr2); 
		// rotate(arr1, arr2, theta); 
		// StdDraw.setPenColor(StdDraw.BLUE);
		// StdDraw.polygon(arr1, arr2);



    }
}
