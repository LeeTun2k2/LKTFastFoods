package LKTFastFoods.Models;

import java.awt.Image;
import java.awt.ImageCapabilities;

public class Product{
	public Product(int id, String name, String image, String description, int amount, boolean status, int importPrice,
			int exportPrice, int voucher_id) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.description = description;
		this.amount = amount;
		this.status = status;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
		this.voucher_id = voucher_id;
	}

	public Product () {};
	public Product(int id , String name,String image, String description,  int importPrice,
			int exportPrice, int voucher_id){
			
				this.id = id;
				this.name = name;
				this.description = description;
				this.image=image;
				this.importPrice = importPrice;
				this.exportPrice = exportPrice;
				this.voucher_id = voucher_id;
			}

	private int id;
	private String name;
	private String image;
	private String description;
	private int amount;
	private boolean status;
	private int importPrice;
	private int exportPrice;
	private int voucher_id;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getImportPrice() {
		return importPrice;
	}
	public void setImportPrice(int importPrice) {
		this.importPrice = importPrice;
	}
	public int getExportPrice() {
		return exportPrice;
	}
	public void setExportPrice(int exportPrice) {
		this.exportPrice = exportPrice;
	}
	public int getVoucher_id() {
		return voucher_id;
	}
	public void setVoucher_id(int voucher_id) {
		this.voucher_id = voucher_id;
	}
}
