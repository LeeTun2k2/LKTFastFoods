package vn.LKTFastFoods.Controller.Customer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.mysql.cj.protocol.PacketReceivedTimeHolder;

import vn.LKTFastFoods.Model.User;
import vn.LKTFastFoods.Service.iUserService;
import vn.LKTFastFoods.Service.Impl.UserServiceImpl;
import vn.LKTFastFoods.Util.Constant;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 5, 
maxFileSize = 1024 * 1024 * 10, 
maxRequestSize = 1024 * 1024 * 50) 
@WebServlet(urlPatterns = { "/customer/account/profile", "/customer/account/password" })
public class UpdateInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	iUserService userService = new UserServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();

		if (url.contains("/customer/account/profile")) {
			req.getRequestDispatcher("/views/customer/account/edit-profile.jsp").forward(req, resp);
		}
		else if (url.contains("/customer/account/password")) {
			req.getRequestDispatcher("/views/customer/account/edit-password.jsp").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();
		if (url.contains("/customer/account/profile")) {
			EditProfile(req, resp);
		}
		else if (url.contains("/customer/account/password")) {
			EditPassword(req, resp);
		}
	}

	private void EditProfile(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession(false);
		User user = (User) session.getAttribute("account");

		String lastName = req.getParameter("lastname");
		String firstName = req.getParameter("firstname");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		String idCard = req.getParameter("id_card");

		String imgDir = "avatar";

		try {
			Part part = req.getPart("avatar");
			System.out.println(part.getSubmittedFileName());
			if (part.getSubmittedFileName() != "") {
				String realPath = Constant.DIR + "/" + imgDir;

				if (!Files.exists(Paths.get(realPath))) {
					Files.createDirectory(Paths.get(realPath));
				}

				String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
				part.write(realPath + "/" + filename);

				user.setAvatar(imgDir + "/" + filename);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			user.setFirstname(firstName);
			user.setLastname(lastName);
			user.setAddress(address);
			user.setEmail(email);
			user.setPhone(phone);
			user.setId_card(idCard);
			
			userService.editCustomer(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Constant.setAlert(req, resp, "success", "Cập nhật thông tin thành công!");
			req.getRequestDispatcher("/views/customer/account/edit-profile.jsp").forward(req, resp);
		}
	}

	private void EditPassword(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession(false);
		User user = (User) session.getAttribute("account");

		String oldPass = req.getParameter("current_password");
		String newPass = req.getParameter("new_password");
		String confirmPass = req.getParameter("confirm_password");
		
		if(!oldPass.equals(user.getPassword())) {
			Constant.setAlert(req, resp, "error", "Mật khẩu hiện tại không đúng!");
			req.getRequestDispatcher("/views/customer/account/edit-password.jsp").forward(req, resp);
			return;
		}
		if(!newPass.equals(confirmPass)) {
			Constant.setAlert(req, resp, "error", "Mật khẩu mới và mật khẩu xác nhận không khớp!");
			req.getRequestDispatcher("/views/customer/account/edit-password.jsp").forward(req, resp);
			return;
		}
		
		if(newPass.equals(oldPass)) {
			Constant.setAlert(req, resp, "error", "Mật khẩu mới và mật khẩu cũ giống nhau!");
			req.getRequestDispatcher("/views/customer/account/edit-password.jsp").forward(req, resp);
			return;
		}
		
		if(!newPass.matches(".*\\d.*")) {
			Constant.setAlert(req, resp, "error", "Mật khẩu mới không đủ bảo mật!");
			req.getRequestDispatcher("/views/customer/account/edit-password.jsp").forward(req, resp);
			return;
		}
		
		try {
			user.setPassword(newPass);
			userService.editCustomer(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Constant.setAlert(req, resp, "success", "Cập nhật mật khẩu thành công!");
			req.getRequestDispatcher("/views/customer/account/edit-password.jsp").forward(req, resp);
		}
	}

}
