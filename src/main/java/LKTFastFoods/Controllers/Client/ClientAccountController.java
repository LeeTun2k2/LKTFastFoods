package LKTFastFoods.Controllers.Client;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Models.*;
import LKTFastFoods.Services.*;

@WebServlet(urlPatterns = {"/client/Account"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

public class ClientAccountController extends HttpServlet {
	private static final long serialVersionUID = 1095436198751943020L;
	private String username = "client";
	ClientService clientService = new ClientService();
	Client client = clientService.GetOne(username);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("client", client);		
		
		// dispatcher
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/client/Account.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = client.getUsername();
		String name = req.getParameter("name");
	    Date birthDate = Date.valueOf(req.getParameter("birthDate"));
	    Boolean gender = req.getParameter("gender") == "Nữ";
	    String phoneNumber = req.getParameter("phoneNumber");
	    String address = req.getParameter("address");
	    String email = req.getParameter("email");
	    client = new Client(username, name, birthDate, gender, phoneNumber, email, address);
	    clientService.Update(client);
	    resp.sendRedirect("/LKTFastFoods/done");
	}
}
