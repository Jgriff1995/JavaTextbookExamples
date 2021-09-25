package Chapter5;
/**
 * 
 * @author JD
 * Description: compute future tuition with increase of 5% each year
 */
public class Exercise05_07 {
	public static void main(String[] args) {
		// initialize variables
		double tuition = 10000;
		final double INCREMENT = 0.05;

		// initialize for loop for 10 years
		for (int i = 1; i <= 10; i++) {
			tuition = tuition + (tuition * INCREMENT);
		}

		// display 10 years tuition
		System.out.printf("Your tuition after 10 years will be %.2f\n", tuition);

		// initialize 2nd for loop for 4 years after 10th
		for (int i = 1; i <= 4; i++) {
			tuition = tuition + (tuition * INCREMENT);
		}

		// display 4 years after 10th year tuition
		System.out.printf("Your tuition 4 years after 10th year is %.2f\n", tuition);
	}
}
