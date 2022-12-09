package LKTFastFoods.Controllers.Manager.Voucher;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Models.Voucher;
import LKTFastFoods.Services.VoucherService;


@WebServlet(urlPatterns = {"/Delete" })
public class VoucherDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       VoucherService voucherService= new VoucherService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Lấy danh sách mã giảm giá
		List<Voucher> list = voucherService.GetAll();
		
		//Duyệt qua danh sách mã giảm giá kiểm tra radio button được chọn
		int id = -1;
		String rb;
		
		try 
		{
			
			for (Voucher voucher : list) 
			{
				rb = request.getParameter("selected"+voucher.getId());
				id = (rb != null && rb!="0") ? voucher.getId() : id; 
			}
			
			voucherService.Delete(id);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/admin/Trang-chu");	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

}
