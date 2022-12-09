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
			ps.setString(1, order_History.getClient_id());
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
			ps.setString(2, order_History.getClient_id());
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
						rs.getString("Client_ID"),
						rs.getInt("Order_ID"), 
						rs.getInt("Stars"),
						rs.getString("Comment")
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
		String sql = "select * from Order_History join Assessments on Order_History.Order_ID=Assessments.Order_ID";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Order_History> order_Historys = new ArrayList<Order_History>();
			while (rs.next()) {
				Order_History order_History = new Order_History(
						rs.getInt("ID"),
						rs.getString("Client_ID"),
						rs.getInt("Order_ID"), 
						rs.getInt("Stars"),
						rs.getString("Comment")	
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
<<<<<<< HEAD
	
	public List<PersonalHistory> GetPersonalHistory(String username) {
		String sql = "exec LoadPersonalHistory ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			List<PersonalHistory> personalHistorys = new ArrayList<PersonalHistory>();
			while (rs.next()) {
				PersonalHistory personalHistory = new PersonalHistory(
						rs.getInt("Order_ID"),
						rs.getString("Name"),
						rs.getInt("Quantity"), 
						rs.getInt("Amount")
				);
				personalHistorys.add(personalHistory);
			}
			return personalHistorys;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
=======
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
}
