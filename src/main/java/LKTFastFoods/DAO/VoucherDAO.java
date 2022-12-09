package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class VoucherDAO extends DBConnection implements iVoucherDAO{
	@Override
	public void Add(Voucher voucher) {
<<<<<<< HEAD
		String sql = "exec AddVoucher ? ? ? ";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDate(1, voucher.getStartDate());
			ps.setDate(2, voucher.getEndDate());
=======
		String sql = "exec AddVoucher ?, ?, ? ";
		try { 
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDate(1, new java.sql.Date(voucher.getStartDate().getTime()));
			ps.setDate(2, new java.sql.Date(voucher.getEndDate().getTime()));
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
			ps.setInt(3, voucher.getDiscount());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Voucher voucher) {
<<<<<<< HEAD
		String sql = "exec UpdateVoucher ? ? ? ?";
=======
		String sql = "exec UpdateVoucher ?, ?, ?, ?";
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, voucher.getId());
<<<<<<< HEAD
			ps.setDate(2, voucher.getStartDate());
			ps.setDate(3, voucher.getEndDate());
=======
			ps.setDate(2, new java.sql.Date(voucher.getStartDate().getTime()));
			ps.setDate(3, new java.sql.Date(voucher.getEndDate().getTime()));
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
			ps.setInt(4, voucher.getDiscount());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(int id) {
		String sql = "exec DeleteVoucher ?";
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
<<<<<<< HEAD
	public Voucher GetOne(int id) {
=======
	public  Voucher GetOne(int id) {
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		String sql = "exec GetOneVoucher ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Voucher voucher = new Voucher(
						rs.getInt("ID"),
						rs.getDate("Start_Date"),
						rs.getDate("End_Date"),
						rs.getInt("Discount")
				);
				return voucher;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Voucher> GetAll() {
		String sql = "exec GetAllVouchers";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Voucher> vouchers = new ArrayList<Voucher>();
			while (rs.next()) {
				Voucher voucher = new Voucher(
						rs.getInt("ID"),
						rs.getDate("Start_Date"),
						rs.getDate("End_Date"),
						rs.getInt("Discount")
				);
				vouchers.add(voucher);
			}
			return vouchers;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
