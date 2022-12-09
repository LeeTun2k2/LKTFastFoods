package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iVoucherDAO {

	void Add(Voucher voucher);

	void Update(Voucher Voucher);

	void Delete(int id);

	Voucher GetOne(int id);

	List<Voucher> GetAll();
}