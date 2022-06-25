package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
				
		System.out.println("Enter the measures of triangules x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();		
		System.out.println("Enter the measures of triangules y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
	
		
		double areax = x.Area();
		double areay = y.Area();
		
		System.out.printf("Triangule X area: %.4f%n", areax);
		System.out.printf("Triangule Y area: %.4f%n", areay);
		
		if (areax > areay){
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
	
		sc.close();
	}

}
