package Chapter6;
/**
 * @author JD
 * Description: Testing methods, take in user input either whole number or decimal and find various properites of the two
 */
import java.util.Scanner;

public class TestMethods {
	public static void main(String[] args) {
		// initialize variables
		String input1, input2;
		double x1, y1;
		double result;
		Scanner input = new Scanner(System.in);
		
		//receive user input
		System.out.print("Enter in first number: ");
		input1 = input.nextLine();
		x1 = Double.parseDouble(input1);

		System.out.print("Enter in second number: ");
		input2 = input.nextLine();
		y1 = Double.parseDouble(input2);
		
		//find max
		result = max(x1, y1);
		System.out.printf("The Larger number between %.2f and %.2f is %,.1f\n", x1, y1, result);

		//find min
		result = min(x1, y1);
		System.out.printf("The Smaller number between %.2f and %.2f is %,.1f\n", x1, y1, result);

		//find product
		result = product(x1, y1);
		System.out.printf("The Product of the numbers %.2f and %.2f is %,.1f\n", x1, y1, result);

		//find quotient
		result = divisor(x1, y1);
		System.out.printf("The Quotient of the numbers %.2f and %.2f is %,.3f\n", x1, y1, result);

		//find power
		result = power(x1, y1);
		System.out.printf("The Power of the number %.2f raised to %.2f is %,.3f\n", x1, y1, result);

		//find sum
		result = add(x1, y1);
		System.out.printf("The sum of the numbers %.2f and %.2f is %,.3f\n", x1, y1, result);
		
		//find difference
		result = difference(x1, y1);
		System.out.printf("The difference between the numbers %.2f and %.2f is %,.3f\n", x1, y1, result);

	}

	public static double max(double num1, double num2) {
		double result;

		if (num1 > num2) {
			result = num1;
		} else
			result = num2;
		return result;
	}

	public static double min(double num1, double num2) {
		double result;
		if (num1 < num2) {
			result = num1;
		} else {
			result = num2;
		}
		return result;
	}

	public static double product(double num1, double num2) {
		double product;
		product = num1 * num2;
		return product;
	}

	public static double divisor(double num1, double num2) {
		double divisor;
		divisor = num1 / num2;
		return divisor;
	}

	public static double power(double num1, double num2) {
		double power;
		power = Math.pow(num1, num2);
		return power;
	}

	public static double add(double num1, double num2) {
		double result;
		result = num1 + num2;
		return result;
	}

	public static double difference(double num1, double num2) {
		double result;
		if (num2 > num1) {
			result = num2 - num1;
		} else {
			result = num1 - num2;
		}
		return result;
	}
}
