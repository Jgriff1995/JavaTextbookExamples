package Chapter3;

import java.util.Random;

public class RandomMonth {
	public static void main(String[] args) {
		// initialize variables and random class
		int min = 1, max = 12, random;
		Random rand = new Random();
		String month = "";
		
		//retrieve random number 1-12
		random = rand.nextInt((max - min) + 1) + min;

		// use switch statement to obtain month
		switch (random) {
		case 1:
			month = "Jan";
			break;
		case 2:
			month = "Feburary";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
		default:
			month = "Invalid";
		}

		// output random month
		System.out.printf("%s is the random month generated", month);
	}
}
