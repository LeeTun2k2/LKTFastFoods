package LKTFastFoods.Controllers.Client;

import java.io.IOException;
import java.util.Calendar;
import org.json.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Models.*;
import LKTFastFoods.Services.ClientService;
import LKTFastFoods.Services.OrderService;
import LKTFastFoods.Services.Order_InfoService;
import LKTFastFoods.Services.PaymentService;
import LKTFastFoods.Services.Payment_MethodService;

@WebServlet(urlPatterns = {"/client/Payment"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

public class ClientPaymentController extends HttpServlet {
	
	private static final long serialVersionUID = -7642087858748640098L;
	private String username = "client";
	ClientService clientService = new ClientService();
	Payment_MethodService payment_MethodService = new Payment_MethodService();
	PaymentService paymentService = new PaymentService();
	Client client = clientService.GetOne(username);
	Payment_Method paymentMethod = new Payment_Method(0, "", "", "");
	Payment payment = new Payment(0, 0, null, 0, "");
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/client/Payment.jsp");
		req.setAttribute("client", client);
		req.setAttribute("paymentMethod", paymentMethod);
		req.setAttribute("payment", payment);
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String description = req.getParameter("description");
			int amount = Integer.parseInt(req.getParameter("amount"));
			String bankName = req.getParameter("bankName");
			String accountNumber = req.getParameter("accountNumber");
			String accountName = req.getParameter("accountName");
			int methodId = payment_MethodService.GetMaxPaymentMethodID()+1;
			
			
			// create payment method
			Payment_Method method = new Payment_Method(methodId, accountNumber, accountName, bankName);
			payment_MethodService.Add(method);
			
			// create payment
			Payment p = new Payment(0, methodId, null, amount, description);
			p.setDateDone(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			paymentService.Add(p);
			resp.sendRedirect(req.getContextPath() + "/done");
			
			// create order
			int paymentID = paymentService.GetMaxPaymentID();			
			Order order = new Order(0, paymentID, amount, null);
			order.setDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			new OrderService().Add(order);
			
			// create order_info
//			int orderID = new OrderService().GetMaxOrderID();
//			Order_InfoService order_InfoService = new Order_InfoService();
//			
		}
		catch (Exception e) {
			System.out.print("Loi sql");
		}
	}
}
