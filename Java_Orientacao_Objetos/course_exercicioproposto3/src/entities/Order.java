package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS");

	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> orderitem = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;		
	}

	public List<OrderItem> getOrderItem() {
		return orderitem;
	}
	
	public void addOrderItem(OrderItem orderitem) {
		this.orderitem.add(orderitem);
	}
	
	public void removeOrderItem(OrderItem orderitem) {
		this.orderitem.remove(orderitem);
	}
		
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY: " + "\n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append(client.toString() + "\n");
		double sum = 0;
		for (OrderItem o : orderitem) {
			sb.append(o.getProducts());
			sb.append(", Quantity:");
			sb.append(o.getQuantity());
			sb.append(", Subtotal: $");
			sb.append(o.subTotal() + "\n");
			sum += o.subTotal();
		}
		sb.append("Total price: $");		
		sb.append(sum);
	return sb.toString();
	}

}
