package vn.LKTFastFoods.DAO;

import java.util.List;

import vn.LKTFastFoods.Model.OrderItem;

public interface iOrderItemDao {
	List<OrderItem> GetOne(int id);// Hiển thị chi tiết 1 đơn hàng
	
	
}
