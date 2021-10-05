package Chapter6;

import java.util.Scanner;

/**
 * 
 * @author JD
 * Description: Write a method with the following header to display three numbers in increasing order:
 * 	//public static void displaySortedNumbers(double num1, double num2, double num3)
 * 	***Method code was refrenced from jsquared21***
 */
public class Exercise06_05 {
	//main method
	public static void main(String[] args) {
		//initialize varibales and Scanner object
		Scanner input = new Scanner(System.in);
		double num1,num2,num3;
		
		//receive 3 inputs from user
		System.out.print("Enter first number: ");
		num1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		num2 = input.nextDouble();
		
		System.out.print("Enter third number: ");
		num3 = input.nextDouble();
		
		//invoke method
		displaySortedNumbers(num1,num2,num3);
		
	}
	
	//sort numbers method
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp;
		
		//first check
		if(num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;	
		} else if (num3 < num1 && num3 < num2) { //second check
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		//third check
		if(num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		//print results
		System.out.println(num1 + " " + num2 + " " + num3);
		}
		
		
	}

