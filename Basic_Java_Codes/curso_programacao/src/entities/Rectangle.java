package entities;

public class Rectangle {

	public double widht;
	public double Height;
	
	public double Area(){
		return widht * Height;
	}
	public double Perimeter() {
		return 2 * (widht + Height);
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(Height, 2) + Math.pow(widht, 2) );
	}
	public String toString() {
		return "Area: "
			+ String.format("%.2f%n", Area())
			+ "Perimeter = "
			+ String.format("%.2f%n", Perimeter())
			+ "Dioagonal = "
			+ String.format("%.2f%n", Diagonal());
	}
}
