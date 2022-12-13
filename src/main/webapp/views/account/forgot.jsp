<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quên mật khẩu</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/account/forgot.css">
</head>

<body>
    <div class="d-flex align-items-center justify-content-center vh-100">
        <form method="post" class="py-5 container bg-light">
            <h2 class="py-4 text-center">QUÊN MẬT KHẨU</h2>
            <div class="content">
	            <div class="p-4 wrapper row mx-4">
		            <label for="username" class="col">Nhập tên tài khoản</label>
		            <input type="text" name="username" class="col-8">
		       	</div>
	            <div class="p-4 wrapper row mx-4">
		            <label for="phoneNumber" class="col">Nhập số điện thoại</label>
		            <input type="text" name="phoneNumber" class="col-8">
	            </div>
	            <div class="p-4 wraper row mx-4">
		            <label for="password" class="col">Nhập mật khẩu mới</label>
		            <input type="text" name="password" class="col-8">	            
	            </div>
	            <div class="p-4 wrapper row mx-4">
		            <label for="repassword" class="col">Nhập lại mật khẩu mới</label>
		            <input type="text" name="repassword" class="col-8">
	            </div>
            </div>
            <div class="p-4 row justify-content-center">            
            	<button type="submit">ĐỔI MẬT KHẨU</button>
            </div>
        </form>
    </div>
</body>
</html>