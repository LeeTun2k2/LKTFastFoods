package LKTFastFoods.Controllers.Manager.Menu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import LKTFastFoods.Models.Product;
import LKTFastFoods.Services.ProductService;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
@WebServlet(urlPatterns = {"/MenuAdd" })
public class MenuAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ProductService productService= new ProductService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/admin/MenuAction.jsp");
		dispatcher.forward(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		int id =Integer.parseInt(request.getParameter("id")) ;
		String name = request.getParameter("name");
		int import1= Integer.parseInt(request.getParameter("import"));
		int export= Integer.parseInt(request.getParameter("export"));
	    int idVoucher=Integer.parseInt(request.getParameter("voucherID")) ;
	    boolean status=true;
	    String description=request.getParameter("description");
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
	   
	    Product product = new Product(id, name, filename, description, 0, status, import1, export, idVoucher);
	   
	    productService.Add(product);
	    response.sendRedirect(request.getContextPath()+"/admin/Trang-chu");
	}

}
