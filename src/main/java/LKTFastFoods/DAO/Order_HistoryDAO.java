package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class Order_HistoryDAO extends DBConnection implements iOrder_HistoryDAO{
	@Override
	public void Add(Order_History order_History) {
		String sql = "exec AddOrder_History ? ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, order_History.getClient_id());
			ps.setInt(2, order_History.getOrder_id());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Order_History order_History) {
		String sql = "exec UpdateOrder_History ? ? ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, order_History.getId());
			ps.setInt(2, order_History.getClient_id());
			ps.setInt(3, order_History.getOrder_id());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(int id) {
		String sql = "exec DeleteOrder_History ?";
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
	public Order_History GetOne(int id) {
		String sql = "exec GetOneOrder_History ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Order_History order_History = new Order_History(
						rs.getInt("ID"),
						rs.getInt("Client_ID"),
						rs.getInt("Order_ID")	
				);
				return order_History;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order_History> GetAll() {
		String sql = "exec GetAllOrder_History";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Order_History> order_Historys = new ArrayList<Order_History>();
			while (rs.next()) {
				Order_History order_History = new Order_History(
						rs.getInt("ID"),
						rs.getInt("Client_ID"),
						rs.getInt("Order_ID")	
				);
				order_Historys.add(order_History);
			}
			return order_Historys;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
