package LKTFastFoods.Services;

import java.sql.Date;
import java.util.List;
import LKTFastFoods.Models.*;

public interface iVoucherService {
	void Add(Voucher voucher);

	void Update(Voucher Voucher);

	void Delete(int id);

	Voucher GetOne(int id);

	List<Voucher> GetAll();
}