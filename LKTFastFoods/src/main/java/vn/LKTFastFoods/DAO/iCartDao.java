package vn.LKTFastFoods.DAO;

import vn.LKTFastFoods.Model.Cart;

public interface iCartDao {
	void insert(Cart cart);

	Cart findLast();

	Cart findLastByUserId(int id);
}
