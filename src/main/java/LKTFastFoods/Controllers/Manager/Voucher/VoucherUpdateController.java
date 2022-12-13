package LKTFastFoods.Controllers.Manager.Voucher;

import java.io.IOException;
import java.util.List;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Models.Voucher;
import LKTFastFoods.Services.VoucherService;
import LKTFastFoods.Services.iVoucherService;


@WebServlet(urlPatterns = {"/Update" })
public class VoucherUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   iVoucherService voucherService = new VoucherService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		ShowVoucher(request, response);
	}
	// Đưa voucher đã chọn lên form 
	private void ShowVoucher(HttpServletRequest request, HttpServletResponse response) {
		//Lấy danh sách mã giảm giá
		List<Voucher> list = voucherService.GetAll();
		
		//Duyệt qua danh sách mã giảm giá kiểm tra radio button được chọn
		int id = -1;
		String rb;
		
		try {
			
			for (Voucher voucher : list) {
				rb = request.getParameter("selected"+voucher.getId());
				id = (rb != null && rb!="0") ? voucher.getId() : id; 
			}
			
			Voucher voucher = voucherService.GetOne(id);
			request.setAttribute("voucherx", voucher);
			
			request.getRequestDispatcher("/views/admin/VoucherUpdate.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
			String dateStart=request.getParameter("start-date");
		    String dateEnd=request.getParameter("end-date");
			int Value=Integer.parseInt(request.getParameter("value"));
			int id=Integer.parseInt(request.getParameter("id"));
			Voucher voucher = new Voucher(id, dateStart, dateEnd, Value);
		    voucherService.Update(voucher);
	
	
		response.sendRedirect(request.getContextPath()+"/admin/Trang-chu");
	}

}
