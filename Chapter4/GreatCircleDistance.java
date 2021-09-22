package Chapter4;

import java.util.Scanner;

/**
 * @author JD
 * Description: Distance between two points on a circle
 */

public class GreatCircleDistance {
	public static void main(String[] args) {
		// initialize variables and scanner class
		final double RADIUS = 6371.01;
		double distance, x1, x2, y1, y2;
		String coordinates1, coordinates2;
		int comma;
		Scanner input = new Scanner(System.in);

		// ask for input
		System.out.print("Enter in Latitude x1,y1 in degrees: ");
		coordinates1 = input.nextLine();

		System.out.print("Enter in Longitude x2,y2 in degrees: ");
		coordinates2 = input.nextLine();

		// seperate string input
		comma = coordinates1.indexOf(",");
		x1 = Double.parseDouble(coordinates1.substring(0, comma));
		x1 = Math.toRadians(x1);
		y1 = Double.parseDouble(coordinates1.substring(comma + 1));
		y1 = Math.toRadians(y1);

		comma = coordinates2.indexOf(",");
		x2 = Double.parseDouble(coordinates2.substring(0, comma));
		x2 = Math.toRadians(x2);
		y2 = Double.parseDouble(coordinates2.substring(comma + 1));
		y2 = Math.toRadians(y2);

		// calculate distance
		distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		// output
		System.out.printf("The distance between the two points is %f km", distance);

	}
}
