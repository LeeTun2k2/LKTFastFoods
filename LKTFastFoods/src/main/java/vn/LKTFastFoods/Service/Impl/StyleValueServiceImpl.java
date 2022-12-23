package vn.LKTFastFoods.Service.Impl;

import java.util.List;

import vn.LKTFastFoods.DAO.iStyleValueDao;
import vn.LKTFastFoods.DAO.Impl.StyleValueDaoImpl;
import vn.LKTFastFoods.Model.StyleValue;
import vn.LKTFastFoods.Service.iStyleValueService;

public class StyleValueServiceImpl implements iStyleValueService {
	iStyleValueDao styleValueDao = new StyleValueDaoImpl();

	@Override
	public StyleValue getOne(int id) {
		return styleValueDao.getOne(id);
	}

	@Override
	public List<StyleValue> getAlLById(int id) {
		return styleValueDao.getAllById(id);
	}

}
