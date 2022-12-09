package LKTFastFoods.Util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.DAO.VoucherDAO;
import LKTFastFoods.DAO.iVoucherDAO;
import LKTFastFoods.Models.Voucher;
import LKTFastFoods.Services.VoucherService;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	iVoucherDAO voucherDAO = new VoucherDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			VoucherService voucherDAO =new VoucherService();
			 Voucher voucher = voucherDAO.GetOne(1);
			
	       System.out.println(voucher.getId());
	}

}
