package vn.LKTFastFoods.DAO;

import java.util.List;

import vn.LKTFastFoods.Model.StyleValue;

public interface iStyleValueDao {
	StyleValue getOne(int id);
	List<StyleValue> getAllById(int id);
}
