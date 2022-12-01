package LKTFastFoods.Models;

public class Assessment{
	public Assessment(int id, int order_id, float star, String comment) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.star = star;
		this.comment = comment;
	}
	
	private int id;
	private int order_id;
	private float star;
	private String comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public float getStar() {
		return star;
	}
	public void setStar(float star) {
		this.star = star;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
