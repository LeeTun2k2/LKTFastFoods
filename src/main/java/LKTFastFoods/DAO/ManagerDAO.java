package LKTFastFoods.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class ManagerDAO extends DBConnection implements iManagerDAO{
	@Override
	public void Add(Manager manager) {
		String sql = "exec AddManager ? ? ? ? ? ? ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, manager.getUsername());
			ps.setNString(2, manager.getName());
			ps.setDate(3, manager.getBirthDate());
			ps.setBoolean(4, manager.isGender());
			ps.setString(5, manager.getPhoneNumber());
			ps.setString(6, manager.getEmail());
			ps.setNString(7, manager.getAddress());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Manager manager) {
		String sql = "exec UpdateManager ? ? ? ? ? ? ? ";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, manager.getUsername());
			ps.setNString(2, manager.getName());
			ps.setDate(3, manager.getBirthDate());
			ps.setBoolean(4, manager.isGender());
			ps.setString(5, manager.getPhoneNumber());
			ps.setString(6, manager.getEmail());
			ps.setNString(7, manager.getAddress());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(String username) {
		String sql = "exec DeleteManager ?";
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
	public Manager GetOne(String username) {
		String sql = "exec GetOneManager ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Manager manager = new Manager(
						username,
						rs.getNString("Name"),
						rs.getDate("BirthDate"),
						rs.getBoolean("Gender"),
						rs.getString("PhoneNumber"),
						rs.getString("Email"),
						rs.getNString("Address")
				);
				return manager;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Manager> GetAll() {
		String sql = "exec GetAllManagers";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Manager> managers = new ArrayList<Manager>();
			while (rs.next()) {
				Manager manager = new Manager(
						rs.getString("Username"),
						rs.getNString("Name"),
						rs.getDate("BirthDate"),
						rs.getBoolean("Gender"),
						rs.getString("PhoneNumber"),
						rs.getString("Email"),
						rs.getNString("Address")
				);
				managers.add(manager);
			}
			return managers;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
