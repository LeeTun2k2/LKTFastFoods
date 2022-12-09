package LKTFastFoods.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class ClientDAO extends DBConnection implements iClientDAO{
	@Override
	public void Add(Client client) {
		String sql = "exec AddClient ?, ?, ?, ? ,? ,?, ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, client.getUsername());
			ps.setNString(2, client.getName());
			ps.setDate(3, new java.sql.Date(client.getBirthDate().getTime()));
			ps.setBoolean(4, client.isGender());
			ps.setString(5, client.getPhoneNumber());
			ps.setString(6, client.getEmail());
			ps.setNString(7, client.getAddress());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Client client) {
		String sql = "exec UpdateClient ?, ? ,?, ?, ?, ? ,? ";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, client.getUsername());
			ps.setNString(2, client.getName());
			ps.setDate(3, new java.sql.Date(client.getBirthDate().getTime()));
			ps.setBoolean(4, client.isGender());
			ps.setString(5, client.getPhoneNumber());
			ps.setString(6, client.getEmail());
			ps.setNString(7, client.getAddress());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(String username) {
		String sql = "exec DeleteClient ?";
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
	public Client GetOne(String username) {
		String sql = "exec GetOneClient ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Client client = new Client(
						username,
						rs.getNString("Name"),
						rs.getDate("BirthDate"),
						rs.getBoolean("Gender"),
						rs.getString("PhoneNumber"),
						rs.getString("Email"),
						rs.getNString("Address")
				);
				return client;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Client> GetAll() {
		String sql = "select * from Clients join Accounts on Clients.Username= Accounts.Username";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Client> Clients = new ArrayList<Client>();
			while (rs.next()) {
				Client client = new Client(
						rs.getString("Username"),
						rs.getNString("Name"),
						rs.getDate("BirthDate"),
						rs.getBoolean("Gender"),
						rs.getString("PhoneNumber"),
						rs.getString("Email"),
						rs.getNString("Address"),
						rs.getBoolean("Active")
				);
				Clients.add(client);
			}
			return Clients;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void lockAccount(String username) {
		String sql = "UPDATE Accounts SET Active=0 WHERE Accounts.Username= ?";
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
	public void unLockAccount(String username) {
		String sql = "UPDATE Accounts SET Active=1 WHERE Accounts.Username= ?";
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
}
