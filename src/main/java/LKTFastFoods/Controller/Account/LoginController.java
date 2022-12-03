package LKTFastFoods.Controller.Account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import LKTFastFoods.DAO.LoginService;
import LKTFastFoods.DAO.iLoginService;
import LKTFastFoods.Models.Account;
import LKTFastFoods.Util.Constant;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/Login"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class LoginController extends HttpServlet {

	iLoginService service = new LoginService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false );
		if(session != null && session.getAttribute("account")!=null) {
			resp.sendRedirect(req.getContextPath()+"/waiting");
			return;
		}
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
	

	@SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
	Account account = service.login(username.trim(), password.trim());

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



