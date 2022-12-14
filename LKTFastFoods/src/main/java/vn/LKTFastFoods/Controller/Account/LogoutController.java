package vn.LKTFastFoods.Controller.Account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		session.removeAttribute("account");
		Cookie[] theCookie = req.getCookies();
		for (Cookie cookie : theCookie) {
			if(cookie.getName().equals("username")) {
				cookie.setValue("");
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
			}
		}
		resp.sendRedirect(req.getContextPath() + "/home");
	}

}
