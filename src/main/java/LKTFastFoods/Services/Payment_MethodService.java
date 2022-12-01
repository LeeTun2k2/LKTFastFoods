package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class Payment_MethodService implements iPayment_MethodService {
	private Payment_MethodDAO payment_MethodDAO = new Payment_MethodDAO();

	@Override
	public void Add(Payment_Method Payment_Method) {
		payment_MethodDAO.Add(Payment_Method);
	}

	@Override
	public void Update(Payment_Method Payment_Method) {		
		payment_MethodDAO.Update(Payment_Method);
	}

	@Override
	public void Delete(int id) {
		payment_MethodDAO.Delete(id);
	}

	@Override
	public Payment_Method GetOne(int id) {
		return payment_MethodDAO.GetOne(id);
	}

	@Override
	public List<Payment_Method> GetAll() {
		return payment_MethodDAO.GetAll();
	}
}