<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng nhập tài khoản </title>
    <link rel="stylesheet" href="login.css">


</head>

<body>
    <section>
        <!--ảnh background-->
        <div class="img-bg">
            <img src="../img/login.jpg" alt="Hình Ảnh Minh Họa">
        </div>
        <!--tạo form đăng nhập-->
        <div class="noi-dung">
            <div class="form">
                <h2>Trang Đăng Nhập</h2>
                <form action="">
                    <div class="input-form">
                        <span>Tên Người Dùng</span>
                        <input type="text" placeholder="Nhập tên đăng nhập vào đây" name="">
                    </div>
                    <div class="input-form">
                        <span>Mật Khẩu</span>
                        <input type="password" placeholder="Nhập mật khẩu vào đây" name="">
                    </div>
                    <div class="nho-dang-nhap">
                        <label><input type="checkbox" name=""> Nhớ Đăng Nhập</label>
                    </div>
                    <div class="input-form">
                        <input type="submit" value="Đăng Nhập">
                    </div>
                    <div class="input-form">
                        <p>Bạn Chưa Có Tài Khoản? <a href="./register.jsp">Đăng Ký</a></p>
                    </div>
                    <div class="input-form">
                        <p>Quên mật khẩu <a href="./forgot.jsp">Lấy lại mật khẩu</a></p>
                    </div>
                </form>
            </div>
        </div>
    </section>
</body>

</html>