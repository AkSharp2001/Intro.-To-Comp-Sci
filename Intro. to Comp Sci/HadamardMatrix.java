/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Akshar Patel, aap279@scarletmail.rutgers.edu, aap279
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {

    	int num = Integer.parseInt(args[0]);
    	boolean[][] hadamard = new boolean[num][num];
        hadamard[0][0] = true;
        
        for(int h=1; h<num; h=h+h) {     
            for(int i=0; i<h; i++) {
                for(int j=0; j<h; j++) {
                    hadamard[i+h][j] = hadamard[i][j];
                    hadamard[i][j+h] = hadamard[i][j];
                    hadamard[i+h][j+h] = !hadamard[i][j];
                }
            }
        }

    	for(int i=0; i<num; i++){
    		for(int j=0; j<num; j++){
    			if (hadamard[i][j] == true) {
                    System.out.print("T ");
                }
                else {
                    System.out.print("F ");
                }
    		}
    		System.out.println();
    	}
    }
}