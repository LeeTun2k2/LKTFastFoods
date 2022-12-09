package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class ProductDAO extends DBConnection implements iProductDAO{
	@Override
	public void Add(Product product) {
		String sql = "exec AddProduct ? ,?, ?, ? ,?, ? ,?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setNString(1, product.getName());
			ps.setString(2, product.getImage());
			ps.setNString(3, product.getDescription());
			ps.setBoolean(4, product.isStatus());
			ps.setInt(5, product.getImportPrice());
			ps.setInt(6, product.getExportPrice());
			ps.setInt(7, product.getVoucher_id());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Product product) {
		String sql = "exec UpdateProduct ?, ?, ?, ? ,?, ? ,? ,?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product.getId());
			ps.setNString(2, product.getName());
			ps.setString(3, product.getImage());
			ps.setNString(4, product.getDescription());
			ps.setBoolean(5, product.isStatus());
			ps.setInt(6, product.getImportPrice());
			ps.setInt(7, product.getExportPrice());
			ps.setInt(8, product.getVoucher_id());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(int id) {
		String sql = "exec DeleteProduct ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Product GetOne(int id) {
		String sql = "exec GetOneProduct ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product(
						rs.getInt("ID"),
						rs.getNString("Name"),
						rs.getString("Image"),
						rs.getNString("Description"),
						rs.getInt("Amount"),
						rs.getBoolean("Status"),
						rs.getInt("Import_Price"),
						rs.getInt("Export_Price"),
						rs.getInt("Voucher_ID")
				);
				return product;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> GetAll() {
		String sql = "exec GetAllProducts";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Product> products = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product(
						rs.getInt("ID"),
						rs.getNString("Name"),
						rs.getString("Image"),
						rs.getNString("Description"),
						rs.getInt("Amount"),
						rs.getBoolean("Status"),
						rs.getInt("Import_Price"),
						rs.getInt("Export_Price"),
						rs.getInt("Voucher_ID")
				);
				products.add(product);
			}
			return products;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Menu> GetAllMenu() {
		String sql = "exec LoadAllProductInMenu";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Menu> menus = new ArrayList<Menu>();
			while (rs.next()) {
				Menu menu = new Menu(
						rs.getInt("ID"),
						rs.getNString("Name"),
						rs.getString("Image"),
						rs.getNString("Description"),
						rs.getInt("Amount"),
						rs.getInt("Export_Price"),
						rs.getInt("Discount")
				);
				menus.add(menu);
			}
			menus.remove(0);
			return menus;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
