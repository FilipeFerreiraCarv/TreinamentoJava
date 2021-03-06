package curso_programacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeExercicioProposto;

public class ExercicioProposto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeExercicioProposto> list = new ArrayList<>();
		
		System.out.println("How many employess will be registered?");
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again:");
				id = sc.nextInt();
			}
			
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			EmployeeExercicioProposto emp = new EmployeeExercicioProposto(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		EmployeeExercicioProposto emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		
		System.out.println();
		System.out.println("Lists of Employess:");
		for(EmployeeExercicioProposto e : list) {
			System.out.println(e);
		}
		
		
		sc.close();
		
	}

	public static boolean hasId(List<EmployeeExercicioProposto> list, int id) {
		EmployeeExercicioProposto emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}  
	
}
