package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.TaxInstallments;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double Value = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int parcels = sc.nextInt();
		
		Contract c = new Contract(number, date, Value, parcels);
		
		for(int i=0; i < parcels;i++) {	
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			long dateincremet = (Calendar.LONG + (i+1) * (30 * 24 * 60 * 60));
			date = cal.getTime();
			double valueForTax = Value / parcels;
			double valueFinal =	new TaxInstallments().tax(i + 1, valueForTax);
			System.out.println(sdf.format(dateincremet) + " - " + valueFinal );
		}	
		
		
		
		sc.close();
		
		
	}

}
