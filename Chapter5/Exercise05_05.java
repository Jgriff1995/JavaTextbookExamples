package Chapter5;
/**
 * 
 * @author JD
 * Description: converts kilograms to pounds on one side and pounds to kilograms (increment 5) on other
 */

public class Exercise05_05 {
	public static void main(String[] args) {
		// initialize variables
		double kilometers, pounds, kilograms;

		// table header
		System.out.print("Kilograms\tPounds\t\t|\tPounds\t\tKilograms\n");

		// create for loop that outputs conversions & table
		for (int i = 1, k = 20; i <= 200 && k < 516; i++, k += 5) {
			kilograms = k / 2.2;
			pounds = i * 2.2;
			System.out.printf("%d\t\t%.1f\t\t|\t%d\t\t%.2f\n", i, pounds, k, kilograms);

		}
	}
}
