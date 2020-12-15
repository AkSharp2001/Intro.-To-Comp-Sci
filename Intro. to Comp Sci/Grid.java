public class Grid {

    public static void main(String[] args) {

    	int n = Integer.parseInt(args[0]);
    	for (int row=1; row<=n; row++) {
    		for (int col=1; col<=n; col++) {
    			int rand = (int)(Math.random() + 1);
    			System.out.print(rand);
    		}
    	}
    }
}