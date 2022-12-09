package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class Payment_MethodDAO extends DBConnection implements iPayment_MethodDAO{
	@Override
	public void Add(Payment_Method payment_Method) {
		String sql = "exec AddPayment_Method ?, ?, ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, payment_Method.getAccountNumber());
			ps.setString(2, payment_Method.getAccountName());
			ps.setString(3, payment_Method.getBankName());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Payment_Method payment_Method) {
		String sql = "exec UpdatePayment_Method ?, ?, ?, ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, payment_Method.getId());
			ps.setString(1, payment_Method.getAccountNumber());
			ps.setString(2, payment_Method.getAccountName());
			ps.setString(3, payment_Method.getBankName());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(int id) {
		String sql = "exec DeletePayment_Method ?";
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
	public Payment_Method GetOne(int id) {
		String sql = "exec GetOnePayment_Method ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Payment_Method payment_Method = new Payment_Method(
						rs.getInt("ID"),
						rs.getString("AccountNumber"),
						rs.getString("AccountName"),
						rs.getString("BankName")
				);
				return payment_Method;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Payment_Method> GetAll() {
		String sql = "exec GetAllPayment_Methods";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Payment_Method> payment_Methods = new ArrayList<Payment_Method>();
			while (rs.next()) {
				Payment_Method payment_Method = new Payment_Method(
						rs.getInt("ID"),
						rs.getString("AccountNumber"),
						rs.getString("AccountName"),
						rs.getString("BankName")
				);
				payment_Methods.add(payment_Method);
			}
			return payment_Methods;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int GetMaxPaymentMethodID() {
		String sql = "exec GetMaxPaymentMethodID";
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
