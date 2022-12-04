package LKTFastFoods.Controllers.Manager;

import java.util.List;

import LKTFastFoods.DAO.AccountDAO;
import LKTFastFoods.DAO.Order_HistoryDAO;
import LKTFastFoods.DAO.VoucherDAO;
import LKTFastFoods.Models.Account;
import LKTFastFoods.Models.Order_History;
import LKTFastFoods.Models.Voucher;

public class test {

	

	public static void main(String[] args) {
		Order_HistoryDAO dao = new Order_HistoryDAO();
		List<Order_History> list =dao.GetAll();
for (Order_History o :list) {
	System.out.println(o);
}

	}
}
