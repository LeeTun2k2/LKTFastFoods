package LKTFastFoods.Services;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iManagerService {
	void Add(Manager manager);

	void Update(Manager manager);

	void Delete(String username);

	Manager GetOne(String username);

	List<Manager> GetAll();
}