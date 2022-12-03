package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class MenuService implements iMenuService{
	private MenuDAO menuDAO = new MenuDAO();

	@Override
	public List<Menu> GetAll() {
		return menuDAO.GetAll();
	}
}
