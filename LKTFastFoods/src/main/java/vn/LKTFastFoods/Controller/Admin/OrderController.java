package vn.LKTFastFoods.Controller.Admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.LKTFastFoods.Model.Order;
import vn.LKTFastFoods.Model.OrderItem;
import vn.LKTFastFoods.Service.iOrderItemService;
import vn.LKTFastFoods.Service.iOrderService;
import vn.LKTFastFoods.Service.Impl.OrderItemServiceImpl;
import vn.LKTFastFoods.Service.Impl.OrderServiceImpl;
import vn.LKTFastFoods.Service.Impl.StyleValueServiceImpl;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
		maxFileSize = 1024 * 1024 * 10,
		maxRequestSize = 1024 * 1024 * 50)
@WebServlet(urlPatterns = { "/admin/order", "/admin/order/detail", "/admin/order/updatenotprocessed",
		"/admin/order/updateshipped", "/admin/order/updateprocessing", "/admin/order/updatecancelled" })

public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 8361316640356417976L;
	iOrderService orderService = new OrderServiceImpl();
	iOrderItemService orderItemService = new OrderItemServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();
		
		if (url.endsWith("detail")) {
			OrderDetail(req, resp);
		}

		List<Order> listOrders = new ArrayList<Order>();
		listOrders = orderService.GetAll(0, 100);
		req.setAttribute("listOrders", listOrders);

		List<Order> listOrdersNotProcessed = new ArrayList<Order>();
		listOrdersNotProcessed = orderService.GetByStatus("not processed");
		req.setAttribute("listOrdersNotProcessed", listOrdersNotProcessed);

		List<Order> listOrdersProcessing = new ArrayList<Order>();
		listOrdersProcessing = orderService.GetByStatus("processing");
		req.setAttribute("listOrdersProcessing", listOrdersProcessing);

		List<Order> listOrdersShipped = new ArrayList<Order>();
		listOrdersShipped = orderService.GetByStatus("shipped");
		req.setAttribute("listOrdersShipped", listOrdersShipped);

		List<Order> listOrdersDelivered = new ArrayList<Order>();
		listOrdersDelivered = orderService.GetByStatus("delivered");
		req.setAttribute("listOrdersDelivered", listOrdersDelivered);

		List<Order> listOrdersCancelled = new ArrayList<Order>();
		listOrdersCancelled = orderService.GetByStatus("cancelled");
		req.setAttribute("listOrdersCancelled", listOrdersCancelled);

		if (url.contains("updatenotprocessed")) {
			int id = Integer.parseInt(req.getParameter("id"));
			orderService.UpdateStatus(id, "processing");
			resp.sendRedirect(req.getContextPath() + "/admin/order/list");
			return;
		}

		if (url.contains("updateprocessing")) {
			int id = Integer.parseInt(req.getParameter("id"));
			orderService.UpdateStatus(id, "shipped");
			resp.sendRedirect(req.getContextPath() + "/admin/order/list");
			return;
		}
		if (url.contains("updateshipped")) {
			int id = Integer.parseInt(req.getParameter("id"));
			orderService.UpdateStatus(id, "delivered");
			resp.sendRedirect(req.getContextPath() + "/admin/order/list");
			return;
		}
		if (url.contains("updatecancelled")) {
			int id = Integer.parseInt(req.getParameter("id"));
			orderService.UpdateStatus(id, "cancelled");
			resp.sendRedirect(req.getContextPath() + "/admin/order/list");
			return;
		}

		req.getRequestDispatcher("/views/admin/order/order-list.jsp").forward(req, resp);

	}

	private void OrderDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		int id = Integer.parseInt(req.getParameter("oid"));
		Order order = orderService.GetOneJoinUser(id);
		req.setAttribute("order", order);
		List<OrderItem> list = new ArrayList<OrderItem>();
		list = orderItemService.GetOne(id);

		req.setAttribute("listItem", list);
		req.setAttribute("service", new StyleValueServiceImpl());
		req.getRequestDispatcher("/views/admin/order/order-detail.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
	}

}
