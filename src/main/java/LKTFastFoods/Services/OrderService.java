package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class OrderService implements iOrderService {
	private OrderDAO orderDAO = new OrderDAO();

	@Override
	public void Add(Order Order) {
		orderDAO.Add(Order);
	}

	@Override
	public void Update(Order Order) {		
		orderDAO.Update(Order);
	}

	@Override
	public void Delete(int id) {
		orderDAO.Delete(id);
	}

	@Override
	public Order GetOne(int id) {
		return orderDAO.GetOne(id);
	}

	@Override
	public List<Order> GetAll() {
		return orderDAO.GetAll();
	}
	
	public int GetMaxOrderID() {
		return orderDAO.GetMaxOrderID();
	}
}