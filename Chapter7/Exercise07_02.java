package Chapter7;

import java.util.Scanner;

public class Exercise07_02 {
	/** Main Method **/
	public static void main(String[] args) {
		//initialize variables and Scanner
		Scanner input = new Scanner(System.in);
		int[] inputNum = new int[10];
		
		//gather input 
		for(int i = 0; i < inputNum.length; i++) {
			System.out.printf("Enter in number %d of %d: ",i+1,inputNum.length);
			inputNum[i] = input.nextInt();
		}
		
		//print in reverse order
		for(int i = inputNum.length - 1; i > 0; i--) {
			System.out.print(inputNum[i] + " ");
		}
	}
}
