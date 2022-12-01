package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iClientDAO {
	void Add(Client client);

	void Update(Client client);

	void Delete(String username);

	Client GetOne(String username);

	List<Client> GetAll();
}