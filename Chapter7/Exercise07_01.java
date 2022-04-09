package Chapter7;
/**
 * @author: JD
 */
import java.util.Scanner;

public class Exercise07_01 {
	/** Main Method **/
	public static void main(String[] args) {
		// initialize variables and Scanner
		Scanner input = new Scanner(System.in);
		int numOfStudents, maxGrade = 0;

		// gather student count
		System.out.print("Enter the number of students: ");
		numOfStudents = input.nextInt();

		// initialize array
		int[] grades = new int[numOfStudents];
		char[] letterGrades = new char[numOfStudents];

		// gather all grades
		for (int i = 0; i < grades.length; i++) {
			// gather inputs
			System.out.printf("Enter grade %d of %d: ", i + 1, grades.length);
			grades[i] = input.nextInt();

			// find max Grade from input
			if (i == 0) {
				maxGrade = grades[i];
			} else if (maxGrade < grades[i]) {
				maxGrade = grades[i];
			}
		}

		// print grades based on max score
		for (int i = 0; i < grades.length; i++) {

			// conditional for assigning letterGrades
			if (grades[i] >= maxGrade - 10) {
				letterGrades[i] = 'A';
			} else if (grades[i] >= maxGrade - 20) {
				letterGrades[i] = 'B';
			} else if (grades[i] >= maxGrade - 30) {
				letterGrades[i] = 'C';
			} else if (grades[i] >= maxGrade - 40) {
				letterGrades[i] = 'D';
			} else {
				letterGrades[i] = 'F';
			}

			System.out.printf("Student %d score is %d and grade is %c%n", i + 1, grades[i], letterGrades[i]);
		}

	}

}
