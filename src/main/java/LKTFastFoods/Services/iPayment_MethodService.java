package LKTFastFoods.Services;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iPayment_MethodService {
	void Add(Payment_Method payment_Method);

	void Update(Payment_Method payment_Method);

	void Delete(int id);

	Payment_Method GetOne(int id);

	List<Payment_Method> GetAll();
}