
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="vi">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LKT Fast Food</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,500,600,700,900&display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/assets/css/adminStyle.css" />
</head>
<%@ include file="/views/common/adminHeader.jsp"%>

<div id="menu-action" class="my-4">
	<div class="container py-4">
		<h2 class="py-4 text-center">SẢN PHẨM</h2>
		<form enctype="multipart/form-data" method="post" role="form"
			accept="">
			
			<div class="my-4 row">
				<div class="my-2 row col">
				<c:url value="/image?fname=${productUpdate.getImage()}" var="imgUrl"></c:url>
				<label class="col text-right">Hình ảnh :</label> <input type="file"
					name="image"
					onchange="document.querySelector('.imagePic').src = window.URL.createObjectURL(this.files[0]);"
					accept="image/*" style="cursor: pointer;" /> <img class="imagePic"
					width="150" height="150" alt="Ảnh sản phẩm" src="${imgUrl}">
			</div>
				<div class="my-2 row col">
					<label class="col text-right" for="name">Tên sản phẩm:</label> <input
						class="col phone text-center input"
						value="${productUpdate.getName()}" name="name"
						placeholder="Tên sản phẩm">
				</div>
				<div class="col-2"></div>
			</div>
				<div class="my-4 row">
					<div class="my-2 row col">
						<label class="col text-right" for="import">Giá nhập:</label> <input
							class="col text-center  input"
							value="${productUpdate.getImportPrice()}" name="import"
							placeholder="Giá nhập">
					</div>
					<div class="my-2 row col">
						<label class="col text-right" for="export">Giá bán:</label> <input
							class="col text-center input"
							value="${productUpdate.getExportPrice()}" name="export"
							placeholder="Giá bán">
					</div>
					<div class="col-2"></div>
				</div>

				<div class="my-4 row">
					<div class="my-2 row col">
						<label class="col text-right" for="voucherID">Mã giảm giá:</label>
						<input class="col text-center input"
							value="${productUpdate.getVoucher_id()}" name="voucherID"
							placeholder="Mã giảm giá">
					</div>
					<div class="my-2 row col">
						<label class="col text-right" for="description">Mô tả:</label> <input
							class="col text-center input"
							value="${productUpdate.getDescription()}" name="description"
							placeholder="Mô tả">
					</div>
					<div class="col-2"></div>
				</div>

				<div class="py-4 d-flex justify-content-around">
					<button formaction="${pageContext.request.contextPath}/MenuUpdate"
						type="submit" id="payment-submit" class="mx-4 button">Lưu
						lại</button>
					<button
						formaction="${pageContext.request.contextPath}/admin/Trang-chu"
						id="payment-clear" class="mx-4 button">Hủy bỏ</button>
				</div>
		</form>
	</div>

</div>


<script
	src="${pageContext.request.contextPath}/views/assets/js/adminScript.js"></script>
<!-- Footer -->
<%@ include file="/views/common/footer.jsp"%>
</body>

</html>