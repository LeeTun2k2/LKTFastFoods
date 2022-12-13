package LKTFastFoods.Controllers.Manager;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Models.*;
import LKTFastFoods.Services.*;

@WebServlet(urlPatterns = {"/admin/Trang-chu"})
public class AdminHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountService accountService = new AccountService();
	AssessmentService assessmentService = new AssessmentService();
	ClientService clientService = new ClientService();
	ManagerService managerService = new ManagerService();
	Order_HistoryService order_HistoryService = new Order_HistoryService();
	Order_InfoService order_InfoService = new Order_InfoService();
	OrderService orderService = new OrderService();
	Payment_MethodService payment_MethodService = new Payment_MethodService();
	PaymentService paymentService = new PaymentService();
	ProductService productService = new ProductService();
	VoucherService voucherService = new VoucherService();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Load dữ liệu lên bảng Tài khoản
		List<Client> listClient = clientService.GetAll();
		req.setAttribute("listS", listClient);
		
		//Load dữ liệu lên bảng mã giảm giá
		List<Voucher> listVoucher =voucherService.GetAll();
		req.setAttribute("listVoucher", listVoucher);
		
		//Load dữ liệu lên bảng menu
		List<Product> listProduct = productService.GetAll();
		req.setAttribute("listProduct", listProduct); 
		
		//Load dữ liệu lên bảng đơn hàng
				List<Payment> listOrderInf =paymentService.GetAllInf();
				req.setAttribute("listOrderInf", listOrderInf);
				
		//Load dữ liệu lên bảng đánh giá 
		List<Order_History> listOrder= order_HistoryService.GetAll();
		req.setAttribute("listOrder", listOrder);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/admin/Home.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Load dữ liệu lên bảng Tài khoản
				List<Client> listClient = clientService.GetAll();
				req.setAttribute("listS", listClient);
				
				//Load dữ liệu lên bảng mã giảm giá
				List<Voucher> listVoucher =voucherService.GetAll();
				req.setAttribute("listVoucher", listVoucher);
				
				//Load dữ liệu lên bảng menu
				List<Product> listProduct = productService.GetAll();
				req.setAttribute("listProduct", listProduct);
				
				//Load dữ liệu lên bảng đơn hàng
				List<Order_History> listOrder= order_HistoryService.GetAll();
				req.setAttribute("listOrder", listOrder);			
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/admin/Home.jsp");
		dispatcher.forward(req, resp);
	}
}
