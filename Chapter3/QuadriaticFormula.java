package Chapter3;

import java.util.Scanner;

public class QuadriaticFormula {
	public static void main(String[] args) {
		// initialize variables and scanner
		double a, b, c, discriminate, q1, q2;
		int comma, comma2, root = 0;
		String user, temp;
		Scanner input = new Scanner(System.in);

		// ask for input
		System.out.print("Enter in values of a, b, and c as a,b,c seperated by commas: ");
		user = input.nextLine();

		// separate input
		comma = user.indexOf(",");
		comma2 = user.indexOf(",", user.indexOf(",") + 1);
		temp = user.substring(0, comma);
		a = Double.parseDouble(temp);
		temp = user.substring(comma + 1, comma2);
		b = Double.parseDouble(temp);
		temp = user.substring(comma2 + 1);
		c = Double.parseDouble(temp);

		// calculate and check discriminate

		discriminate = Math.pow(b, 2) - 4 * a * c;
		if (discriminate > 0) {
			root = 2;
		} else if(discriminate == 0) {
			root = 1;
		} else {
			root = 0;
		}

		// Calculate roots and output
		if (root == 2) {
			q1 = (-b + Math.sqrt(discriminate)) / (2 * a);
			q2 = (-b - Math.sqrt(discriminate)) / (2 * a);
			System.out.printf("The two roots of %.2f,%.2f,%.2f are %.2f and %.2f", a, b, c, q1, q2);
		} else if(root == 1) {
			q1 = (-b + Math.sqrt(discriminate)) / (2 * a);
			System.out.printf("The one root of %.2f,%.2f,%.2f is %.2f", a, b, c, q1);
		} else {
			System.out.printf("There are no real roots of %.2f, %.2f, %.2f." , a,b,c);
		}

	}
}
