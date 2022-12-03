package LKTFastFoods.Models;

public class Order_Info{
	public Order_Info(int id, int product_id, int order_id, int quantity, int amount) {
		super();
		this.id = id;
		this.product_id = product_id;
		this.order_id = order_id;
		this.quantity = quantity;
		this.amount = amount;
	}
	private int id;
	private int product_id;
	private int order_id;
	private int quantity;
	private int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
