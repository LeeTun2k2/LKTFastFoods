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

	<div id="cart" class="py-4">
		<div class="container py-4">
			<h2 class="text-center">GIỎ HÀNG</h2>
			<table class="my-4 table table-striped">
				<thead>
					<tr>
						<th scope="col" class="text-center">STT</th>
						<th scope="col">Tên sản phẩm</th>
						<th scope="col">Số lượng</th>
						<th scope="col" class="text-center">Đơn giá</th>
					</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>

			<div class="my-2 row">
				<div class="my-2 row col">
					<span class="col text-right">Tổng cộng:</span> <span
						class="amount col"> </span>
				</div>
				<div class="col"></div>
			</div>
			<div class="my-4 d-flex justify-content-around">
				<button id="payment-cancel" class="button">Quay lại</button>
				<button id="payment-submit" class="button">Thanh toán</button>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<%@ include file="/views/common/footer.jsp"%>

	<script src="${pageContext.request.contextPath}/views/assets/js/clientScript.js"></script>
	<script src="${pageContext.request.contextPath}/views/assets/js/clientCartScript.js"></script>
</body>
</html>