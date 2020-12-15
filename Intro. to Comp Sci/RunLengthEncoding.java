/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author: Akshar Patel, aap279@scarletmail.rutgers.edu, aap279
 *
 *************************************************************************/

public class RunLengthEncoding {

    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
   public static String encode (String original) {

    	String compressed = new String();
    	int count = 1;

    	for (int i=0; i<original.length(); i++) {
    		if (i+1 < original.length() && original.charAt(i) == original.charAt(i+1)) {
    			count++;
    		}
    		else if (count == 1) {
    			compressed = compressed.concat(Character.toString(original.charAt(i)));
    		}
    		else {
    			compressed = compressed.concat(Integer.toString(count)).concat(Character.toString(original.charAt(i)));
    			count = 1;
    		}
    	}
    	return compressed;
    }

    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */
    public static String decode (String original) {
		int x = original.length();
		char count = original.charAt(0);

		if (x == 1) {
			return original;
		}

		else if (Character.isDigit(original.charAt(0))) {
			
			if (count != '1') {
				count--;
				return original.substring(1,2) + decode(count + original.substring(1,x));
			}
			else {
				return decode(original.substring(1,x));
			}
		}
		
		else {
            
			return original.substring(0,1) + decode(original.substring(1,x));
		}
		
    }

    public static void main (String[] args) {

    	String orig = "qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT";
    	System.out.println(encode(orig));
    	System.out.println(decode(encode(orig)));
    }
}