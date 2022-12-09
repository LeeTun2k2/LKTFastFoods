package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class AccountDAO extends DBConnection implements iAccountDAO{
	@Override
	public void Add(Account account) {

		String sql = "exec AddAccount ?, ?, ?, ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, account.getUsername());
			ps.setString(2, account.getPassword());
			ps.setBoolean(3, account.isRole());
			ps.setBoolean(4, account.isActive());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Account account) {
		String sql = "exec UpdateAccount ?, ? ,?, ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, account.getUsername());
			ps.setString(2, account.getPassword());
			ps.setBoolean(3, account.isRole());
			ps.setBoolean(4, account.isActive());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(String username) {
		String sql = "exec DeleteAccount ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Account GetOne(String username) {
		String sql = "exec GetOneAccount ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Account account = new Account(
						username,
						rs.getString("Password"),
						rs.getBoolean("Roles"),
						rs.getBoolean("Active")	
				);
				return account;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Account> GetAll() {
		String sql = "exec GetAllAccounts";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Account> accounts = new ArrayList<Account>();
			while (rs.next()) {
				Account account = new Account(
						rs.getString("Username"),
						rs.getString("Password"),
						rs.getBoolean("Roles"),
						rs.getBoolean("Active")	
				);
				accounts.add(account);
			}
			return accounts;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
