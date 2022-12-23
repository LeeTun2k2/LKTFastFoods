package vn.LKTFastFoods.Service.Impl;

import java.util.List;

import vn.LKTFastFoods.DAO.Impl.TransactionDaoImpl;
import vn.LKTFastFoods.Model.Transaction;
import vn.LKTFastFoods.Service.iTransactionService;

public class TransactionServiceImpl implements iTransactionService {
   private TransactionDaoImpl transactionDaoImpl = new TransactionDaoImpl();
	@Override
	public List<Transaction> GetAll() {
		return transactionDaoImpl.GetAll() ;
	}

	@Override
	public Transaction GetOne(int id) {
		return transactionDaoImpl.GetOne(id);
	}

}
