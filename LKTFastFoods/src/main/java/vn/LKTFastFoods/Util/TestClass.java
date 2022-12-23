package vn.LKTFastFoods.Util;

import java.util.ArrayList;
import java.util.List;

import vn.LKTFastFoods.DAO.iProductDao;
import vn.LKTFastFoods.DAO.iStyleValueDao;
import vn.LKTFastFoods.DAO.Impl.ProductDaoImpl;
import vn.LKTFastFoods.Model.Product;
import vn.LKTFastFoods.Model.StyleValue;
import vn.LKTFastFoods.Service.iCartItemService;
import vn.LKTFastFoods.Service.iCartService;
import vn.LKTFastFoods.Service.iCategoryService;
import vn.LKTFastFoods.Service.iProductService;
import vn.LKTFastFoods.Service.iStyleValueService;
import vn.LKTFastFoods.Service.Impl.CartItemServiceImpl;
import vn.LKTFastFoods.Service.Impl.CartServiceImpl;
import vn.LKTFastFoods.Service.Impl.CategoryServiceImpl;
import vn.LKTFastFoods.Service.Impl.ProductServiceImpl;
import vn.LKTFastFoods.Service.Impl.StyleValueServiceImpl;

public class TestClass {

	public static void main(String[] args) {
		iCartItemService cartService = new CartItemServiceImpl();
		cartService.delete(9);
	}

}
