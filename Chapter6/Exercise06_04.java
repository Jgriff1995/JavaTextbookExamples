package Chapter6;

import java.util.Scanner;

/**
 * 
 * @author JD
 *  Description: (Display an integer reversed) Write a method with the
 *         following header to display an integer in reverse order: public
 *         static void reverse(int number) For example, reverse(3456) displays
 *         6543. Write a
 */
public class Exercise06_04 {
	//main method
	public static void main(String[] args) {
		//initialize variables and Scanner object
		int userInput;
		Scanner input = new Scanner(System.in);
		
		//receive input
		System.out.print("Enter in a number you'd like to reverse: ");
		userInput = input.nextInt();
		
		//output results
		System.out.printf("%nThe reverse of %d is: ", userInput);
		reverse(userInput);
	}
	
	//reverse method
	public static void reverse(int number) {
		String reverse = "";
		
		//while loop
		while(number != 0) {
			//add each number in backwards fashion to achieve reverse
			reverse += number % 10;
			//after number is added, get rid of it
			number/= 10;
		}
		
		//convert the string> integer and print
		System.out.println(Integer.parseInt(reverse));
	}
}
