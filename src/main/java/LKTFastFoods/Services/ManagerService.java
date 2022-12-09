package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class ManagerService implements iManagerService {
	private ManagerDAO managerDAO = new ManagerDAO();

	@Override
	public void Add(Manager Manager) {
		managerDAO.Add(Manager);
	}

	@Override
	public void Update(Manager Manager) {		
		managerDAO.Update(Manager);
	}

	@Override
	public void Delete(String username) {
		managerDAO.Delete(username);
	}

	@Override
	public Manager GetOne(String username) {
		return managerDAO.GetOne(username);
	}

	@Override
	public List<Manager> GetAll() {
		return managerDAO.GetAll();
	}
}