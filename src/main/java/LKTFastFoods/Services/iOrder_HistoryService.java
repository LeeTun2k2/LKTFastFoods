package LKTFastFoods.Services;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iOrder_HistoryService {
	void Add(Order_History order_History);

	void Update(Order_History order_History);

	void Delete(int id);

	Order_History GetOne(int id);

	List<Order_History> GetAll();
}