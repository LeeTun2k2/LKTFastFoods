package vn.LKTFastFoods.Service;

import java.util.List;

import vn.LKTFastFoods.Model.StyleValue;

public interface iStyleValueService {
	StyleValue getOne(int id);

	List<StyleValue> getAlLById(int id);
}
