package Chapter4;

import java.util.Scanner;
/**
 * @author JD
 * Description: Find Area of Polygon
 */
public class AreaOfPolygon {
	public static void main(String[] args) {
		// initialize variables and scanner
		double s, area;
		int nSides;
		String temp;
		Scanner input = new Scanner(System.in);

		// ask for input
		System.out.print("Enter the number of sides: ");
		temp = input.nextLine();
		nSides = Integer.parseInt(temp);

		System.out.println(nSides);
		temp = "";

		System.out.print("Enter the side: ");
		temp = input.nextLine();
		s = Double.parseDouble(temp);
		System.out.println(s);

		// calculate area
		area = (nSides * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / nSides));

		// print to console
		System.out.printf("The area of the polygon is %f", area);
	}
}
