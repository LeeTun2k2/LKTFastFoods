package vn.LKTFastFoods.Controller.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.LKTFastFoods.Model.Store;
import vn.LKTFastFoods.Service.Impl.StoreServiceImpl;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, 
		maxFileSize = 1024 * 1024 * 10, 
		maxRequestSize = 1024 * 1024 * 50)
@WebServlet(urlPatterns = { "/admin/store", "/admin/store/detail", "/admin/store/permit", "/admin/store/ban" })
public class StoreController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5651777958061465387L;
	StoreServiceImpl storeServiceImpl = new StoreServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();


		if (url.endsWith("/store")) {
			StoreList(req, resp);
		}
		else if (url.endsWith("/detail")) {
			StoreDetail(req, resp);
		} 

	}

	private void StoreList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Store> listStore = storeServiceImpl.getAll(0, 100);

		req.setAttribute("listStore", listStore);

		req.getRequestDispatcher("/views/admin/store/store-list.jsp").forward(req, resp);
	}

	private void StoreDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer storeId = Integer.parseInt(req.getParameter("storeId"));

		Store store = storeServiceImpl.GetOne(storeId);

		req.setAttribute("storeDetail", store);

		req.getRequestDispatcher("/views/admin/store/store-detail.jsp").forward(req, resp);
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
	}

}
