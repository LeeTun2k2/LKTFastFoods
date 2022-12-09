package LKTFastFoods.Services;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iProductService {
	void Add(Product product);

	void Update(Product product);

	void Delete(int id);

	Product GetOne(int id);

	List<Product> GetAll();
}