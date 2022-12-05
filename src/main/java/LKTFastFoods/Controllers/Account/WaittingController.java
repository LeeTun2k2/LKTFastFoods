package LKTFastFoods.Controllers.Account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import LKTFastFoods.Models.Account;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/waitting")
public class WaittingController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession();
		if (session!= null && session.getAttribute("account")!=null) {
			Account a = (Account) session.getAttribute("account");
			req.setAttribute("username",a.getUsername() );
			if (a.isRole()) {
				resp.sendRedirect(req.getContextPath()+"/admin/Trang-chu");
				
			}
			else {
				resp.sendRedirect(req.getContextPath()+ "/client/Trang-chu");
			}
			
		}
		else {
			resp.sendRedirect(req.getContextPath()+"/Login");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	

}