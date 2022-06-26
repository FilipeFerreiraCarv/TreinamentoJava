package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expeditures: ");
				double healthexpeditures = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthexpeditures));					
			}
			else {
				System.out.print("Number of employees: ");
				int numberofemployees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numberofemployees));					
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum =0;
		for(Contribuinte c : list) {
			System.out.println(c.getName() + ": $ " + String.format("%.2f",c.impostoArrecadado()));
			sum += c.impostoArrecadado();
		}
		System.out.println();
		System.out.println("TOTAL TAXES:" + String.format("%.2f",sum));		
		
		sc.close();
		
		
	}

}
