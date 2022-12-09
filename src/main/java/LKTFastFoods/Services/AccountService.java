package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class AccountService implements iAccountService {
	private AccountDAO accountDAO = new AccountDAO();

	@Override
	public void Add(Account account) {
		accountDAO.Add(account);
	}

	@Override
	public void Update(Account account) {		
		accountDAO.Update(account);
	}

	@Override
	public void Delete(String username) {
		accountDAO.Delete(username);
	}
	
	@Override
	public Account GetOne(String username) {
		return accountDAO.GetOne(username);
	}

	@Override
	public List<Account> GetAll() {
		return accountDAO.GetAll();
	}
	
	public Account login(String username, String password) {
		Account account = this.GetOne(username);
		if (account!=null && password.equals(account.getPassword())) {
			return account;
		}
		return null;
	}
}