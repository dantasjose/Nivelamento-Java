package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;
/*Create a program to read the width and height values of a rectangle. Then, display on the screen its area, perimeter,
 and diagonal. Use a class as shown in the project beside.*/
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		retangulo rec= new retangulo();
		
		System.out.println("Enter rectangle width an height:");
		rec.width= sc.nextDouble();
		rec.height= sc.nextDouble();
		
				
		System.out.printf("AREA= %.2f%n",rec.area());
		System.out.printf("PERIMETER= %.2f%n",rec.perimeter());
		System.out.printf("DIAGONAL= %.2f%n",rec.diagonal());
		
		
		
		
		sc.close();
	}

}
