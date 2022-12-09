package LKTFastFoods.Controllers.Manager.Account;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LKTFastFoods.Models.Client;
import LKTFastFoods.Services.ClientService;

/**
 * Servlet implementation class AccountUnLockController
 */
@WebServlet(urlPatterns = {"/AccountUnLock"})
public class AccountUnLockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 ClientService clientService= new ClientService();
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//Lấy danh sách khách hàng
	     List<Client> list = clientService.GetAll();
			
			//Duyệt qua danh sách khách hàng kiểm tra radio button được chọn
			String username = null;
			String rb;
			
			try {
				
				for (Client client : list) {
					rb = request.getParameter("selected"+client.getUsername());
					username = (rb != null && rb!="0") ? client.getUsername() : username; 
					clientService.unLockAccount(username);
				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			 
			 response.sendRedirect(request.getContextPath()+"/admin/Trang-chu");
		}

	}
