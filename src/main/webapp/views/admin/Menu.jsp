<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<div id="menu" class="my-4 hide">
	<div class="container py-4">
		<h2 class="text-center">QUẢN LÝ MENU</h2>
		<div class="content py-4">
<<<<<<< HEAD
			<div class="row search col-6 py-2">
				<button id="menu-search" type="button" class="s-button col-3">Tìm kiếm</button>
				<input class="ml-4 input col" type="text"
					placeholder="Mã sản phẩm">
			</div>
			<table class="table table-striped my-4">
				<thead>
					<tr>
=======
		<form method="get">
			<table class="table table-striped my-4">
				<thead>
					<tr>
					  <th scope="col">Lựa chọn</th>
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
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
<<<<<<< HEAD
=======
				     <td> <div class="form-check">
                      <input class="form-check-input" type="radio" name="selected${x.getId()}" value="${x.getId()}" id="flexCheckDefault">
                      <label class="form-check-label" for="flexCheckDefault">
                      </label></td>
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
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
<<<<<<< HEAD

			<div class="d-flex justify-content-around">
				<button id="menu-add" class="button">Thêm sản phẩm</button>
				<button id="menu-edit" class="button">Sửa sản phẩm</button>
				<button id="menu-delete" class="button">Xóa sản phẩm</button>
			</div>
=======
			<div class="d-flex justify-content-around">
				<button  formaction="${pageContext.request.contextPath}/MenuAdd" id="menu-add" class="button">Thêm sản phẩm</button>
				<button formaction="${pageContext.request.contextPath}/MenuUpdate" id="menu-edit" class="button">Sửa sản phẩm</button>
				<button type="submit" formaction="${pageContext.request.contextPath}/MenuDelete" id="menu-delete" class="button">Xóa sản phẩm</button>
			</div>
			</form>
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		</div>
	</div>
</div>