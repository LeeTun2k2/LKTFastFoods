<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="account" class="py-4 hide">
	<div class="py-4 container">
		<h2 class="text-center">THÔNG TIN KHÁCH HÀNG</h2>
		<div class="py-4 content">
			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Họ và tên:</label> 
					<input class="col name text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Ngày sinh:</label> 
					<input class="col birth-date text-center">
				</div>
				<div class="col-2"></div>
			</div>
			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Giới tính:</label> 
					<input class="col gender text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Số điện thoại:</label> 
					<input class="col phone text-center">
				</div>
				<div class="col-2"></div>
			</div>
			<div class="my-2 row">
				<div class="my-2 row col">
					<label class="col text-right">Địa chỉ:</label> 
					<input class="col address text-center">
				</div>
				<div class="my-2 row col">
					<label class="col text-right">Email:</label> 
					<input class="col email text-center">
				</div>
				<div class="col-2"></div>
			</div>
			
		</div>
		<div class="my-4 d-flex justify-content-around">
			<button id="account-rollback" class="button">Huỷ bỏ</button>
			<button id="account-submit" class="button">Cập nhật</button>
		</div>
		
	</div>
</div>