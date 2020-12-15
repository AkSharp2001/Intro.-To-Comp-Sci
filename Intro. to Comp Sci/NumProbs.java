public class NumProbs {
	public static void main (String[] args) {
		System.out.println("Enter an integer: ");
		int n = StdIn.readInt();
		System.out.println("The factorial of " + n + " is " + factorial(n));

		System.out.println("Enter base: ");
		int b = StdIn.readInt();
		System.out.println("Enter exponent: ");
		int exp = StdIn.readInt();
		System.out.println(b + " to the power of " + exp + " is " + pow(b, exp));
	}
	public static int factorial (int num) {
		int product = 1;
		for(int i=1; i<=num; i++) {
			product *= i;
		}
		return product;
	}
	public static int pow (int base, int exponent) {
		int product = 1;
		for (int i=1; i<=exponent; i++) {
			product *= base;
		}
		return product;
	}
}