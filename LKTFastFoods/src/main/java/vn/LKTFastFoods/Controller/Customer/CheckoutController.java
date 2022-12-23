package vn.LKTFastFoods.Controller.Customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.LKTFastFoods.Model.Cart;
import vn.LKTFastFoods.Model.CartItem;
import vn.LKTFastFoods.Service.iCartItemService;
import vn.LKTFastFoods.Service.iCartService;
import vn.LKTFastFoods.Service.iStyleValueService;
import vn.LKTFastFoods.Service.Impl.CartItemServiceImpl;
import vn.LKTFastFoods.Service.Impl.CartServiceImpl;
import vn.LKTFastFoods.Service.Impl.StyleValueServiceImpl;
import vn.LKTFastFoods.Util.Constant;

@WebServlet("/checkout")
public class CheckoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	iCartItemService cartItemService = new CartItemServiceImpl();
	iCartService cartService = new CartServiceImpl();
	iStyleValueService styleValueService = new StyleValueServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/views/customer/checkout.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();

		if (url.endsWith("checkout")) {
			Checkout(req, resp);
		}
	}

	private void Checkout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Cart cart_cur = (Cart) session.getAttribute("cart");

		if (cart_cur == null) {
			Constant.setAlertSession(req, resp, "error", "Giỏ hàng rỗng!");
			resp.sendRedirect(req.getContextPath() + "/cart");
			return;
		}

		List<CartItem> list = cartItemService.findByCartId(cart_cur.getId());

		double totalCost = 0;
		double shipCost = 0;
		double payCost = 0;
		for (CartItem cartItem : list) {
			shipCost += 10000;
			totalCost += cartItem.getCount() * cartItem.getProduct().getPromotionalPrice();
		}
		payCost = totalCost - payCost;

		req.setAttribute("cart_items_list", list);
		req.setAttribute("style_service", styleValueService);
		req.setAttribute("totalCost", totalCost);
		req.setAttribute("shipCost", shipCost);
		req.setAttribute("payCost", payCost);

		req.getRequestDispatcher("/views/customer/checkout.jsp").forward(req, resp);
	}

}
