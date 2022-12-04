package LKTFastFoods.DAO;

import LKTFastFoods.Models.Account;

public class LoginService implements  iLoginService  {

	
		iLoginDAO loginDAO = new LoginDAO();

		@Override
		public Account login(String username, String password) {
			Account account = loginDAO.get(username);
			if (account!=null && password.equals(account.getPassword())) {
				return account;
			}
			return null;
	}

		@Override
		public Account get(String username) {
			// TODO Auto-generated method stub
			return loginDAO.get(username);
		}
	

}
