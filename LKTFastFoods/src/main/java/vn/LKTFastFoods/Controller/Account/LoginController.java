package vn.LKTFastFoods.Controller.Account;

import java.io.IOException;

import javax.security.auth.login.AccountException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.LKTFastFoods.Model.Cart;
import vn.LKTFastFoods.Model.User;
import vn.LKTFastFoods.Service.iCartService;
import vn.LKTFastFoods.Service.iUserService;
import vn.LKTFastFoods.Service.Impl.CartServiceImpl;
import vn.LKTFastFoods.Service.Impl.UserServiceImpl;
import vn.LKTFastFoods.Util.Constant;

@WebServlet(urlPatterns = { "/login", "/login/submit", "/login/waiting" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	iUserService userService = new UserServiceImpl();
	iCartService cartService = new CartServiceImpl();


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();

		if (url.contains("login/waiting")) {
			loginWaiting(req, resp);
		} else if (url.contains("login/submit")) {
			loginSubmit(req, resp);
		}
		else if (url.endsWith("login")) {
			loginCheck(req, resp);
		}

	}

	protected void loginPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/web/account/login.jsp").forward(req, resp);
	}

	protected void loginCheck(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("account") != null) {
			resp.sendRedirect(req.getContextPath() + "/login/waiting");
			return;
		}
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("username") && cookie.getValue() != null
						&& !("").equals(cookie.getValue())) {
					String username = cookie.getValue();
					User users = userService.findByEmail(username);
					session = req.getSession(true);
					session.setAttribute("account", users);
					resp.sendRedirect(req.getContextPath() + "/login/waiting");
					return;
				}
			}
		}

		loginPage(req, resp);
	}

	private void loginWaiting(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("account") != null) {
			User u = (User) session.getAttribute("account");

			Constant.setAlert(req, resp, "success",
					"Đăng nhập thành công");

			if (("customer").equals(u.getRole())) {
				LoadCustomerData(req, resp);
				resp.sendRedirect(req.getContextPath() + "/home");
			}
			if (("vendor").equals(u.getRole())) {
				resp.sendRedirect(req.getContextPath() + "/vendor/home");
			}
			if (("admin").equals(u.getRole())) {
				resp.sendRedirect(req.getContextPath() + "/admin/home");
			}

		}

	}

	private void LoadCustomerData(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		HttpSession session = req.getSession();
		User u = (User) session.getAttribute("account");

		Cart cart = cartService.findLastByUserId(u.getId());
		
		if(cart != null) {
			session.setAttribute("cart", cart);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		boolean isRememberMe = false;
		String remember = req.getParameter("remember");

		if ("on".equals(remember)) {
			isRememberMe = true;
		}

		String alertMsg = "";

		if (username.isEmpty() || password.isEmpty()) {
			Constant.setAlert(req, resp, "error", "Không được để trống email hoặc password!");
			req.getRequestDispatcher("/views/web/account/login.jsp").forward(req, resp);
			return;
		}
		User account = userService.login(username, password);

		if (account != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("account", account);
			if (isRememberMe) {
				saveRememberMe(resp, username);
			}
			resp.sendRedirect(req.getContextPath() + "/login/waiting");
		} else {
			Constant.setAlert(req, resp, "error", "Email hoặc mật khẩu không đúng!");
			req.getRequestDispatcher("/views/web/account/login.jsp").forward(req, resp);
		}
	}

	private void loginSubmit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	private void saveRememberMe(HttpServletResponse resp, String username) throws ServletException, IOException {
		Cookie cookie = new Cookie(Constant.COOKIE_REMEMBER, username);
		cookie.setMaxAge(5 * 24 * 60 * 60);
		resp.addCookie(cookie);
	}

}
