package LKTFastFoods.Controllers.Manager.Voucher;

import java.awt.Window.Type;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Models.Voucher;
import LKTFastFoods.Services.VoucherService;


@WebServlet(urlPatterns = {"/add"})
public class VoucherAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/admin/VoucherAction.jsp");
		dispatcher.forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String dateStart=request.getParameter("start-date");
	    String dateEnd=request.getParameter("end-date");
		int Value=Integer.parseInt(request.getParameter("value"));
		Voucher voucher = new Voucher(dateStart,dateEnd,Value);
		
		VoucherService voucherService = new VoucherService();
		voucherService.Add(voucher);
		response.sendRedirect(request.getContextPath()+"/admin/Trang-chu");
}
}
