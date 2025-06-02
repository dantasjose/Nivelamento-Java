package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Programam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.print("Name: ");
		std.name = sc.nextLine();
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", std.finalGrade());
		
		if (std.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("Missing Points: %.2f\n", std.finalGrade());
        }
		else {
			System.out.println("PASS");
		}
		
		
				
		
		sc.close();		
		
		
	}

}
