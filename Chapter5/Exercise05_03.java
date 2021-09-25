package Chapter5;
/**
 * 
 * @author JD
 * Description: converts kilograms to pounds 1kg = 2.2lbs
 */
public class Exercise05_03 {
	public static void main(String[] args) {
		// initialize variables
		double pounds;

		// table header
		System.out.print("Kilograms\tPounds\n");

		// create for loop that outputs conversions
		for (int i = 1; i < 200; i++) {
			pounds = i * 2.2;
			System.out.printf("%d\t\t%.1f\n", i, pounds);

		}
	}
}
