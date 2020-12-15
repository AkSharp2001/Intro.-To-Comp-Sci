public class Temp {
	public static void main (String args[]) {
		double tempF = Double.parseDouble(args[0]);
		if (tempF < -459.67) {
			System.out.println("Error: Temp must be greater than or equal to -459.67");
		}
		else {
			double tempC = (tempF-32) * 5/9;
			System.out.println(tempC + " degrees Celsius");
		}
	}
}