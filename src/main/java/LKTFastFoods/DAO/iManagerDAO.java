package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iManagerDAO {
	void Add(Manager manager);

	void Update(Manager manager);

	void Delete(String username);

	Manager GetOne(String username);

	List<Manager> GetAll();
}