package Chapter5;
/**
 * @author JD
 * Description: Count positive numbers and negative numbers. compute average based on only positive
 * values
 */
import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		// initialize variables and scanner class
		Scanner input = new Scanner(System.in);
		double average = 0, totalSum = 0;
		int countPos = 0, countNeg = 0, userInput, totalCount = 0;

		// receive input
		System.out.print("Enter an integer, the input ends if it is 0: ");
		userInput = input.nextInt();

		// check and make sure exit value isnt entered
		if (userInput > 0 && userInput != 0) {
			countPos++;
			totalSum += userInput;
		} else if (userInput < 0 && userInput != 0) {
			countNeg++;
			totalSum += userInput;
		}

		// initialize while loop
		while (userInput != 0) {

			// ask for input inside loop
			System.out.print("Enter an integer, the input ends if it is 0: ");
			userInput = input.nextInt();

			// check for pos/neg values
			if (userInput > 0) {
				countPos++;
				totalSum += userInput;
			} else if (userInput < 0) {
				countNeg++;
				totalSum += userInput;
			}

		}

		// calculate total numbers inputed and average of positives
		totalCount = countPos + countNeg;
		average = totalSum / totalCount;

		// print results and error if exit code is entered at beginning
		if (countPos > 0 && countNeg > 0) {
			System.out.printf("The number of positives is %d\n", countPos);
			System.out.printf("The number of negatives is %d\n", countNeg);
			System.out.printf("The total is %.1f\n", totalSum);
			System.out.printf("the average is %.2f\n", average);
		} else {
			System.out.println("No numbers are entered except 0");
		}
	}

}
