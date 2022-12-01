package LKTFastFoods.Models;

public class Order_History{
	public Order_History(int id, int client_id, int order_id) {
		super();
		this.id = id;
		this.client_id = client_id;
		this.order_id = order_id;
	}
	private int id;
	private int client_id;
	private int order_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
}
