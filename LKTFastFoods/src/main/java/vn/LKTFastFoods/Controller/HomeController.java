package vn.LKTFastFoods.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.LKTFastFoods.Model.Category;
import vn.LKTFastFoods.Model.Product;
import vn.LKTFastFoods.Model.User;
import vn.LKTFastFoods.Service.iCategoryService;
import vn.LKTFastFoods.Service.iProductService;
import vn.LKTFastFoods.Service.Impl.CategoryServiceImpl;
import vn.LKTFastFoods.Service.Impl.ProductServiceImpl;

@WebServlet(urlPatterns = {"/home","/vendor/home","/admin/home"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	iProductService productService = new ProductServiceImpl();
	iCategoryService categoryService = new CategoryServiceImpl();
	
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();
		
		HttpSession session = req.getSession();
		User account_cur = (User) session.getAttribute("account");
		
		if (url.contains("vendor")) {
			req.getRequestDispatcher("/views/vendor/index.jsp").forward(req, resp);
		}
		else if (url.contains("admin")) {
			req.getRequestDispatcher("/views/admin/index.jsp").forward(req, resp);
		} else {
			LoadCategories(req,resp);
			LoadTopProducts(req,resp);
			req.getRequestDispatcher("/views/web/home.jsp").forward(req, resp);
		}

	}

	private void LoadCategories(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Category> listCategories = new ArrayList<Category>();
		listCategories.add(categoryService.findById(2));
		listCategories.add(categoryService.findById(3));
		listCategories.add(categoryService.findById(4));
		listCategories.add(categoryService.findById(5));
		listCategories.add(categoryService.findById(6));
		listCategories.add(categoryService.findById(7));
		
		req.setAttribute("CatList", listCategories);
	}

	private void LoadTopProducts(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> listProduct_TopNew = productService.findTop_Created(0,8);
		List<Product> listProduct_TopPromo = productService.findTop_Promo(0, 8);
		req.setAttribute("ListNew", listProduct_TopNew);
		req.setAttribute("ListPromo", listProduct_TopPromo);		
	}
}
