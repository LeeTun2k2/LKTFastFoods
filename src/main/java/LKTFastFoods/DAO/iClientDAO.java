package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iClientDAO {
	void Add(Client client);

	void Update(Client client);

	void Delete(String username);

	Client GetOne(String username);

	List<Client> GetAll();
<<<<<<< HEAD
=======
	void lockAccount(String username);
	void unLockAccount(String username);
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
}