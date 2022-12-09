<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
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
=======
    pageEncoding="UTF-8"%>
<div id="history" class="hide">
    <div class="container py-4">
    	<div class="py-4 container header">
    		<h2 class="mb-4 text-center">LỊCH SỬ MUA HÀNG</h2>
	        <div>
	            <span class="fw-bold">Họ và tên:</span>
		        <span class="name">Lê Quang Tùng</span>
	        </div>
		    <div>
			    <span class="fw-bold">Địa chỉ:</span>
		        <span class="address">TP. Thủ Đức</span>
		    </div>
	        <div>
	        	<span class="fw-bold">Số điện thoại:</span>
	        	<span class="phone">0912472356</span>
	        </div>
    	</div>
        <table class="table table-striped">
            <thead class="border">
                <tr>
                	<th scope="col">STT</th>
                    <th scope="col">Tên sản phẩm </th>
                    <th scope="col">Số lượng</th>
                    <th scope="col">Thành tiền </th>
                </tr>
            </thead>
	        <tbody>
	            <tr>
	            	<th scope="row">1</th>
	                <td>Gà rán</td>
	                <td>10</td>
	                <td>390.000đ</td>
	            </tr>
	            
	            <tr>
	            	<th scope="row">2</th>
	                <td>Pepsi</td>
	                <td>2</td>
	                <td>24.000đ</td>
	            </tr>
	        </tbody>    
        </table>
        <div class="py-4 container footer">
        	<div>
		        <span class="fw-bold">Tổng số tiền đơn hàng:</span>
		        <span class="amount">414.000đ</span>
	        </div>
	        <div>
		        <span class="fw-bold">Ngày xuất hóa đơn:</span>
		        <span class="date">30-11-2022</span>
	        </div>
        </div>
    </div>
</div>
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
