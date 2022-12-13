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
	<div id="menu" class="py-5">
		<div class="py-4 container">
			<div class="row justify-content-center text-center">
				<div class="col-md-8 col-lg-6">
					<div class="header pb-5">
						<h2 class="pb-4">THỰC ĐƠN</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<!-- Single Product -->
				<c:forEach items="${products}" var="product">
					<div class="my-5 col-md-6 col-lg-4 col-xl-3">
						<div id="product-${product.id}" class="single-product">
							<div class="part-1">
								<img class="w-100" src="${product.image}" alt="${product.name}" />
								<span class="discount">${product.discount}%</span>
								<ul>
									<li id="${product.id}"><i class="fas fa-plus"></i></li>
								</ul>
							</div>
							<div class="part-2">
								<h3 class="product-title">${product.name}</h3>
								<p class="text-justify product-description">${product.description}</p>
								<div class="d-flex justify-content-between align-items-center">
									<h4 class="product-old-price">${product.exportPrice}đ</h4>
									<div>
										<h4 class="product-price mr-4">${product.amount}đ</h4>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	<!-- Footer -->
	<%@ include file="/views/common/footer.jsp"%>
	<script src="${pageContext.request.contextPath}/views/assets/js/clientScript.js"></script>
	<script src="${pageContext.request.contextPath}/views/assets/js/clientMenuScript.js"></script>
</body>
</html>