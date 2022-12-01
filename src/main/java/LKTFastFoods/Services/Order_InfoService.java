package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class Order_InfoService implements iOrder_InfoService {
	private Order_InfoDAO order_InfoDAO = new Order_InfoDAO();

	@Override
	public void Add(Order_Info Order_Info) {
		order_InfoDAO.Add(Order_Info);
	}

	@Override
	public void Update(Order_Info Order_Info) {		
		order_InfoDAO.Update(Order_Info);
	}

	@Override
	public void Delete(int id) {
		order_InfoDAO.Delete(id);
	}

	@Override
	public Order_Info GetOne(int id) {
		return order_InfoDAO.GetOne(id);
	}

	@Override
	public List<Order_Info> GetAll() {
		return order_InfoDAO.GetAll();
	}
}