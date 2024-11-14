package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Grades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();

		if (student.total() >= 60) {
			System.out.printf("FINAL GRADE = %.2f%nPASS", student.total());
		} else {
			System.out.printf("FINAL GRADE = %.2f%nFAILED%n", student.total());
		System.out.printf("MISSING %.2f POINTS %n", Math.abs(student.missing()));
		}
		sc.close();
	}

}
