package vn.LKTFastFoods.Service.Impl;

import java.util.List;

import vn.LKTFastFoods.DAO.iCartItemDao;
import vn.LKTFastFoods.DAO.Impl.CartItemDaoImpl;
import vn.LKTFastFoods.Model.CartItem;
import vn.LKTFastFoods.Service.iCartItemService;

public class CartItemServiceImpl implements iCartItemService {
	iCartItemDao cartItemDao = new CartItemDaoImpl();

	@Override
	public void insert(CartItem cartItem) {
		cartItemDao.insert(cartItem);
	}

	@Override
	public List<CartItem> findByCartId(int id) {
		return cartItemDao.findByCartId(id);
	}

	@Override
	public void update(CartItem cartItem) {
		cartItemDao.update(cartItem);
	}

	@Override
	public CartItem findOne(int id) {
		return cartItemDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		cartItemDao.delete(id);
	}

}
