package Chapter6;

import java.util.Scanner;

/**
 * @author JD 
 * 
 * Description: (Palindrome integer) Write the methods with the
 *         following headers 
 *         // Return the reversal of an integer, i.e.,
 *         reverse(456) returns 654 public static int reverse(int number) 
 *         // Return true if number is a palindrome public static boolean isPalindrome(int number)
 *         Use the reverse method to implement
 *         isPalindrome. A number is a palindrome if its reversal is the same as
 *         itself. Write a test program that prompts the user to enter an
 *         integer and reports whether the integer is a palindrome.
 *         
 *         ***I recieved help via online resources for this problem***
 */

public class Exercise06_03 {
	//main method
	public static void main(String[] args) {
		//initialize variables and Scanner object
		Scanner input = new Scanner(System.in);
		int userInput;
		
		//receive input
		System.out.print("Please enter an integer: ");
		userInput = input.nextInt();
		
		//output results
		System.out.printf("%d reversed is %d\n", userInput, reverse(userInput));
		System.out.printf("%d is %s palindrone", userInput, isPalindrone(userInput) ? "a" : "not a");
		
		
	}
	
	// Return the reversal of an integer 
	public static int reverse(int number) {
		String reverse = "";
		
		//extract reverse of the integer
		while(number != 0) {
			reverse += number % 10;
			number/=10;
		}
		
		return Integer.parseInt(reverse);
	}
	
	//return true if number is a palidrome
	public static boolean isPalindrone(int number) {
		if( number == reverse(number)) {
			return true;
		} else {	
			return false;
		}	
	}
}
