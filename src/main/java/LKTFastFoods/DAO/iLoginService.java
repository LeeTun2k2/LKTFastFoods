package LKTFastFoods.DAO;

import LKTFastFoods.Models.Account;

public interface iLoginService {
	public Account login(String username, String password);
	
	public Account get(String username);
}
