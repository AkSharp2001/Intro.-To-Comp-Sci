/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @author: Akshar Patel, aap279, aap279@scarletmail.rutgers.edu
 *
 * The program Gas computes and displays the price a
 * person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *
 *************************************************************************/

public class Gas {

    public static void main(String[] args) {

	    double pricePerGallon = Double.parseDouble(args[0]);
	    double gallons = Double.parseDouble(args[1]);
	    boolean cash = Boolean.parseBoolean(args[2]);

	   	if (pricePerGallon > 0 && gallons > 0) {
			double totalCost = pricePerGallon*gallons;
		    if (cash == false) {
		      totalCost *= 1.1;
		    }
		    System.out.println(totalCost);
	   	}
	   	else {
	   		System.out.println("Illegal input");
	   	}
    
    }
}
