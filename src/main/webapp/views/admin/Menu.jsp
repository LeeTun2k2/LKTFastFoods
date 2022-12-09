<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<div id="menu" class="my-4 hide">
	<div class="container py-4">
		<h2 class="text-center">QUẢN LÝ MENU</h2>
		<div class="content py-4">
		<form method="get">
			<table class="table table-striped my-4">
				<thead>
					<tr>
					  <th scope="col">Lựa chọn</th>
						<th scope="col">Mã sản phẩm</th>
						<th scope="col">Tên sản phẩm</th>
						<th scope="col">Giá niêm yết</th>
						<th scope="col">Giá bán</th>
						<th scope="col">Mã giảm giá</th>
						<th scope="col">Mô tả</th>
					</tr>
				</thead>
				<c:forEach items="${listProduct}" var="x">
				<tbody>
				<tr>
				    <td> ${x.getId()}</td>
				    <td> ${x.getName()}</td>
				   <td>${x.getImportPrice()}</td>
				   <td>${x.getExportPrice()}</td> 
				   <td>${x.getVoucher_id()}</td>
				   <td>${x.getDescription()}</td>
				   
				 </tr>
				</tbody>
				</c:forEach>
			</table>
			<div class="d-flex justify-content-around">
				<button  formaction="${pageContext.request.contextPath}/MenuAdd" id="menu-add" class="button">Thêm sản phẩm</button>
				<button formaction="${pageContext.request.contextPath}/MenuUpdate" id="menu-edit" class="button">Sửa sản phẩm</button>
				<button type="submit" formaction="${pageContext.request.contextPath}/MenuDelete" id="menu-delete" class="button">Xóa sản phẩm</button>
			</div>
			</form>
		</div>
	</div>
</div>