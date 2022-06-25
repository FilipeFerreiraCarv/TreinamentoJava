package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class ExercicioFixacao2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;		
		
		System.out.println("Enter account number:");
		int Account = sc.nextInt();
		
		System.out.println("Enter account Holder:");
		sc.nextLine();
		String Name = sc.nextLine();

		System.out.println("Is There a initial deposit (y/n):");
		char HasInitialValue = sc.next().charAt(0);
		
		if(HasInitialValue == 'y') {
			System.out.println("Enter initial deposit value:");
			double Value = sc.nextDouble();		
			account = new Account(Account, Name, Value);
		}
		else {
			account = new Account(Account, Name);
		}
		
	

		System.out.println("Account data:");
		System.out.println(account);
		
		
		System.out.println("Enter a deposit value:");
		account.deposit(sc.nextDouble());
		
		System.out.println("Update data:");
		System.out.println(account);

		System.out.println("Enter a withdraw value:");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Update data:");
		System.out.println(account);
		
		sc.close();
	}

}
