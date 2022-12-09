package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.Account;

public class LoginDAO implements iLoginDAO {

	public Connection conn=null;
	public PreparedStatement ps = null;
	public ResultSet rs =null;
	@Override
	public Account get(String username) {
		String sql ="SELECT * FROM [Accounts] WHERE Username = ?";
		try {
			conn = new DBConnection().getConnection();
			ps= conn.prepareStatement(sql);
		    ps.setString(1,username);
		    rs = ps.executeQuery();
		    while(rs.next())
		    {
		    	Account account = new Account();
		    	account.setUsername(rs.getString("Username"));
		    	account.setPassword(rs.getString("Password"));
		    	account.setActive(rs.getBoolean("Active"));
		    	account.setRole(rs.getBoolean("Roles"));
		    	return account;
		    }
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return null;
	}
	

}
	
	

