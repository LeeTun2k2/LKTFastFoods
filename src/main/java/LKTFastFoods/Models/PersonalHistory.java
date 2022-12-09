package LKTFastFoods.Models;

public class PersonalHistory {
	public PersonalHistory(int id, String name, int quantity, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.amount = amount;
	}
	private int id;
	private String name;
	private int quantity;
	private int amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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