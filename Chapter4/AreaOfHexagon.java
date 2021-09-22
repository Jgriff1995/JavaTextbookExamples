package Chapter4;
/**
 * @author JD
 * Description: Find the area of a Hexagon
 */
import java.util.Scanner;

public class AreaOfHexagon {
	public static void main(String[] args) {
		//initialize variables and scanner
		Scanner input = new Scanner(System.in);
		double area, s;
		String side;
		
		//ask for input
		System.out.print("Enter the side: ");
		side = input.nextLine();
		s = Double.parseDouble(side);
		
		//calculate area
		area = (6 * Math.pow(s, 2))/(4 * Math.tan(Math.PI/6));
		
		//output to console
		System.out.printf("The area of the hexagon is %.2f" , area);
		
	}
}
