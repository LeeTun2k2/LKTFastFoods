<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="voucher" class="my-4 hide">
	<div class="container py-4">
		<h2 class="text-center">QUẢN LÝ MÃ GIẢM GIÁ</h2>
		<div class="content py-4">
			<form method="get">
				<table class="table table-striped my-4">
					<thead>
						<tr>
							<th scope="col">Lựa chọn</th>
							<th scope="col">Mã giảm giá</th>
							<th scope="col">Ngày bắt đầu</th>
							<th scope="col">Ngày kết thúc</th>
							<th scope="col">Giá trị</th>
						</tr>
					</thead>
					<c:forEach items="${listVoucher}" var="x">
						<tbody>
							<tr>
								<td>
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="selected${x.getId()}" value="${x.getId()}"
											id="flexCheckDefault"> <label
											class="form-check-label" for="flexCheckDefault"> </label>
									</div>
								</td>
								<td>${x.getId()}</td>
								<td>${x.getStartDate()}</td>
								<td>${x.getEndDate()}</td>
								<td>${x.getDiscount()}</td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
				<div class="d-flex justify-content-around">
					<button formaction="${pageContext.request.contextPath}/add"
						type="submit" class="button" name="add" value="add">Thêm
						voucher</button>
					<button formaction="${pageContext.request.contextPath}/Update"
						type="submit" class="button" name="edit" value="edit">Sửa
						voucher</button>
					<button formaction="${pageContext.request.contextPath}/Delete"
						type="submit" class="button" name="delete" value="delete">Xóa
						voucher</button>
				</div>
			</form>
		</div>
	</div>
</div>