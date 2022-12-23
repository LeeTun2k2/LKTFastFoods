package vn.LKTFastFoods.Service.Impl;

import vn.LKTFastFoods.DAO.iStyleDao;
import vn.LKTFastFoods.DAO.Impl.StyleDaoImpl;
import vn.LKTFastFoods.Model.Style;
import vn.LKTFastFoods.Service.iStyleService;

public class StyleServiceImpl implements iStyleService{
	iStyleDao styleDao = new StyleDaoImpl();
	
	@Override
	public Style getOne(int id) {
		return styleDao.getOne(id);
	}

}
