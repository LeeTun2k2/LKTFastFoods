package vn.LKTFastFoods.Service.Impl;

import java.util.List;

import vn.LKTFastFoods.DAO.iCategoryDao;
import vn.LKTFastFoods.DAO.Impl.CategoryDaoImpl;
import vn.LKTFastFoods.Model.Category;
import vn.LKTFastFoods.Service.iCategoryService;

public class CategoryServiceImpl implements iCategoryService {

	iCategoryDao categoryDao = new CategoryDaoImpl();

	@Override
	public Category findById(int id) {
		return categoryDao.findById(id);
	}

	@Override
	public Category getOne(int id) {

		return categoryDao.getOne(id);
	}

	@Override
	public List<Category> getAll() {
		return categoryDao.getAll();
	}

}
