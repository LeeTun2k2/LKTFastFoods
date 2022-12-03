package LKTFastFoods.Models;

import java.sql.Date;

public class Voucher{
	public Voucher(int id, Date startDate, Date endDate, int discount) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	private int id;
	private Date startDate;
	private Date endDate;
	private int discount;
}
