package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class Order_HistoryService implements iOrder_HistoryService {
	private Order_HistoryDAO order_HistoryDAO = new Order_HistoryDAO();

	@Override
	public void Add(Order_History order_History) {
		order_HistoryDAO.Add(order_History);
	}

	@Override
	public void Update(Order_History order_History) {		
		order_HistoryDAO.Update(order_History);
	}

	@Override
	public void Delete(int id) {
		order_HistoryDAO.Delete(id);
	}

	@Override
	public Order_History GetOne(int id) {
		return order_HistoryDAO.GetOne(id);
	}

	@Override
	public List<Order_History> GetAll() {
		return order_HistoryDAO.GetAll();
	}
	
	public List<PersonalHistory> GetPersonalHistory(String username)
	{
		return order_HistoryDAO.GetPersonalHistory(username);
	}
}