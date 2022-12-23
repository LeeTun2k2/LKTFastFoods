package vn.LKTFastFoods.Service;

import vn.LKTFastFoods.Model.Cart;

public interface iCartService {
	void insert(Cart cart);

	Cart findLast();

	Cart findLastByUserId(int id);
}
