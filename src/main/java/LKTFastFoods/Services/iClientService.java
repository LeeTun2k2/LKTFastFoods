package LKTFastFoods.Services;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iClientService {
	void Add(Client client);

	void Update(Client client);

	void Delete(String username);

	Client GetOne(String username);

	List<Client> GetAll();
}