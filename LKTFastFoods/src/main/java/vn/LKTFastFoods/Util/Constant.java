package vn.LKTFastFoods.Util;

import java.nio.file.Paths;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Constant {
	static String dir = Paths.get("").toAbsolutePath().toString();
	
	public static final String SESSION_USERNAME = "username";
	public static final String COOKIE_REMEMBER = "username";
	
	public static final String DIR = "D:\\upload\\img\\LKTFastFoods";

	
	public static final String[] topicType_name = {"Tiểu luận chuyên ngành","Đề tài tốt nghiệp","Tiểu luận chuyên ngành","Đề tài tốt nghiệp"};
	public static final Integer[] topicType_year = {2018, 2018, 2019, 2019};

	public static void setAlert(HttpServletRequest req, HttpServletResponse resp, String alertType, String cmt) {
		if (alertType == "success") {
			req.setAttribute("alertType", 2);
			req.setAttribute("alert", cmt);
			req.setAttribute("alertIcon", "ti-check");
		} else if (alertType == "warning") {
			req.setAttribute("alertType", 3);
			req.setAttribute("alert", cmt);
			req.setAttribute("alertIcon", "ti-na");
		} else if (alertType == "error") {
			req.setAttribute("alertType", 4);
			req.setAttribute("alert", cmt);
			req.setAttribute("alertIcon", "ti-close");
		} else {
			req.setAttribute("alertType", 5);
			req.setAttribute("alert", cmt);
			req.setAttribute("alertIcon", "ti-info");
		}
	}
	
	public static void setAlertSession(HttpServletRequest req, HttpServletResponse resp, String alertType, String cmt) {
		HttpSession session = req.getSession();
		
		if (alertType == "success") {
			session.setAttribute("alertType", 2);
			session.setAttribute("alert", cmt);
			session.setAttribute("alertIcon", "ti-check");
		} else if (alertType == "warning") {
			session.setAttribute("alertType", 3);
			session.setAttribute("alert", cmt);
			session.setAttribute("alertIcon", "ti-na");
		} else if (alertType == "error") {
			session.setAttribute("alertType", 4);
			session.setAttribute("alert", cmt);
			session.setAttribute("alertIcon", "ti-close");
		} else {
			session.setAttribute("alertType", 5);
			session.setAttribute("alert", cmt);
			session.setAttribute("alertIcon", "ti-info");
		}
	}
	
}

