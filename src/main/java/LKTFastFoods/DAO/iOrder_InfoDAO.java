package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iOrder_InfoDAO {
	void Add(Order_Info order_Info);

	void Update(Order_Info order_Info);

	void Delete(int id);

	Order_Info GetOne(int id);

	List<Order_Info> GetAll();
}