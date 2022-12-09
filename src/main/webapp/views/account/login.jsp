<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
    <html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng nhập tài khoản </title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/account/login.css">
   	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
    <section>
        <!--ảnh background-->
        <div class="img-bg">
            <img src="${pageContext.request.contextPath}/views/img/login.jpg" alt="Hình Ảnh Minh Họa">
        </div>

        <div class="noi-dung">
            <div class="form">
                <h2>Trang Đăng Nhập</h2>
               
                <form action="Login" method="post">
                 <c:if test="${alert!=null}">
                <h6  class ="alert alert-danger">${alert}</h6>
                </c:if>
                    <div class="input-form">
                        <span>Tên Người Dùng</span>
                        <input type="text" placeholder="Nhập tên đăng nhập vào đây" name="username">
                    </div>
                    <div class="input-form">
                        <span>Mật Khẩu</span>
                        <input type="password" placeholder="Nhập mật khẩu vào đây" name="password">
                    </div>
                    <div class="nho-dang-nhap">
                        <label><input type="checkbox" name="remember"> Nhớ Đăng Nhập</label>
                    </div>
                    <div class="input-form">
                        <input type="submit"  value="Đăng Nhập">
                    </div>
                    <div class="input-form">
                        <p>Bạn Chưa Có Tài Khoản? <a href="${pageContext.request.contextPath}/views/account/register.jsp">Đăng Ký</a></p>
                    </div>
                    <div class="input-form">
                        <p>Quên mật khẩu <a href="${pageContext.request.contextPath}/views/account/forgot.jsp">Lấy lại mật khẩu</a></p>
                    </div>
                </form>
            </div>
        </div>
    </section>
</body>

</html>