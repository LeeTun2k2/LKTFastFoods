package LKTFastFoods.Models;

public class Menu {
	public Menu(int id, String name, String image, String description, int amount, int exportPrice, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.description = description;
		this.amount = amount;
		this.exportPrice = exportPrice;
		this.discount = discount;
	}
	private int id;
	private String name;
	private String image;
	private String description;
	private int amount;
	private int exportPrice;
	private int discount;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getExportPrice() {
		return exportPrice;
	}
	public void setExportPrice(int exportPrice) {
		this.exportPrice = exportPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
