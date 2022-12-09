<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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


	<div id="assessment" class="py-4">
		<div class="py-4 container form">
			<h2 class="text-center">ĐÁNH GIÁ</h2>
			<div class="py-4 content row">
				<div class="col-7 order-info">
					<table class="table table-striped">
						<thead>
							<tr>
								<th scope="col">STT</th>
								<th scope="col">Tên sản phẩm</th>
								<th scope="col">Số lượng</th>
								<th scope="col">Thành tiền</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${personalHistories}" var="personalHistory">
								<tr>
									<th scope="row">${personalHistory.id}</th>
									<td>${personalHistory.name}</td>
									<td>${personalHistory.quantity}</td>
									<td>${personalHistory.amount}đ</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col"></div>
				<form method="post" class="border rounded col-4 rating">
					<div class="py-2 row">
						<span class="col fw-bold">Mã khách hàng:</span> 
						<span class="col-3 text-right ClientID">${client.username}</span>
					</div>
					<div class="py-2 row">
						<span class="col fw-bold">Mã đơn hàng:</span> 
						<span class="col-3 text-right orderID"></span>
						<input name="orderID" value="" class="hide orderID">
					</div>
					<div class="stars py-2 row">
						<span class="col">Đánh giá:</span>
						<div id="${star}" class="col text-right inline-block star">
							<span class="fa fa-star checked" id="star-1"></span> 
							<span class="fa fa-star checked" id="star-2"></span> <span
								class="fa fa-star checked" id="star-3"></span> <span
								class="fa fa-star checked" id="star-4"></span> <span
								class="fa fa-star checked" id="star-5"></span>
						</div>
						<input name="star" value="5" class="hide starvalue">
					</div>
					<div class="py-2 row">
						<label class="col" for="comment">Góp ý</label> 
						<input class="mr-3 col-8 focus" name="comment">
					</div>
					<div class="my-4 text-center">
						<button id="assessment-submit" type="submit" class="button">Gửi đánh giá</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<%@ include file="/views/common/footer.jsp"%>
	<script src="${pageContext.request.contextPath}/views/assets/js/clientScript.js"></script>
	<script src="${pageContext.request.contextPath}/views/assets/js/clientAssessmentScript.js"></script>
</body>
</html>