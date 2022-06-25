package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.HotelRoom;

public class ExercicioFixacao3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		HotelRoom[] vect = new HotelRoom[10];

		for(int i=0;i<n;i++) {
			sc.nextLine();
			int rent = i+1;
			String name = sc.nextLine();
			String email = sc.nextLine();
			int room = sc.nextInt();
			vect[room]= new HotelRoom(rent,name,email,room);
		}
		
		for(int i=0;i < vect.length ; i++) {
			if(vect[i] != null) {
				System.out.println("Rent #" + vect[i].getRent());
				System.out.println("Name: " + vect[i].getName());
				System.out.println("Email: " + vect[i].getEmail());	
				System.out.println("Room: " + vect[i].getRoom());
				System.out.println();
			}
		}
		
		System.out.println("Busy rooms:");

		for(int i=0;i < vect.length ; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
			
		sc.close();
		
	}

}
