package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class ClientService implements iClientService {
	private ClientDAO clientDAO = new ClientDAO();

	@Override
	public void Add(Client Client) {
		clientDAO.Add(Client);
	}

	@Override
	public void Update(Client Client) {		
		clientDAO.Update(Client);
	}

	@Override
	public void Delete(String username) {
		clientDAO.Delete(username);
	}

	@Override
	public Client GetOne(String username) {
		return clientDAO.GetOne(username);
	}

	@Override
	public List<Client> GetAll() {
		return clientDAO.GetAll();
	}
	
	@Override
	public void lockAccount(String username) {
		 clientDAO.lockAccount(username);
		
	}
	@Override
	public void unLockAccount(String username) {
		 clientDAO.unLockAccount(username);
		
	}

}