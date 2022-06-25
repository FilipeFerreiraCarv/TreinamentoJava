package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
	Rectangle rectangle = new Rectangle();
	
	System.out.println("Enter the measures of the Rectangle: ");
	rectangle.widht = sc.nextDouble();
	rectangle.Height = sc.nextDouble();
	
	System.out.println(rectangle);
	
	sc.close();
	}
}