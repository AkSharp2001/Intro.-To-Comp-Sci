public class Lefties {

    public static void main(String[] args) {

    	int numSuccesses = 0;

    	for (int trials=1; trials<=100; trials++) {
    		int numLefties = 0;
    		for (int people=1; people<=20; people++) {
    			double lefty = Math.random();
    			if (lefty <= 0.1) {
    				numLefties++;
    			}
    		}
    		if (numLefties >= 2) {
    			numSuccesses++;
    		}
    	}
    	System.out.println(numSuccesses);

    }
}
