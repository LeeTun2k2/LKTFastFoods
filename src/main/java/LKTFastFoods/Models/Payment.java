package LKTFastFoods.Models;

import java.sql.Date;

public class Payment{
	public Payment(int id, int method_id, Date dateDone, int amount, String description) {
		super();
		this.id = id;
		this.method_id = method_id;
		this.dateDone = dateDone;
		this.amount = amount;
		this.description = description;
	}
	public Payment(int id, int method_id, Date dateDone, int amount, String description ,int orderId) {
		super();
		this.id = id;
		this.method_id = method_id;
		this.dateDone = dateDone;
		this.amount = amount;
		this.description = description;
		this.orderId=orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	private int id;
	private int method_id;
	private Date dateDone;
	private int amount;
	private String description;
	private int orderId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMethod_id() {
		return method_id;
	}
	public void setMethod_id(int method_id) {
		this.method_id = method_id;
	}
	public Date getDateDone() {
		return dateDone;
	}
	public void setDateDone(Date dateDone) {
		this.dateDone = dateDone;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
