package Chapter6;
/**
 * @author JD
 * Description: Testing void methods. Using user input to calculate what lettergrade they recieve for a given score
 */

import java.util.Scanner;


public class TestVoid {
	public static void main(String[] args) {
		//initialize scanner and variables
		String userInput;
		double score;
		Scanner input = new Scanner(System.in);
		
		//receive input
		System.out.print("Enter exam score: ");
		userInput = input.nextLine();
		score = Double.parseDouble(userInput);
		
		//output results
		System.out.print("Your grade on the test with score " + score + " is a(n)");
		gradePrint(score);
	}
	
	public static void gradePrint(double score) {
		if(score >= 90.0) {
			System.out.println('A');
		} else if (score >= 80.0) {
			System.out.println('B');
		} else if (score >= 70.0) {
			System.out.println('C');
		} else if (score >= 60.0) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}
}
