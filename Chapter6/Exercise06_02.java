package Chapter6;

import java.util.Scanner;

/**
 * 
 * @author JD
 * 
 *  Description: (Sum the digits in an integer) Write a method that
 *         computes the sum of the digits in an integer. Use the following
 *         method header: public static int sumDigits(long n) For example,
 *         sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to
 *         extract digits, and the / operator to remove the extracted digit. For
 *         instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from
 *         234, use 234 / 10 (= 23). Use a loop to repeatedly extract and remove
 *         the digit until all the digits are extracted. Write a test program
 *         that prompts the user to enter an integer and displays the sum of all
 *         its digits.
 */
public class Exercise06_02 {
	// main method
	public static void main(String[] args) {
		// initialize scanner and variables
		Scanner input = new Scanner(System.in);
		long userInput;

		// recieve input
		System.out.print("Enter a value to sum the digits of: ");
		userInput = input.nextLong();

		// print results
		System.out.println("The sum of digits in " + userInput + " is " + sumDigits(userInput));
	}

	// sumnation method
	public static int sumDigits(long n) {

		// cast long to an integer
		long temp = n;
		int sumnation = 0;

		// loop for checking that digits still remain
		while (temp != 0) {

			// sum the numbers that are % 10;
			sumnation += (temp % 10);

			// remove digits one by one
			temp = temp / 10;
		}

		return sumnation;
	}
}
