package LKTFastFoods.Controllers.Account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

<<<<<<< HEAD
=======
import org.eclipse.jdt.internal.compiler.IDebugRequestor;

>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
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
<<<<<<< HEAD
			if (a.isRole()) {
				resp.sendRedirect(req.getContextPath()+"/admin/Trang-chu");
				
			}
			else {
				resp.sendRedirect(req.getContextPath()+ "/client/Trang-chu");
			}
			
		}
		else {
=======
			if (a.isRole() &&a.isActive()==true) {
				resp.sendRedirect(req.getContextPath()+"/admin/Trang-chu");
				
			}
			else if(a.isRole()==false&&a.isActive()==true) {
				resp.sendRedirect(req.getContextPath()+ "/client/Trang-chu");
			}
			else {
				String alt="Tài khoản đang bị khóa ";
				req.setAttribute("alert", alt);
				req.getRequestDispatcher("/views/account/login.jsp").forward(req, resp);
			}
		}
		else {
			
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
			resp.sendRedirect(req.getContextPath()+"/Login");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	

}
