<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LKT Fast Food</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css">
<script
	src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
<link
	href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/b029030af9.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/assets/css/clientStyle.css" />
</head>
<body>
	<!--  Header -->
	<%@ include file="/views/common/header.jsp"%>


	<div id="account" class="py-4">
		<form role="form" method="post" class="py-4 container">
			<h2 class="text-center">THÔNG TIN KHÁCH HÀNG</h2>
			<div class="py-4 content">
				<div class="my-2 row">
					<div class="my-2 row col">
						<label class="col text-right">Họ và tên:</label> <input name="name"
							class="col text-center" value="${client.name}">
					</div>
					<div class="my-2 row col">
						<label class="col text-right">Ngày sinh:</label> <input name="birthDate"
							class="col birth-date text-center" value="${client.birthDate}">
					</div>
					<div class="col-2"></div>
				</div>
				<div class="my-2 row">
					<div class="my-2 row col">
						<label class="col text-right">Giới tính:</label>

						<c:choose>
							<c:when test="${client.gender}">
								<input class="col gender text-center" value="Nữ" name="gender">
							</c:when>
							<c:otherwise>
								<input class="col gender text-center" value="Nam" name="gender">
							</c:otherwise>
						</c:choose>

					</div>
					<div class="my-2 row col">
						<label class="col text-right">Số điện thoại:</label> <input name="phoneNumber"
							class="col phone text-center" value="${client.phoneNumber}">
					</div>
					<div class="col-2"></div>
				</div>
				<div class="my-2 row">
					<div class="my-2 row col">
						<label class="col text-right">Địa chỉ:</label> <input name="address"
							class="col address text-center" value="${client.address}">
					</div>
					<div class="my-2 row col">
						<label class="col text-right">Email:</label> <input name="email"
							class="col email text-center" value="${client.email}">
					</div>
					<div class="col-2"></div>
				</div>

			</div>
			<div class="my-4 d-flex justify-content-around">
				<button id="account-submit" class="button">Cập nhật</button>
			</div>
		</form>
	</div>

	<!-- Footer -->
	<%@ include file="/views/common/footer.jsp"%>

	<script
		src="${pageContext.request.contextPath}/views/assets/js/clientScript.js"></script>
</body>
</html>
=======
<div id="account" class="py-4 hide">
	<div class="py-4 container">
		<h2 class="text-center">THÔNG TIN KHÁCH HÀNG</h2>
		<div class="py-4 content">
			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Họ và tên:</label> 
					<input class="col name text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Ngày sinh:</label> 
					<input class="col birth-date text-center">
				</div>
				<div class="col-2"></div>
			</div>
			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Giới tính:</label> 
					<input class="col gender text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Số điện thoại:</label> 
					<input class="col phone text-center">
				</div>
				<div class="col-2"></div>
			</div>
			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Địa chỉ:</label> 
					<input class="col address text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Email:</label> 
					<input class="col email text-center">
				</div>
				<div class="col-2"></div>
			</div>
			
		</div>
		<div class="my-4 d-flex justify-content-around">
			<button id="account-rollback" class="button">Huỷ bỏ</button>
			<button id="account-submit" class="button">Cập nhật</button>
		</div>
		
	</div>
</div>
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
