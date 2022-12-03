package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class VoucherService implements iVoucherService {
	private VoucherDAO voucherDAO = new VoucherDAO();

	@Override
	public void Add(Voucher Voucher) {
		voucherDAO.Add(Voucher);
	}

	@Override
	public void Update(Voucher Voucher) {		
		voucherDAO.Update(Voucher);
	}

	@Override
	public void Delete(int id) {
		voucherDAO.Delete(id);
	}

	@Override
	public Voucher GetOne(int id) {
		return voucherDAO.GetOne(id);
	}

	@Override
	public List<Voucher> GetAll() {
		return voucherDAO.GetAll();
	}
}