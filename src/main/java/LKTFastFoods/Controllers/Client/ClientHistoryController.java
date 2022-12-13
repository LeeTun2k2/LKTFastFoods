package LKTFastFoods.Controllers.Client;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(urlPatterns = {"/client/Order-History"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

public class ClientHistoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String username = "";

	private ClientService clientService = new ClientService();
	
	private Order_HistoryService order_HistoryService = new Order_HistoryService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Client client = clientService.GetOne(username);
		// Load History
		List<PersonalHistory> personalHistories = order_HistoryService .GetPersonalHistory(username);
		req.setAttribute("personalHistories", personalHistories);
		int total = 0;
		for (PersonalHistory personalHistory : personalHistories) {
			total += personalHistory.getAmount();
		}
		req.setAttribute("total", total);
		req.setAttribute("client", client);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		dateFormat.format(date);
		req.setAttribute("dateExport", date);
		
		// dispatcher
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/client/History.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
