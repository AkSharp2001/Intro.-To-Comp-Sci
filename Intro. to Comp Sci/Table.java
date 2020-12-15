public class Table {

    public static void main(String[] args) {

    	int n = Integer.parseInt(args[0]);
    	String spaces;
    	for (int row=1; row<=n; row++) {
    		for (int col=1; col<=n; col++) {
    			int rand = (int)(Math.random()*100 + 1);
    			if (rand < 10)spaces = "      ";
    			else if (rand < 100)spaces = "     ";
    			else spaces = "    ";
    			System.out.print(spaces + rand);
    		}
    		System.out.println();
    	}
    }
}


/* (int)(100 * Math.random() + 1) --->  gives values between 1 and 100
										Ex. values could be 1.2 and 100.9 
										bc they are casted as ints, the numbers will become 1 and 100
*/