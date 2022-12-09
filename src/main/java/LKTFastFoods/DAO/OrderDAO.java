package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class OrderDAO extends DBConnection implements iOrderDAO{
	@Override
	public void Add(Order order) {
		String sql = "exec AddOrder ?, ?, ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, order.getPayment_id());
			ps.setInt(2, order.getAmount());
			ps.setDate(3, order.getDate());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Order order) {
		String sql = "exec UpdateOrder ?, ?, ?, ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, order.getId());
			ps.setInt(2, order.getPayment_id());
			ps.setInt(3, order.getAmount());
			ps.setDate(4, order.getDate());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(int id) {
		String sql = "exec DeleteOrder ?";
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
	public Order GetOne(int id) {
		String sql = "exec GetOneOrder ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Order order = new Order(
						rs.getInt("ID"),
						rs.getInt("Payment_ID"),
						rs.getInt("Amount"),
						rs.getDate("Date")
				);
				return order;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> GetAll() {
		String sql = "exec GetAllOrders";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Order> orders = new ArrayList<Order>();
			while (rs.next()) {
				Order order = new Order(
						rs.getInt("ID"),
						rs.getInt("Payment_ID"),
						rs.getInt("Amount"),
						rs.getDate("Date")
				);
				orders.add(order);
			}
			return orders;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public int GetMaxOrderID() {
		String sql = "exec GetMaxOrderID";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int maxID = 0;
			while (rs.next())
				maxID = rs.getInt("maxID");
			return maxID;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
