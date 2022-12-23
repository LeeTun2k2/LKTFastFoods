package vn.LKTFastFoods.Controller.Customer.Cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.apache.catalina.ant.jmx.JMXAccessorQueryTask;
import org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess;

import vn.LKTFastFoods.Model.Cart;
import vn.LKTFastFoods.Model.CartItem;
import vn.LKTFastFoods.Model.User;
import vn.LKTFastFoods.Service.iCartItemService;
import vn.LKTFastFoods.Service.iCartService;
import vn.LKTFastFoods.Service.iStyleValueService;
import vn.LKTFastFoods.Service.Impl.CartItemServiceImpl;
import vn.LKTFastFoods.Service.Impl.CartServiceImpl;
import vn.LKTFastFoods.Service.Impl.StyleValueServiceImpl;
import vn.LKTFastFoods.Util.Constant;

@WebServlet(urlPatterns = { "/cart", "/cart/add-item", "/cart/update-items" })
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	iCartItemService cartItemService = new CartItemServiceImpl();
	iCartService cartService = new CartServiceImpl();
	iStyleValueService styleValueService = new StyleValueServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();

		HttpSession session = req.getSession();
		User account_cur = (User) session.getAttribute("account");
		if (url.endsWith("cart")) {
			LoadCartItems(req, resp);
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String url = req.getRequestURL().toString();
		if (url.endsWith("cart/add-item")) {
			AddCartItem(req, resp);
		} else if (url.endsWith("cart/update-items")) {
			UpdateCartItems(req, resp);
		}

	}

	private void LoadCartItems(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Cart cart_cur = (Cart) session.getAttribute("cart");
		if (cart_cur == null) {
			req.getRequestDispatcher("/views/customer/cart.jsp").forward(req, resp);
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
		payCost = totalCost - shipCost;
		req.setAttribute("cart_items_list", list);
		req.setAttribute("style_service", styleValueService);
		req.setAttribute("totalCost", totalCost);
		req.setAttribute("shipCost", shipCost);
		req.setAttribute("payCost", payCost);
		req.getRequestDispatcher("/views/customer/cart.jsp").forward(req, resp);
	}

	private void UpdateCartItems(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		Cart cart_cur = (Cart) session.getAttribute("cart");
		if (cart_cur == null) {
			Constant.setAlertSession(req, resp, "error", "Chưa có sản phẩm nào trong giỏ hàng!");
			resp.sendRedirect(req.getContextPath() + "/cart");
			return;
		}
		
		Integer totalDistinctItems = Integer.parseInt(req.getParameter("total_items"));
		List<CartItem> list = new ArrayList<CartItem>();
		for (int i = 0; i < totalDistinctItems; i++) {
			Integer itemId = Integer.parseInt(req.getParameter("item"+String.valueOf(i)));
			Integer countUpdated = Integer.parseInt(req.getParameter("count"+String.valueOf(i)));
			
			CartItem item = cartItemService.findOne(itemId);
			
			if(countUpdated==0) {
				cartItemService.delete(item.getId());
			} else {
				item.setCount(countUpdated);
				cartItemService.update(item);
			}
		}
		Constant.setAlertSession(req, resp, "success", "Cập nhật giỏ hàng thành công!");
		resp.sendRedirect(req.getContextPath() + "/cart");

	}

	private void AddCartItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User account_cur = (User) session.getAttribute("account");
		Cart cart_cur = (Cart) session.getAttribute("cart");
		if (account_cur == null) {
			resp.sendRedirect(req.getContextPath() + "/login");
			return;
		}
		if (cart_cur == null) {
			cart_cur = new Cart();
			cart_cur.setUserId(account_cur.getId());
			cart_cur.setStore(2);
			try {
				cartService.insert(cart_cur);
			} catch (Exception e) {
				Constant.setAlert(req, resp, "error", "Đã xảy ra lỗi, không thể thêm sản phẩm vào giỏ hàng!");
				req.getRequestDispatcher("/views/customer/cart.jsp").forward(req, resp);
				return;
			} finally {
				cart_cur = cartService.findLast();
				session.setAttribute("cart", cart_cur);
			}
		}

		Integer productId = Integer.parseInt(req.getParameter("product_id"));
		Integer quantity = Integer.parseInt(req.getParameter("quantity"));

		String styleValue1String = req.getParameter("style1");
		String styleValue2String = req.getParameter("style2");
		String styleValue3String = req.getParameter("style3");

		if (quantity == 0) {
			Constant.setAlertSession(req, resp, "error", "Chọn số lượng sản phẩm muốn thêm vào giỏ hàng!");
			resp.sendRedirect(req.getContextPath() + "/product/detail?product_id=" + productId);
			return;
		}

		Integer styleValue1 = styleValue1String != null ? Integer.parseInt(styleValue1String) : -1;
		Integer styleValue2 = styleValue2String != null ? Integer.parseInt(styleValue2String) : -1;
		Integer styleValue3 = styleValue3String != null ? Integer.parseInt(styleValue3String) : -1;

		List<Integer> styleValueList = new ArrayList<Integer>();
		if (styleValue1 != -1) {
			styleValueList.add(styleValue1);
		}
		if (styleValue2 != -1) {
			styleValueList.add(styleValue2);
		}
		if (styleValue3 != -1) {
			styleValueList.add(styleValue3);
		}

		CartItem cartItem = new CartItem();
		cartItem.setCartId(cart_cur.getId());
		cartItem.setCount(quantity);
		cartItem.setProductId(productId);
		cartItem.setStyleValueIds(styleValueList);
		try {
			cartItemService.insert(cartItem);
		} catch (Exception e) {
			Constant.setAlert(req, resp, "error", "Đã xảy ra lỗi, không thể thêm sản phẩm vào giỏ hàng!");
			resp.sendRedirect(req.getContextPath() + "/home");
			return;
		} finally {
			Constant.setAlertSession(req, resp, "success", "Thêm sản phẩm vào đơn hàng thành công!");
			resp.sendRedirect(req.getContextPath() + "/cart");
		}

	}

}
