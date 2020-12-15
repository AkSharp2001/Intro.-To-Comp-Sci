public class Harmonic {

    public static void main(String[] args) {
    	double n = Integer.parseInt(args[0]);
    	System.out.println(harmonic(n));

    }

    public static double harmonic(double num) {
    	if (num == 1) {
    		return 1;
    	}
    	else {
    		return (1/num) + harmonic(num-1);
    	}
    }
}