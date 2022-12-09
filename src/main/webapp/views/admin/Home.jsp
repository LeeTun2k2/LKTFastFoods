<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>LKT Fast Food</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css">
		<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&display=swap" rel="stylesheet">
		<script src="https://kit.fontawesome.com/b029030af9.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/views/assets/css/adminStyle.css" />
	</head>
	<body>
		<!-- announce -->
		<%@ include file="/views/common/announce.jsp"%>
	
		<!-- Header -->
		<%@ include file="/views/common/adminHeader.jsp"%>
		
		<!-- Account -->
		<%@ include file="/views/admin/Account.jsp"%>
		
		<!-- Order -->
		<%@ include file="/views/admin/Order.jsp"%>
		
		<!-- menu -->
		<%@ include file="/views/admin/Menu.jsp"%>
		
		<!-- voucher -->
		<%@ include file="/views/admin/Voucher.jsp"%>
		
		<!-- Footer -->
		<%@ include file="/views/common/footer.jsp"%>
		<script src="${pageContext.request.contextPath}/views/assets/js/adminScript.js"></script>
	</body>
</html>