public class ConvertToBinary{
	public static void main(String[] args) {

		int a = StdIn.readInt();
		Convert(a);

	}

	public static void Convert(int n){

		if(n==0) {
			return;
		}
		else {
			int quotient = n/2;
			int remainder = n%2;
			Convert(quotient);
			System.out.print(remainder);
		}
	}
}