package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class PaymentDAO extends DBConnection implements iPaymentDAO{
	@Override
	public void Add(Payment payment) {
<<<<<<< HEAD
		String sql = "exec AddPayment ?, ?, ?, ?";
=======
		String sql = "exec AddPayment ? ? ? ?";
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, payment.getMethod_id());
			ps.setDate(2, payment.getDateDone());
			ps.setInt(3, payment.getAmount());
			ps.setNString(4, payment.getDescription());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Payment payment) {
<<<<<<< HEAD
		String sql = "exec UpdatePayment ?, ?, ?, ?, ?";
=======
		String sql = "exec UpdatePayment ? ? ? ? ?";
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, payment.getId());
			ps.setInt(2, payment.getMethod_id());
			ps.setDate(3, payment.getDateDone());
			ps.setInt(4, payment.getAmount());
			ps.setNString(5, payment.getDescription());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(int id) {
		String sql = "exec DeletePayment ?";
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
	public Payment GetOne(int id) {
		String sql = "exec GetOnePayment ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Payment payment = new Payment(
						rs.getInt("ID"),
						rs.getInt("Method_ID"),
						rs.getDate("DateDone"),
						rs.getInt("Amount"),
						rs.getNString("Description")
				);
				return payment;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Payment> GetAll() {
		String sql = "exec GetAllPayments";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Payment> payments = new ArrayList<Payment>();
			while (rs.next()) {
				Payment payment = new Payment(
						rs.getInt("ID"),
						rs.getInt("Method_ID"),
						rs.getDate("DateDone"),
						rs.getInt("Amount"),
						rs.getNString("Description")
				);
				payments.add(payment);
			}
			return payments;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
<<<<<<< HEAD
	
	
	public int GetMaxPaymentID() {
		String sql = "exec GetMaxPaymentID";
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
=======
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
}
