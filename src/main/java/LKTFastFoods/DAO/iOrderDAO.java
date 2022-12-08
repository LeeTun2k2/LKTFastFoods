package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iOrderDAO {
	void Add(Order order);

	void Update(Order order);

	void Delete(int id);

	Order GetOne(int id);

	List<Order> GetAll();
}