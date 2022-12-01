package LKTFastFoods.Controllers.Client;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.FileUploadException;

import LKTFastFoods.Models.*;
import LKTFastFoods.Services.*;
import LKTFastFoods.Util.*;

@WebServlet(urlPatterns = {"/client/Trang-chu"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

public class ClientHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountService accountService = new AccountService();
	AssessmentService assessmentService = new AssessmentService();
	ClientService clientService = new ClientService();
	Order_HistoryService order_HistoryService = new Order_HistoryService();
	Order_InfoService order_InfoService = new Order_InfoService();
	OrderService orderService = new OrderService();
	Payment_MethodService payment_MethodService = new Payment_MethodService();
	PaymentService paymentService = new PaymentService();
	ProductService productService = new ProductService();
	VoucherService voucherService = new VoucherService();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/client/Home.jsp");
		dispatcher.forward(req, resp);
		System.out.print("11111111111111111111111111111");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.print("11111111111111111111111111111");
	}
}