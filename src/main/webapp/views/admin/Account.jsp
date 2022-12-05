<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<div id="account" class="my-4">
	<div class="container py-4">
	<form action="get">
		<h2 class="text-center">QUẢN LÝ TÀI KHOẢN</h2>
		<div class="content py-4">
			<div class="row search col-6 py-2">
				<button id="account-search" type="button" class="s-button col-3">Tìm kiếm</button>
				<input class="ml-4 input col" type="text"
					placeholder="Nhập tên đăng nhập tài khoản">
			</div>
			<table class="table table-striped my-4">
				<thead>
					<tr>
						
						<th scope="col">Tên đăng nhập</th>
						<th scope="col">Họ tên</th>
						<th scope="col">Ngày sinh</th>
						<th scope="col">Giới tính</th>
						<th scope="col">SĐT</th>
						<th scope="col">Email</th>
						<th scope="col">Địa chỉ</th>
					</tr>
				</thead>
				<c:forEach items="${listS}" var="x">
				<tbody>
				<tr>
				    <td> ${x.getUsername()}</td>
				    <td> ${x.getName()}</td>
				   <td>${x.getBirthDate()}</td>
				   <td>${x.isGender()}</td> 
				   <td>${x.getPhoneNumber()}</td>
				   <td>${x.getEmail()}</td>
				   <td>${x.getAddress()}</td>
				 </tr>
				</tbody>
				</c:forEach>
			</table>

			<div class="d-flex justify-content-around">
				<button id="account-lock" class="button">Khóa tài khoản</button>
				<button id="account-unlock" class=" button">Mở tài khoản</button>
			</div>
		</div>
	</form>
	</div>
</div>