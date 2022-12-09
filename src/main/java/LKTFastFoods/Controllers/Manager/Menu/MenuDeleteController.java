package LKTFastFoods.Controllers.Manager.Menu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Models.Product;
import LKTFastFoods.Services.ProductService;

@WebServlet(urlPatterns = {"/" })
public class MenuDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   ProductService productService= new ProductService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Lấy danh sách sản phẩm
				List<Product> list = productService.GetAll();
				
				//Duyệt qua danh sách sản phẩm kiểm tra radio button được chọn
				int id = -1;
				String rb;
				
				try 
				{
					
					for (Product product : list) 
					{
						rb = request.getParameter("selected"+product.getId());
						id = (rb != null && rb!="0") ? product.getId() : id; 
					}
					productService.Delete(id);
				}
					catch (Exception e) {
						e.printStackTrace();
					}
				System.out.println(id);
				response.sendRedirect(request.getContextPath()+"/admin/Trang-chu");	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
