package Chapter5;
/**
 * 
 * @author JD
 * Description: converts miles to kilometers
 */

public class Exercise05_04 {
	public static void main(String[] args) {
		// initialize variables
		double kilometers;
		
		//table header
		System.out.print("Miles\tKilometers\n");

		// create for loop that outputs conversions
		for (int i = 1; i <= 10; i++) {
			kilometers = i * 1.609;
			System.out.printf("%d\t%.3f\n", i, kilometers);

		}
	}
}
