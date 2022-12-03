<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>LKT Fast Food</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css">
		<script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
		<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&display=swap" rel="stylesheet">
		<script src="https://kit.fontawesome.com/b029030af9.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/views/assets/css/clientStyle.css"/>
	</head>
	<body>
		<!-- announce -->
		<%@ include file="/views/common/announce.jsp"%>
	
		<!--  Header -->
		<%@ include file="/views/common/header.jsp"%>
		
		<!-- Menu -->
		<%@ include file="/views/client/Menu.jsp" %>
		
		<!-- History -->
		<%@ include file="/views/client/History.jsp" %>
		
		<!-- Assessment -->
		<%@ include file="/views/client/Assessment.jsp" %>
		
		<!-- Cart -->
		<%@ include file="/views/client/Cart.jsp" %>
		
		<!-- Payment -->
		<%@ include file="/views/client/Payment.jsp" %>
		
		<!-- Account -->
		<%@ include file="/views/client/Account.jsp" %>
		
		<!-- Footer -->
		<%@ include file="/views/common/footer.jsp"%>
	
		<script src="${pageContext.request.contextPath}/views/assets/js/clientData.js"></script>
		<script src="${pageContext.request.contextPath}views/assets/js/clientScript.js"></script>
	</body>
</html>