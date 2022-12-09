<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<div id="order" class="my-4 hide">
	<div class="container py-4">
		<h2 class="text-center">QUẢN LÝ ĐÁNH GIÁ</h2>
		<div class="content py-4">
			
			<table class="table table-striped my-4">
				<thead>
					<tr>
					
						<th scope="col">Tên đăng nhập</th>
						<th scope="col">Mã đơn hàng</th>
						
						<th scope="col">Đánh giá</th>
						<th scope="col">Góp ý</th>
					</tr>
				</thead>
			<c:forEach items="${listOrder}" var="x">
				<tbody>
				<tr>
				
				    <td> ${x.getClient_id()}</td>
				    <td> ${x.getOrder_id()}</td>
				  
				   <td>${x.getStar()}</td> 
				   <td>${x.getComment()}</td>
				 </tr>
				</tbody>
				</c:forEach>
			</table>
		</div>
	</div>
</div>