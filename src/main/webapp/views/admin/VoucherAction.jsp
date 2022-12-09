<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LKT Fast Food</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&amp;display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/assets/css/adminStyle.css">
</head>
<!-- Header -->


<body>
	<header id="header" class="py-4 border-bottom">
		<!-- Header -->
		<div class="container header">
			<div class="row">
				<div class="inline-block col-5 logo"
					onclick="location.href='${pageContext.request.contextPath}/views/admin/Trang-chu'">
					<div class="row">
						<div>
							<img class="h-100"
								src="${pageContext.request.contextPath}/views/assets/img/logo/lotteria_logo.svg"
								alt="LKTFastFood logo">
						</div>
						<div class="col brand ml-4">
							<h1 class="brand-name font-weight-bold">LKT FAST FOODS</h1>
							<h6 class="brand-slogan font-weight-light">Mang cả tâm tình
								trên từng sản phẩm</h6>
						</div>
					</div>
				</div>	
			</div>
		</div>

	</header>
	<form method="post">
		<div id="menu-action" class="my-4">
			<div class="container py-4">
				<h2 class="py-4 text-center">SẢN PHẨM</h2>
				<div class="my-4 row">
					<div class="my-2 row col">
						<label class="col text-right" for="value">Giá trị:</label> <input
							class="col phone text-center input" name="value"
							placeholder="Giá trị %">
					</div>
					<div class="col-2"></div>
				</div>
				<div class="my-4 row">
					<div class="my-2 row col">
						<label class="col text-right" for="start-date">Ngày bắt
							đầu:</label> <input class="col text-center input" type="date"
							name="start-date">
					</div>

					<div class="my-2 row col">
						<label class="col text-right" for="export">Ngày kết thúc:</label>
						<input class="col text-center input" type="date" name="end-date">
					</div>
					<div class="col-2"></div>
				</div>
				<div class="py-4 d-flex justify-content-around">
					<button formaction="${pageContext.request.contextPath}/add"
						id="payment-submit" class="mx-4 button">Lưu lại</button>
					<button
						formaction="${pageContext.request.contextPath}/admin/Trang-chu"
						class="mx-4 button">Hủy bỏ</button>
				</div>
			</div>

		</div>
	</form>
	<!-- Footer -->

	<footer id="footer" class="py-4 border-top">
		<div class="container mt-4">
			<div class="row">
				<div class="d-flex justify-content-center col logo">
					<div>
						<div class="img d-flex justify-content-center"
							onclick="location.href='${pageContext.request.contextPath}/views/admin/Trang-chu';">
							<img src="${pageContext.request.contextPath}/views/assets/img/logo/lotteria_logo.svg"
								alt="LKTFastFood logo">
						</div>
						<div class="py-4 description">
							<h5>SUBSCRIBE FOR PROMOTIONAL UPDATES</h5>
						</div>
					</div>
				</div>

				<div class="col-3"></div>

				<div
					class="col info d-flex justify-content-center align-items-center">
					<div>
						<h3>DANH SÁCH THÀNH VIÊN</h3>
						<ul>
							<li>20110660 - Trần Quang Khánh</li>
						<li>20110668 - Nguyễn Văn Lâm</li>
						<li>20110746 - Lê Quang Tùng</li>
						<li>20110280 - Lê Minh Tường</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<script
		src="${pageContext.request.contextPath}/views/assets/js/adminScript.js"></script>
</body>
</html>