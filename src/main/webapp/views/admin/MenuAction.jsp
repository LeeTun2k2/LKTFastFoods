 	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>

<html lang="vi">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LKT Fast Food</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"/>
<link
	href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&display=swap"
	rel="stylesheet"/>
<link rel="stylesheet" 	 href="/LKTFastFood/views/assets/css/adminStyle.css"/>
</head>
<!-- Header -->
<header id="header" class="py-4 border-bottom">
<!-- Header -->
<!-- <form method="post">
 -->	<div class="container header">
		<div class="row">
			<div class="inline-block col-5 logo" onclick="location.href='${pageContext.request.contextPath}/views/admin/Trang-chu';">
				<div class="row">
					<div>
						<img class="h-100" src="/LKTFastFood/views/assets/img/logo/lotteria_logo.svg" alt="LKTFastFood logo">
					</div>
					<div class="col brand ml-4">
						<h1 class="brand-name font-weight-bold">LKT FAST FOODS</h1>
						<h6 class="brand-slogan font-weight-light">Mang cả tâm tình trên từng sản phẩm</h6>
					</div>
				</div>
			</div>
			<div class="col inline-block d-flex justify-content-end align-items-center quick-access">
				<ul class="navbar">
					<a href='${pageContext.request.contextPath}/views/admin/Trang-chu''><li class="item"><h6>Tài khoản </h6></li></a>
					<a href='${pageContext.request.contextPath}/views/admin/Trang-chu''><li class="item"><h6>Đánh giá </h6></li></a>
					<a href='${pageContext.request.contextPath}/views/admin/Trang-chu''><li class="item"><h6>Menu </h6></li></a>
					<a href='${pageContext.request.contextPath}/views/admin/Trang-chu''><li class="item"><h6>Voucher</h6></li></a>
				</ul>
			</div>
		</div>
	</div>
</header>
<div id="menu-action" class="my-4">
	<div class="container py-4">
		<h2 class="py-4 text-center">SẢN PHẨM</h2>
		<form enctype="multipart/form-data" method="post">
		<div class="my-4 row">
			<div class="my-2 row col">
				<label class="col text-right" for="id">Mã sản phẩm: </label> 
				<input class="col name text-center input" name="id" placeholder="Mã sản phẩm">
			</div>
			<div class="my-2 row col">
				<label class="col text-right" for="name">Tên sản phẩm:</label> 
				<input class="col phone text-center input" name="name" placeholder="Tên sản phẩm">
			</div>
		</div>
		
			<div class="my-2 row col">
			
			<label class="col text-right" >Hình ảnh :</label> <input  type="file" name="image"
						onchange="document.querySelector('.profilepic').src = window.URL.createObjectURL(this.files[0]);"
						 accept="image/*" 
						style="cursor: pointer;" />										
					<img class="profilepic" width="150" height="150" alt="Ảnh sản phẩm"
						onerror="this.src='${pageContext.request.contextPath}/views/img/Default.jpg';this.onerror='';"
						style="align-items: center;" src="${pageContext.request.contextPath}/views/img/Default.jpg">
				</div>
			<hr>
			<!-- <div class="my-2 row col"> -->
		<div class="my-4 row">
			<div class="my-2 row col">
				<label class="col text-right" for="import">Giá nhập:</label> 
				<input class="col text-center input" name="import" placeholder="Giá nhập">
			</div>
			<div class="my-2 row col">
				<label class="col text-right" for="export">Giá bán:</label> 
				<input class="col text-center input" name="export" placeholder="Giá bán">
			</div>
			<div class="col-2"></div>
		</div>
		
		<div class="my-4 row">
			<div class="my-2 row col">
				<label class="col text-right" for="voucherID">Mã giảm giá:</label> 
				<input class="col text-center input" name="voucherID" placeholder="Mã giảm giá">
			</div>
			<div class="my-2 row col">
				<label class="col text-right" for="description">Mô tả:</label> 
				<input class="col text-center input" name="description" placeholder="Mô tả">
			</div>
			<div class="col-2"></div>
		</div>
		<div class="py-4 d-flex justify-content-around">
			<button formaction="${pageContext.request.contextPath}/MenuAdd" type = "submit" id="payment-submit" class="mx-4 button">Lưu lại</button>
			<button formaction="${pageContext.request.contextPath}/admin/Trang-chu" id="payment-clear" class="mx-4 button">Hủy bỏ</button>
		</div>
		</form>
	</div>

</div>



<!-- Footer -->
	<script src="${pageContext.request.contextPath}/views/assets/js/adminScript.js"></script>
<%@ include file="/views/common/footer.jsp"%>

</body>

</html>