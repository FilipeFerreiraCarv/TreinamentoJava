package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		
		System.out.println("Enter client data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY):");
		Date birthdate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthdate);
		
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderstatus = sc.next();
		System.out.print("How many items to this order? ");
		int orderquantity = sc.nextInt();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(orderstatus), client);
				
		for(int i=0;i<orderquantity;i++) {
			System.out.println("Enter #" + i + "item data:");
			System.out.print("Product name: ");
			String nameproduct = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(nameproduct, price);
			OrderItem ordemitem = new OrderItem(quantity, price);
			ordemitem.addProducts(product);
			order.addOrderItem(ordemitem);
		}
		
		System.out.println();
		System.out.println(order);
		
		
		
		
		sc.close();
		
		
	}

}
