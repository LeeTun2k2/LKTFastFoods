package LKTFastFoods.Controllers.Manager.Menu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import LKTFastFoods.Models.Product;
import LKTFastFoods.Models.Voucher;
import LKTFastFoods.Services.ProductService;

/**
 * Servlet implementation class MenuUpdateController
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
@WebServlet(urlPatterns = {"/MenuUpdate"})
public class MenuUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
        ProductService productService =new ProductService();
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShowProduct(request, response);
	}
	private void ShowProduct(HttpServletRequest request, HttpServletResponse response) {
		//Lấy danh sách mã giảm giá
		List<Product> list = productService.GetAll();
		
		//Duyệt qua danh sách mã giảm giá kiểm tra radio button được chọn
		int id = -1;
		String rb;
		Product product1 = new Product();
		try {
			
			for (Product product : list) {
				rb = request.getParameter("selected"+product.getId());
				id = (rb != null && rb!="0") ? product.getId() : id; 
			}
			
			product1 = productService.GetOne(id);
			request.setAttribute("productUpdate", product1);
			request.getRequestDispatcher("/views/admin/MenuUpdate.jsp").forward(request, response);
			System.out.print(product1.getImage());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			request.setCharacterEncoding("UTF-8");
			
			int id=Integer.parseInt(request.getParameter("id"));
		    String name=request.getParameter("name");
			int import1 =Integer.parseInt(request.getParameter("import")) ;
			int  export = Integer.parseInt(request.getParameter("export"));
			String description = request.getParameter("description");
			int voucherID=Integer.parseInt(request.getParameter("voucherID"));
			 String filename = "";
				Part part = request.getPart("image");
			    
			    if(part.getSubmittedFileName()!="") 
			    {
					//Tạo thư mục lưu file nếu chưa tồn tại
					String realPath = LKTFastFoods.Util.Constant.DIR;
					
					if (!Files.exists(Paths.get(realPath))) {
						Files.createDirectory(Paths.get(realPath));
					}
					
					//Upload file bằng Multipart
					 filename = Paths.get(part.getSubmittedFileName()).getFileName().toString(); 
					part.write(realPath + "/" + filename);
				}
			boolean status=true;
			int amount=0;
			Product product = new Product(id , name,filename, description,amount,status, import1, export, voucherID);
			
		productService.Update(product);
	} catch (Exception e) {
		e.printStackTrace();
	}
		response.sendRedirect(request.getContextPath()+"/admin/Trang-chu");
	}
	

}
