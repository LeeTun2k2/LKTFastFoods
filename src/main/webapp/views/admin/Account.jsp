<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<div id="account" class="my-4">
	<div class="container py-4">
	<form method="post">
		<h2 class="text-center">QUẢN LÝ TÀI KHOẢN</h2>
		<div class="content py-4">
			
			</div>
			<table class="table table-striped my-4" >
				<thead>
					<tr>
						<th scope="col">Lựa chọn</th>
						<th scope="col">Tên đăng nhập</th>
						<th scope="col">Họ tên</th>
						<th scope="col">Ngày sinh</th>
						<th scope="col">Giới tính</th>
						<th scope="col">SĐT</th>
						<th scope="col">Email</th>
						<th scope="col">Địa chỉ</th>
						<th scope="col">Trạng thái</th>
					</tr>
				</thead>
				<c:forEach items="${listS}" var="x">
				<tbody>
				<tr> 
				     <td> <div class="form-check">
      <input class="form-check-input" type="radio" name="selected${x.getUsername()}" value="${x.getUsername()}" id="flexCheckDefault">
        <label class="form-check-label" for="flexCheckDefault" >
        </label></td>
				    <td> ${x.getUsername()}</td>
				    <td> ${x.getName()}</td>
				   <td>${x.getBirthDate()}</td>
				   <td>
				   <c:if  test="${x.isGender()==false}">Nam </c:if>
				   <c:if test="${x.isGender()==true}">Nữ</c:if>
				   </td> 
				   <td>${x.getPhoneNumber()}</td>
				   <td>${x.getEmail()}</td>
				   <td>${x.getAddress()}</td>
				   <td>
				   <c:if  test="${x.active==false}">Đang bị khóa </c:if>
				   <c:if test="${x.active==true}">Hoạt động bình thường</c:if>
				   </td>
				 </tr>
				</tbody>
				</c:forEach>
			</table>

			<div class="d-flex justify-content-around">
				<button formaction="${pageContext.request.contextPath}/AccountLock" id="account-lock" class="button">Khóa tài khoản</button>
				<button formaction="${pageContext.request.contextPath}/AccountUnLock" id="account-unlock" class=" button">Mở tài khoản</button>
			</div>
		</div>
	</form>
	</div>
</div>