package vn.LKTFastFoods.Controller.Vendor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import vn.LKTFastFoods.DAO.Impl.CategoryDaoImpl;
import vn.LKTFastFoods.DAO.Impl.ProductDaoImpl;
import vn.LKTFastFoods.Model.Category;
import vn.LKTFastFoods.Model.Product;
import vn.LKTFastFoods.Model.Store;
import vn.LKTFastFoods.Model.StyleValue;
import vn.LKTFastFoods.Model.User;
import vn.LKTFastFoods.Service.Impl.CategoryServiceImpl;
import vn.LKTFastFoods.Service.Impl.ProductServiceImpl;
import vn.LKTFastFoods.Service.Impl.StoreServiceImpl;
import vn.LKTFastFoods.Service.Impl.StyleValueServiceImpl;
import vn.LKTFastFoods.Util.Constant;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, 
		maxFileSize = 1024 * 1024 * 10,
		maxRequestSize = 1024 * 1024 * 50)
@WebServlet(urlPatterns = { "/vendor/addProduct" })
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StoreServiceImpl storeServiceImpl = new StoreServiceImpl();
	CategoryServiceImpl categoryService = new CategoryServiceImpl();
	StyleValueServiceImpl styleService = new StyleValueServiceImpl();
	ProductServiceImpl productService = new ProductServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		HttpSession session = req.getSession();
		User users = (User) session.getAttribute("account");
		List<Category> listCategory = new ArrayList<Category>();
		List<StyleValue> listStyleColor = new ArrayList<StyleValue>();
		List<StyleValue> listStylesize = new ArrayList<StyleValue>();
		List<StyleValue> listStyletype = new ArrayList<StyleValue>();
		List<Store> listStoreId = new ArrayList<Store>();
		listCategory = categoryService.getAll();
		listStyleColor = styleService.getAlLById(1);// m??u
		listStylesize = styleService.getAlLById(2);// size
		listStyletype = styleService.getAlLById(3);// type
		listStoreId = storeServiceImpl.GetStoreByownerId(users.getId());
		req.setAttribute("listStoreId", listStoreId);
		req.setAttribute("listCategory", listCategory);
		req.setAttribute("listStyleColor", listStyleColor);
		req.setAttribute("listStylesize", listStylesize);
		req.setAttribute("listStyletype", listStyletype);

		req.getRequestDispatcher("/views/vendor/ProductAdd.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String filenamecover = "";
		Part part1 = request.getPart("featured_image");

		if (part1.getSubmittedFileName() != "") {
			String realPath1 = Constant.DIR;

			if (!Files.exists(Paths.get(realPath1))) {
				Files.createDirectory(Paths.get(realPath1));
			}
			filenamecover = Paths.get(part1.getSubmittedFileName()).getFileName().toString();
			part1.write(realPath1 + "/" + filenamecover);
		}
		List<String> listImages = new ArrayList<String>();
		String descripsion = request.getParameter("descripsion");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		int category = Integer.parseInt(request.getParameter("category"));
		int storeId = Integer.parseInt(request.getParameter("storeId"));
		int color = Integer.parseInt(request.getParameter("Style-color"));
		int size = Integer.parseInt(request.getParameter("Style-size"));
		int type = Integer.parseInt(request.getParameter("Style-type"));
		List<Integer> styleVaLueIds = new ArrayList<Integer>();
		styleVaLueIds.add(color);
		styleVaLueIds.add(size);
		styleVaLueIds.add(type);
		double price = Integer.parseInt(request.getParameter("price"));
		listImages.add(filenamecover);
		Product product = new Product(name, descripsion, price, price, quantity, listImages, category, styleVaLueIds, storeId);
		productService.Add(product);
		response.sendRedirect(request.getContextPath() + "/vendor/ListProduct");
	}
}
