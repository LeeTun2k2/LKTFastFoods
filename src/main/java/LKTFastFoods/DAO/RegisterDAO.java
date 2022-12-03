package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import LKTFastFoods.Models.Account;

public class RegisterDAO implements iRegisterDAO  {
 public Connection conn= null;
 public PreparedStatement ps=null;
 public ResultSet rs= null;
	@Override
	public void insert(Account account) {
		String sql ="INSERT INTO [Client] (Email , Username, Name,BirthDate,Gender,PhoneNumber,Address) VALUES (?,?,?,?,?,?,?)";
		
	}

	@Override
	public boolean checkExistEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkExistUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkExistPhone(String Phone) {
		// TODO Auto-generated method stub
		return false;
	}


}
