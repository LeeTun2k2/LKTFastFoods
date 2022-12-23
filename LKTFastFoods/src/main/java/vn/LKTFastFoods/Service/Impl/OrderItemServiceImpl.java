package vn.LKTFastFoods.Service.Impl;

import java.util.List;

import vn.LKTFastFoods.DAO.Impl.OrderItemDaoImpl;
import vn.LKTFastFoods.Model.OrderItem;
import vn.LKTFastFoods.Service.iOrderItemService;

public class OrderItemServiceImpl implements iOrderItemService {
      private OrderItemDaoImpl orderItemDaoImpl= new OrderItemDaoImpl();
	@Override
	public List<OrderItem> GetOne(int id) {
		return orderItemDaoImpl.GetOne(id);
	}

}
