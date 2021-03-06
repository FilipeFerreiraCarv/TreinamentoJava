package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	
	private List<Product> products = new ArrayList<>();
	
	
	public OrderItem() {
	}


	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	public List<Product> getProducts() {
		return products;
	}	
	
	
	public void addProducts(Product products) {
		this.products.add(products);
	}
	
	public void removeProducts(Product products) {
		this.products.remove(products);
	}
	
	
	
	public double subTotal() {
		return quantity * price;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(products.toString());
		sb.append("Quantity: ");
		sb.append(quantity);
		sb.append("Subtotal: ");
		sb.append(subTotal() + "\n");
	return sb.toString();
	}

}
