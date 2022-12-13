<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	<form method="POST" id="payment" class="py-4">
		<div class="container py-4">
			<h2 class="text-center">THANH TOÁN</h2>

			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Họ và tên:</label> 
					<input value="${client.name}" name="name" class="col text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Số điện thoại:</label> 
					<input value="${client.phoneNumber }" name="phoneNumber" class="col text-center">
				</div>
				<div class="col-2"></div>
			</div>
			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Địa chỉ:</label> 
					<input value="${client.address }" name="address" class="col text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Nội dung: </label> 
					<input value="${payment.description}" name="description" class="col text-center">
				</div>
				<div class="col-2"></div>
			</div>

			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Thành tiền:</label> 
					<input value="${payment.amount}đ" name="amount" class="col amount text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Ngân hàng:</label> <input
						value="${paymentMethod.bankName }" name="bankName" class="col text-center">
				</div>
				<div class="col-2"></div>
			</div>
			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Số tài khoản:</label> <input
						value="${paymentMethod.accountNumber}" name="accountNumber" class="col text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Chủ tài khoản:</label> <input
						value="${paymentMethod.accountName}" name="accountName" class="col text-center">
				</div>
				<div class="col-2"></div>
			</div>
			<table class="my-4 table table-striped">
				<thead>
					<tr>
						<th scope="col" class="text-center">STT</th>
						<th scope="col" >Tên sản phẩm</th>
						<th scope="col" class="text-center">Số lượng</th>
						<th scope="col" class="text-center">Đơn giá</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row" class="text-center">2</th>
						<td>Pepsi</td>
						<td class="text-center">2</td>
						<td class="text-center">24.000đ</td>
					</tr>
				</tbody>
			</table>
			<input name="data" value="" class="hide"> 
			<div class="my-4 d-flex justify-content-center">
				<button id="payment-submit" class="button">Thanh toán</button>
			</div>
		</div>
	</form>

	<!-- Footer -->
	<%@ include file="/views/common/footer.jsp"%>

	<script src="${pageContext.request.contextPath}/views/assets/js/clientScript.js"></script>
	<script src="${pageContext.request.contextPath}/views/assets/js/clientPaymentScript.js"></script>
</body>
</html>