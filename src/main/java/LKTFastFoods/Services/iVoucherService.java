package LKTFastFoods.Services;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iVoucherService {
	void Add(Voucher Voucher);

	void Update(Voucher Voucher);

	void Delete(int id);

	Voucher GetOne(int id);

	List<Voucher> GetAll();
}