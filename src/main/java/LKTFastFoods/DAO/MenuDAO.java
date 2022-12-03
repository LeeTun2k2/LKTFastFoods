package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class MenuDAO extends DBConnection implements iMenuDAO{
	@Override
	public List<Menu> GetAll() {
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
						rs.getInt("Export_Price"),
						rs.getInt("Amount"),
						rs.getInt("Discount")
				);
				menus.add(menu);
			}
			return menus;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
