package vn.LKTFastFoods.Service;

import java.util.List;

import vn.LKTFastFoods.Model.Category;

public interface iCategoryService {
	public Category findById(int id);

	Category getOne(int id);

	List<Category> getAll();
}