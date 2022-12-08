package LKTFastFoods.Controllers.Account;

import java.awt.print.Printable;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.IDebugRequestor;

import LKTFastFoods.Models.Account;
import LKTFastFoods.Models.Client;
import LKTFastFoods.Services.AccountService;
import LKTFastFoods.Services.ClientService;
import LKTFastFoods.Services.iAccountService;
import LKTFastFoods.Services.iClientService;


@WebServlet(urlPatterns = {"/Register"})

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    iAccountService accoutService= new AccountService();
    iClientService clientService = new ClientService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("views/account/register.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String fullname = request.getParameter("hoten");
		String ngaysinh=request.getParameter("ngaysinh");
		boolean Gender= Boolean.parseBoolean(request.getParameter("Gender"));
		String username=request.getParameter("username");	
		String password=request.getParameter("password");
		String sdt=request.getParameter("sdt");
		String diachi=request.getParameter("address");
		String email=request.getParameter("email");
	
		Account account= new Account(username, password,false, true);
	    accoutService.Add(account);
	    Client client = new Client(username,fullname ,ngaysinh,Gender,sdt,email,diachi);
	    clientService.Add(client);
	    response.sendRedirect(request.getContextPath()+"/Login");
	    
	}

}
