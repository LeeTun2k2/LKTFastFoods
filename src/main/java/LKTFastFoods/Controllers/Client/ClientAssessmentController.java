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

@WebServlet(urlPatterns = {"/client/Assessment"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

public class ClientAssessmentController extends HttpServlet {
	private static final long serialVersionUID = 8235769549986217427L;
	private ClientService clientService = new ClientService();
	private String username = "client";
	private Client client = clientService.GetOne(username);
	int orderId;
	int star = 5;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		Order_HistoryService order_HistoryService = new Order_HistoryService();
		List<PersonalHistory> personalHistories = order_HistoryService.GetPersonalHistory(username);
		req.setAttribute("personalHistories", personalHistories);
		orderId = personalHistories.get(0).getId();
		req.setAttribute("orderId", orderId);
		int total = 0;
		for (PersonalHistory personalHistory : personalHistories) {
			total += personalHistory.getAmount();
		}
		req.setAttribute("star", star);
		req.setAttribute("total", total);
		req.setAttribute("client", client);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		dateFormat.format(date);
		req.setAttribute("dateExport", date);
		
		// dispatcher
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/client/Assessment.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int orderId = Integer.parseInt(req.getParameter("orderID"));  
			int star = Integer.parseInt(req.getParameter("star"));
			String comment = req.getParameter("comment");
			Assessment assessment = new Assessment(0, orderId, star, comment);
			new AssessmentService().Add(assessment);
			resp.sendRedirect(req.getContextPath() + "/done");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}	
}
