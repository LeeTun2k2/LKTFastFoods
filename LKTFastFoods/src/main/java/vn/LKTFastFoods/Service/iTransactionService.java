package vn.LKTFastFoods.Service;

import java.util.List;

import vn.LKTFastFoods.Model.Transaction;

public interface iTransactionService {
	List<Transaction> GetAll();
	Transaction GetOne(int id);
}
