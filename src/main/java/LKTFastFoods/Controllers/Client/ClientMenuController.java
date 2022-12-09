package LKTFastFoods.Controllers.Client;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import LKTFastFoods.Models.*;
import LKTFastFoods.Services.*;

@WebServlet(urlPatterns = {"/client/Menu"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

public class ClientMenuController extends HttpServlet {
	private static final long serialVersionUID = -7372138326553980819L;
	ProductService productService = new ProductService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Load menu
		List<Menu> products = productService.GetAllMenu(); 
		req.setAttribute("products", products);
		
		// dispatcher
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/client/Menu.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
