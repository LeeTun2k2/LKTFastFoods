package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iProductDAO {
	void Add(Product product);

	void Update(Product product);

	void Delete(int id);

	Product GetOne(int id);

	List<Product> GetAll();
}