<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	   	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html lang="vi"><head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LKT Fast Food</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"/>
			<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&amp;display=swap" rel="stylesheet"/>
				<link rel="stylesheet" href="${pageContext.request.contextPath}/views/assets/css/adminStyle.css">
</head>
<!-- Header -->


<body>
<%@ include file="/views/common/adminHeader.jsp"%>
<div id="menu-action" class="my-4">
	<div class="container py-4">
		<h2 class="py-4 text-center">SẢN PHẨM</h2>
		<div class="my-4 row">
		
			<div class="my-2 row col">
				<label class="col text-right" for="value">Giá trị:</label> <input class="col phone text-center input" value="${voucherx.getDiscount() }" name="value" placeholder="Giá trị %">
			     <label class="col text-right" for="value">Mã giảm giá:</label> <input class="col phone text-center input" value="${voucherx.getId() }" name="id" placeholder="Mã giảm giá"> 
			</div>
			<div class="col-2"></div>
		</div>
		<div class="my-4 row">
			<div class="my-2 row col">	
				<label class="col text-right" for="start-date">Ngày bắt đầu:</label> <input value="${voucherx.getStartDate()}" class="col text-center input" type="date" name="start-date">
			</div>
			
			<div class="my-2 row col">
				<label class="col text-right" for="export">Ngày kết thúc:</label> <input value="${voucherx.getEndDate() }" class="col text-center input" type="date" name="end-date">
			</div>
			<div class="col-2"></div>
		</div>		
		<div class="py-4 d-flex justify-content-around">
			<button formaction="${pageContext.request.contextPath}/Update" id="payment-submit" class="mx-4 button">Lưu lại</button>
			<button formaction="${pageContext.request.contextPath}/admin/Trang-chu" id="payment-clear" class="mx-4 button">Hủy bỏ</button>
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
					<div class="img d-flex justify-content-center" onclick="location.href='${pageContext.request.contextPath}/views/admin/Trang-chu';">
						<img src="/LKTFastFood/views/assets/img/logo/lotteria_logo.svg" alt="LKTFastFood logo">
					</div>
					<div class="py-4 description">
						<h5>SUBSCRIBE FOR PROMOTIONAL UPDATES</h5>
					</div>
				</div>
			</div>
			
			<div class="col-3"></div>
			
			<div class="col info d-flex justify-content-center align-items-center">
				<div>
				<h3>DANH SÁCH THÀNH VIÊN</h3>
					<ul>
						<li>20110668 - Nguyễn Văn Lâm.</li>
						<li>20110746 - Lê Quang Tùng.</li>
						<li>20110280 - Lê Minh Tường.</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</footer>
<script src="/LKTFastFood/views/assets/js/adminScript.js"></script>

</body></html>