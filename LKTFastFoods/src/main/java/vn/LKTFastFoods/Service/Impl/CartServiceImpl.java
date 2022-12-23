package vn.LKTFastFoods.Service.Impl;

import vn.LKTFastFoods.DAO.iCartDao;
import vn.LKTFastFoods.DAO.Impl.CartDaoImpl;
import vn.LKTFastFoods.Model.Cart;
import vn.LKTFastFoods.Service.iCartService;

public class CartServiceImpl implements iCartService {
	iCartDao cartDao = new CartDaoImpl();

	@Override
	public void insert(Cart cart) {
		cartDao.insert(cart);
	}

	@Override
	public Cart findLast() {
		return cartDao.findLast();
	}


	@Override
	public Cart findLastByUserId(int id) {
		return cartDao.findLastByUserId(id);
	}
	
}
