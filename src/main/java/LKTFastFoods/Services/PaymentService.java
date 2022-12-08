package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class PaymentService implements iPaymentService {
	private iPaymentDAO paymentDAO = new PaymentDAO();

	@Override
	public void Add(Payment Payment) {
		paymentDAO.Add(Payment);
	}

	@Override
	public void Update(Payment Payment) {		
		paymentDAO.Update(Payment);
	}

	@Override
	public void Delete(int id) {
		paymentDAO.Delete(id);
	}

	@Override
	public Payment GetOne(int id) {
		return paymentDAO.GetOne(id);
	}

	@Override
	public List<Payment> GetAll() {
		return paymentDAO.GetAll();
	}
}