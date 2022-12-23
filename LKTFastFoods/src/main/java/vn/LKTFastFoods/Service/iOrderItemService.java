package vn.LKTFastFoods.Service;

import java.util.List;

import vn.LKTFastFoods.Model.OrderItem;

public interface iOrderItemService {
	List<OrderItem> GetOne(int id);//Hiển thị chi tiết 1 đơn hàng 
}
