public class AnasCats {
	public static void main (String args[]) {
		int anasCats = Integer.parseInt(args[0]);
		int ellensCats = Integer.parseInt(args[1]);
		if (anasCats < 0 || ellensCats < 0) {
			System.out.println("error");
		}
		else {
			int totalCats = anasCats + ellensCats;
			System.out.println(totalCats);
		}
	}
}
