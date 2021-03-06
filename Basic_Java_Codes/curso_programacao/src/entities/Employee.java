package entities;

public class Employee {

	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		double ValueForDecrise = (GrossSalary - Tax);
		return ValueForDecrise;
	}
	
	public void IncreaseSalary(double percentage){
		double ValueToIncrease = GrossSalary * (percentage / 100);
		GrossSalary += ValueToIncrease;
	}
	
	public String toString() {
		return Name + ", $ " + String.format("%.2f", NetSalary());
	}
	
}
