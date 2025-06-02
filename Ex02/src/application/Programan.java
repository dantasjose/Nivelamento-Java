package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Programan {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Employee em = new Employee();
		
		System.out.print("Name:");
	     em.name = sc.nextLine();
	    System.out.print("GrossSalary: ");
	    em.glossSalary = sc.nextDouble();
	    System.out.print("Tax: ");
	    em.tax = sc.nextDouble();
	    System.out.println();
	    
	    System.out.println("Employee: "+ em);
	    System.out.println();
		
	    System.out.print("Wich percentage to increase salary?" );
	    double percentage= sc.nextDouble();
	    System.out.println();
		
		em.increaseSalary(percentage);
		System.out.printf("Updated data: %s, $ %.2f%n ",em.name, em.increaseSalary(percentage));
		
		
		
		
		sc.close();

	}

}
