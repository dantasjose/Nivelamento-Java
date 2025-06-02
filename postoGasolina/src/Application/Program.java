package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int alcool= 0;
		int gasolina =0;
		int diesel=0;
		int total =0;
		System.out.println("digite o codigo: ");
		int code= sc.nextInt();
		
		while( code != 4) {
			
		  if (code == 1) {
				alcool= alcool +1;
			}
			else if (code == 2) {
				gasolina = gasolina +1;
			}
			else if(code== 3) {
				diesel= diesel +1;
			}
			code= sc.nextInt();
		}
		total= alcool+gasolina+diesel;
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("diesel:" + diesel);
		System.out.println("Total: " + total);
		
		
		sc.close();
		
	}

}
