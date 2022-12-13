package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iPaymentDAO {
	void Add(Payment payment);

	void Update(Payment payment);

	void Delete(int id);

	Payment GetOne(int id);

	List<Payment> GetAll();
	List<Payment> GetAllInf();
	
}