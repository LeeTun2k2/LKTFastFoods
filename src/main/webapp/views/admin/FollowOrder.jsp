<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="asessment" class="my-4 hide">
	<div class="container py-4">
		<h2 class="text-center">QUẢN LÝ ĐƠN HÀNG</h2>
		<div class="content py-4">
			<table class="table table-striped my-4">
				<thead>
					<tr>
						<th scope="col">Mã đơn hàng</th>
						<th scope="col">Thành tiền</th>

						<th scope="col">Ngày hoàn thành đơn</th>
						<th scope="col">Mô tả thêm của khách hàng</th>
					</tr>
				</thead>
				<c:forEach items="${listOrderInf}" var="x">
					<tbody>
						<tr>
							<td>${x.orderId}</td>
							<td>${x.amount}</td>

							<td>${x.dateDone}</td>
							<td>${x.description}</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
	</div>
</div>