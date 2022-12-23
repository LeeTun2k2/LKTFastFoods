package vn.LKTFastFoods.DAO;

import java.util.List;

import vn.LKTFastFoods.Model.Transaction;

public interface iTransactionDao {
	List<Transaction> GetAll();

	Transaction GetOne(int id);
}
