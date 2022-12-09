package LKTFastFoods.Models;

public class Assessment{
<<<<<<< HEAD
	public Assessment(int id, int order_id, int star, String comment) {
=======
	public Assessment(int id, int order_id, float star, String comment) {
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		super();
		this.id = id;
		this.order_id = order_id;
		this.star = star;
		this.comment = comment;
	}
	
	private int id;
	private int order_id;
<<<<<<< HEAD
	private int star;
=======
	private float star;
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
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
<<<<<<< HEAD
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
=======
	public float getStar() {
		return star;
	}
	public void setStar(float star) {
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		this.star = star;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
