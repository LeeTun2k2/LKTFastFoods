package vn.LKTFastFoods.Service;

import java.util.List;

import vn.LKTFastFoods.Model.CartItem;

public interface iCartItemService {
	void insert(CartItem cartItem);
	
	CartItem findOne(int id);

	List<CartItem> findByCartId(int id);

	void update(CartItem cartItem);

	void delete(int id);
}
