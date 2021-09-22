package Chapter4;

import java.util.Scanner;
/**
 * @author JD
 * Description: Find Area of Pentagon
 */
public class AreaOfPentagon {
	public static void main(String[] args) {
		// initialize variables and scanner
		Scanner input = new Scanner(System.in);
		double area, radius, s;

		// ask for input
		System.out.print("Enter in the radius of the Pentagon: ");
		radius = input.nextDouble();

		// calculate side
		s = 2 * radius * Math.sin(Math.PI / 5);

		// calculate area
		area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

		// output results
		System.out.printf("The area of the pentagon is %.2f", area);

	}
}
