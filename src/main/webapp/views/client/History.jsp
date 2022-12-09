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

	<div id="history" class="my-4">
		<div class="container py-4">
			<div class="py-4 container header">
				<h2 class="mb-4 text-center">LỊCH SỬ MUA HÀNG</h2>
				<div>
					<span class="fw-bold">Họ và tên:</span> <span class="name">${client.name}</span>
				</div>
				<div>
					<span class="fw-bold">Địa chỉ:</span> <span class="address">${client.address}</span>
				</div>
				<div>
					<span class="fw-bold">Số điện thoại:</span> <span class="phone">${client.phoneNumber}</span>
				</div>
			</div>
			<table class="table table-striped">
				<thead class="border">
					<tr>
						<th scope="col" class="text-center">STT</th>
						<th scope="col">Tên sản phẩm</th>
						<th scope="col" class="text-center">Số lượng</th>
						<th scope="col" class="text-center">Đơn giá</th>
						<th scope="col" class="text-center">Thành tiền</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${personalHistories}" var="personalHistory">
						<tr>
							<th scope="row" class="text-center">${personalHistory.id}</th>
							<td>${personalHistory.name}</td>
							<td class="text-center">${personalHistory.quantity}</td>
							<td class="text-center">${personalHistory.amount}đ</td>
							<td class="text-center">${personalHistory.amount*personalHistory.quantity}đ</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="py-4 container footer">
				<div>
					<span class="fw-bold">Tổng số tiền đơn hàng:</span> <span
						class="amount">${total}đ</span>
				</div>
				<div>
					<span class="fw-bold">Ngày xuất hóa đơn:</span> <span class="date">${dateExport}</span>
				</div>
			</div>
		</div>
	</div>


	<!-- Footer -->
	<%@ include file="/views/common/footer.jsp"%>
	<script
		src="${pageContext.request.contextPath}/views/assets/js/clientScript.js"></script>
</body>
</html>