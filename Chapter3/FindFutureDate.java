import java.util.Scanner;

/** @author JD 
 * description: Receive user input for today as well as a day in the future, output today and future date
*/

public class FindFutureDate {
	public static void main(String[] args) {
		// initialize variables and scanner
		int d, fd;
		String day, futureDay;
		Scanner input = new Scanner(System.in);

		// Receive current day of week
		System.out.print("Enter in day of week from 0-6, 0 is sunday, 6 is saturday");
		d = input.nextInt();

		// check for invalid input
		if (d < 0) {
			System.out.println("Invalid day entered");

		} else {
			//Receive future date
			System.out.print("Enter in number of days elapsed since today: ");
			fd = input.nextInt();
			
		//calculate day
		switch(d) {
		case 0: day = "Sunday"; break;
		case 1: day = "Monday"; break;
		case 2: day = "Tuesday"; break;
		case 3: day = "Wednesday"; break;
		case 4: day = "Thursday"; break;
		case 5: day = "Friday"; break;
		case 6: day = "Saturday"; break;
		default: day = "Invalid"; break;
		}
		
		//figure out future day from current and input
		fd = (d + fd) % 7;
		
		//calculate future day
		switch(fd) {
		case 0: futureDay = "Sunday"; break;
		case 1: futureDay = "Monday"; break;
		case 2: futureDay = "Tuesday"; break;
		case 3: futureDay = "Wednesday"; break;
		case 4: futureDay = "Thursday"; break;
		case 5: futureDay = "Friday"; break;
		case 6: futureDay = "Saturday"; break;
		default: futureDay = "Invalid"; break;
		}
	
		//output results
		System.out.printf("Today is %s and the future day is %s", day, futureDay);
		}
	}
}
