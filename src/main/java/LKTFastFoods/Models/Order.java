package LKTFastFoods.Models;

import java.sql.Date;

public class Order{
	public Order(int id, int payment_id, int amount, Date date) {
		super();
		this.id = id;
		this.payment_id = payment_id;
		this.amount = amount;
		this.date = date;
	}
	private int id;
	private int payment_id;
	private int amount;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
