/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Akshar Patel, aap279@scarletmail.rutgers.edu, aap279
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
    	int xCoord = 0;
    	int yCoord = 0;
    	double squaredDist = 0.0;
    	int n = Integer.parseInt(args[0]);
    	System.out.println("(" + xCoord + "," + yCoord + ")");
    	for (int i=0; i<n; i++) {
	    	double randomVal = Math.random()*100;
	    	if (randomVal < 25){
	    		xCoord += 1;
	    	}
	    	else if (randomVal <= 50) {
	    		yCoord +=1;
	    	}
	    	else if (randomVal <= 75) {
	    		xCoord -= 1;
	    	}
	    	else {
	    		yCoord -= 1;
    		}
    		System.out.println("(" + xCoord + "," + yCoord + ")");
    	}
    	squaredDist = Math.pow(xCoord,2) + Math.pow(yCoord,2);
    	System.out.println("Squared Distance = " + squaredDist);
    }
}