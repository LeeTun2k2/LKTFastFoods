package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iVoucherDAO {
<<<<<<< HEAD
	void Add(Voucher Voucher);
=======
	void Add(Voucher voucher);
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b

	void Update(Voucher Voucher);

	void Delete(int id);

	Voucher GetOne(int id);

	List<Voucher> GetAll();
}