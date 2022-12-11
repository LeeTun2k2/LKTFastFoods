package LKTFastFoods.Controllers.Account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Services.*;
import LKTFastFoods.Models.*;


@WebServlet(urlPatterns = {"/Forgot-Password"})
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountService accountService = new AccountService();
	ClientService clientService = new ClientService();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/account/forgot.jsp").forward(req,resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
			
		String username = req.getParameter("username");
		String phoneNumber = req.getParameter("phoneNumber");
		String password = req.getParameter("password");
		String repassword = req.getParameter("repassword");
		
		Client client = clientService.GetOne(username);
		
		if (client != null && phoneNumber == client.getPhoneNumber() && password == repassword)
		{
			Account account = accountService.GetOne(username);
			account.setPassword(password);
			accountService.Update(account);
		}
		else
		{
			req.getRequestDispatcher("/Forgot-Password").forward(req,resp);
		}
	}
}
