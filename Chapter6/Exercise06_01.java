package Chapter6;
/**
 * 
 * @author JD
 * Description: Math: Pentagonal numbers. a Pentagonal number is defined as n(3n-1)/2 for n = 1,2,... and so on. THerefore the first few numbers
 * are 1,5,12,22.. write a method with the following header that returns a pentagonal numbers 
 */
public class Exercise06_01 {
	public static void main(String[] args) {

		// print header
		System.out.println("The first 100 pentagonal numbers are: ");

		// for loop to calculate first 100 pentagonal numbers
		for (int i = 0; i < 100; i++) {
			System.out.print(getPentagonalNumber(i) + " ");

			// check if 10 numbers have been printed, if so new line break
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	// method for computing pentagonal number
	public static int getPentagonalNumber(int n) {
		int num;
		num = (n * (3 * n - 1)) / 2;
		return num;

	}
}
