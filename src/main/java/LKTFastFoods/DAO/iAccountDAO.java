package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iAccountDAO {
	void Add(Account account);

	void Update(Account account);

	void Delete(String username);

	Account GetOne(String username);

	List<Account> GetAll();
}