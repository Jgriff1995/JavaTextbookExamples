package Chapter3;
/** 
 * @author JD
 * Description: Repeat additions, genereate ten random addition questions for two integers between
 *  1 and 15. Display the correct count and incorrect count 
 */
import java.util.Scanner;
public class RandomAddition {
	public static void main(String[] args) {
		//initialize all question variables, int randoms, time variable and count of correct questions
		String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
		int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18 , a19 ,a20, uInput, correct = 0, incorrect = 0 ;
		Scanner input = new Scanner(System.in);
		
		//generate random numbers for questions
		a1 = (int) (Math.random() * 15) + 1;
		a2 = (int) (Math.random() * 15) + 1;
		a3 = (int) (Math.random() * 15) + 1;
		a4 = (int) (Math.random() * 15) + 1;
		a5 = (int) (Math.random() * 15) + 1;
		a6 = (int) (Math.random() * 15) + 1;
		a7 = (int) (Math.random() * 15) + 1;
		a8 = (int) (Math.random() * 15) + 1;
		a9 = (int) (Math.random() * 15) + 1;
		a10 = (int) (Math.random() * 15) + 1;
		a11 = (int) (Math.random() * 15) + 1;
		a12 = (int) (Math.random() * 15) + 1;
		a13 = (int) (Math.random() * 15) + 1;
		a14 = (int) (Math.random() * 15) + 1;
		a15 = (int) (Math.random() * 15) + 1;
		a16 = (int) (Math.random() * 15) + 1;
		a17 = (int) (Math.random() * 15) + 1;
		a18 = (int) (Math.random() * 15) + 1;
		a19 = (int) (Math.random() * 15) + 1;
		a20 = (int) (Math.random() * 15) + 1;
		
		//build each questions
		q1 = "What is the sum of " + a1 + " + " +a20 + "? ";
		q2 = "What is the sum of " + a2 + " + " +a19 + "? ";
		q3 = "What is the sum of " + a3 + " + " +a18 + "? ";
		q4 = "What is the sum of " + a4 + " + " +a17 + "? ";
		q5 = "What is the sum of " + a5 + " + " +a16 + "? ";
		q6 = "What is the sum of " + a6 + " + " +a15 + "? ";
		q7 = "What is the sum of " + a7 + " + " +a14 + "? ";
		q8 = "What is the sum of " + a8 + " + " +a13 + "? ";
		q9 = "What is the sum of " + a9 + " + " +a12 + "? ";
		q10 = "What is the sum of " + a10 + " + " +a11 + "? ";
		
		//check each question and users input to it
		System.out.print(q1);
		uInput = input.nextInt();
		
		//check input 
		if(uInput == (a1 + a20)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q2);
		uInput = input.nextInt();
		if(uInput == (a2 + a19)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q3);
		uInput = input.nextInt();
		if(uInput == (a3 + a18)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q4);
		uInput = input.nextInt();
		if(uInput == (a4 + a17)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q5);
		uInput = input.nextInt();
		if(uInput == (a5 + a16)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q6);
		uInput = input.nextInt();
		if(uInput == (a6 + a15)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q7);
		uInput = input.nextInt();
		if(uInput == (a7 + a14)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q8);
		uInput = input.nextInt();
		if(uInput == (a8 + a13)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q9);
		uInput = input.nextInt();
		if(uInput == (a9 + a12)) {
			correct++;
		} else {
			incorrect++;
		}
		
		System.out.print(q10);
		uInput = input.nextInt();
		if(uInput == (a10 + a11)) {
			correct++;
		} else {
			incorrect++;
		}
		
		
		//display incorrect and correct results
		System.out.printf("You got %d correct\n", correct);
		System.out.printf("You got %d incorrect\n", incorrect);
		
		
		
		
	}
}
