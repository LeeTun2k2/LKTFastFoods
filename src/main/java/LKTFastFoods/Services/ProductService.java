package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class ProductService implements iProductService {
	private ProductDAO productDAO = new ProductDAO();

	@Override
	public void Add(Product Product) {
		productDAO.Add(Product);
	}

	@Override
	public void Update(Product Product) {		
		productDAO.Update(Product);
	}

	@Override
	public void Delete(int id) {
		productDAO.Delete(id);
	}

	@Override
	public Product GetOne(int id) {
		return productDAO.GetOne(id);
	}

	@Override
	public List<Product> GetAll() {
		return productDAO.GetAll();
	}
	
	public List<Menu> GetAllMenu() {
		return productDAO.GetAllMenu();
	}
}