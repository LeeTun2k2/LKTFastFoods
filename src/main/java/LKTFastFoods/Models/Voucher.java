package LKTFastFoods.Models;

<<<<<<< HEAD
import java.sql.Date;

public class Voucher{
	public Voucher(int id, Date startDate, Date endDate, int discount) {
		super();
		this.id = id;
=======
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Voucher{
	
	public Voucher(int id, Date startDate, Date endDate, int discount) {
		super();
		this.id=id;
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		this.startDate = startDate;
		this.endDate = endDate;
		this.discount = discount;
	}
<<<<<<< HEAD
=======
	
	public Voucher( String dateStart, String dateEnd, int discount) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			this.startDate = sdf.parse(dateStart);
			this.endDate = sdf.parse(dateEnd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		this.discount = discount;
	}
	public Voucher( int id, String dateStart, String dateEnd, int discount) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			this.startDate = sdf.parse(dateStart);
			this.endDate = sdf.parse(dateEnd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.id=id;
		this.discount = discount;
	}
	
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
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
<<<<<<< HEAD
	}
=======
	} 
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
	private int id;
	private Date startDate;
	private Date endDate;
	private int discount;
<<<<<<< HEAD
=======
	@Override
	public String toString() {
		return "Voucher [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", discount=" + discount
				+ "]";
	}
	
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
}
