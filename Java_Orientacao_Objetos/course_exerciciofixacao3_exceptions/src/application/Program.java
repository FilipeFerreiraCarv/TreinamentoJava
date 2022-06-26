package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	try{	
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawBalance = sc.nextDouble();
		Account account = new Account(number, holder, initialBalance, withdrawBalance);	
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double valueWithdraw = sc.nextDouble();
		account.withdraw(valueWithdraw);
		
		System.out.println("New balance: " + account.getBalance());
	}
	catch(DomainException e) {
		System.out.println("Error in withdraw: " + e.getMessage());
	}
	catch (RuntimeException e) {
		System.out.println("Unexpected error");
	}	
		
		
		sc.close();
		
	}

}
