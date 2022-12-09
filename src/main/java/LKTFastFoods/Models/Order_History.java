package LKTFastFoods.Models;

public class Order_History{
<<<<<<< HEAD
	public Order_History(int id, String client_id, int order_id, int star, String comment) {
=======
	public Order_History(int id, String client_id, int order_id, int star,String comment ) {
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		super();
		this.id = id;
		this.client_id = client_id;
		this.order_id = order_id;
		this.star=star;
		this.comment=comment;
	}
<<<<<<< HEAD

=======
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
	private int id;
	private String client_id;
	private int order_id;
	private int star;
	private String comment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
