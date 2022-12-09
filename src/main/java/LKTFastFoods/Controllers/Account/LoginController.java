package LKTFastFoods.Controllers.Account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import LKTFastFoods.Services.*;
import LKTFastFoods.Models.Account;
import LKTFastFoods.Util.Constant;


@WebServlet(urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountService accountService = new AccountService();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false );
<<<<<<< HEAD
		if(session != null && session.getAttribute("account")!=null) {
			resp.sendRedirect(req.getContextPath()+"/waiting");
			return;
		}
=======
//		if(session != null && session.getAttribute("account")!=null) {
//			resp.sendRedirect(req.getContextPath()+"/waitting");
//			return;
//		}
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		//check cookie 
		Cookie[] cookies = req.getCookies();
		if (cookies != null ) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("username")) {
					session=req.getSession(true);
					session.setAttribute("username",cookie.getValue());
					resp.sendRedirect(req.getContextPath()+"/waitting");
					return;
				}
			}
		}
		req.getRequestDispatcher("/views/account/login.jsp").forward(req,resp);
	}

	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
			
		String username =req.getParameter("username");
		String password= req.getParameter("password");
		boolean isRememberMe=false;
		String remember = req.getParameter("remember");
		if ("on".equals(remember)) {
			isRememberMe = true;
		}
		String alertMsg = "";
		if (username.isEmpty() || password.isEmpty()) {
			alertMsg = "Tài khoản hoặc mật khẩu không được để trống";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/views/account/login.jsp").forward(req, resp);
			return;
		}
		Account account = accountService.login(username.trim(), password.trim());

		if (account != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("account", account);
			if (isRememberMe) {
				saveRememberMe(resp, username);
			}
			resp.sendRedirect(req.getContextPath() + "/waitting");

		} else {
			alertMsg = "Tài khoản hoặc mật khẩu không đúng";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/views/account/login.jsp").forward(req, resp);
		}
	}
		 
		private void saveRememberMe(HttpServletResponse response, String username) {
			
			Cookie cookie= new Cookie(Constant.COOKIE_REMEMBER,username);
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
		}
		public static final String SESSION_USERNAME="username";
		public static final String COOKIE_REMEMBER="username";
	}


