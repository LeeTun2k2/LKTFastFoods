<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
	<head>
		<meta charset="UTF-8">
		<title>LKT Fast Food</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css">
		<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&display=swap" rel="stylesheet">
		<script src="https://kit.fontawesome.com/b029030af9.js"></script>
		<link rel="stylesheet" href="/LKTFastFood/views/assets/css/style.css"/>
	</head>
	<body>
		<!--  Header -->
		<%@ include file="/views/common/header.jsp"%>
		
		<!-- Menu -->
		<%@ include file="/views/client/Menu.jsp" %>
		
		<!-- Cart -->
		<%@ include file="/views/client/Cart.jsp" %>
		
		<!-- Footer -->
		<%@ include file="/views/common/footer.jsp"%>
	</body>
</html>