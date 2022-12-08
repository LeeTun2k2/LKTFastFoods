package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class Order_InfoDAO extends DBConnection implements iOrder_InfoDAO{
	@Override
	public void Add(Order_Info order_Info) {
		String sql = "exec AddOrder_Info ? ? ? ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, order_Info.getProduct_id());
			ps.setInt(2, order_Info.getOrder_id());
			ps.setInt(3, order_Info.getQuantity());
			ps.setInt(4, order_Info.getAmount());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Order_Info order_Info) {
		String sql = "exec UpdateOrder_Info ? ? ? ? ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, order_Info.getId());
			ps.setInt(2, order_Info.getProduct_id());
			ps.setInt(3, order_Info.getOrder_id());
			ps.setInt(4, order_Info.getQuantity());
			ps.setInt(5, order_Info.getAmount());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(int id) {
		String sql = "exec DeleteOrder_Info ?";
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
	public Order_Info GetOne(int id) {
		String sql = "exec GetOneOrder_Info ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Order_Info order_Info = new Order_Info(
						rs.getInt("ID"),
						rs.getInt("Product_ID"),
						rs.getInt("Order_ID"),
						rs.getInt("Quantity"),
						rs.getInt("Amount")
				);
				return order_Info;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order_Info> GetAll() {
		String sql = "exec GetAllOrder_Infos";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Order_Info> order_Infos = new ArrayList<Order_Info>();
			while (rs.next()) {
				Order_Info order_Info = new Order_Info(
						rs.getInt("ID"),
						rs.getInt("Product_ID"),
						rs.getInt("Order_ID"),
						rs.getInt("Quantity"),
						rs.getInt("Amount")	
				);
				order_Infos.add(order_Info);
			}
			return order_Infos;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
