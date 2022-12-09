<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="LKTFastFood/views/assets/css/clientStyle.css"/>
<div id="payment" class="hide py-4">
	<div class="container py-4">
		<h2 class="text-center">THANH TOÁN</h2>
		<div class="my-2 row">
			<div class="my-2 row col">
				<label class="col text-right">Họ và tên:</label> <input
					class="col name text-center">
			</div>
			<div class="my-2 row col">
				<label class="col text-right">Số điện thoại:</label> <input
					class="col phone text-center">
			</div>
			<div class="col-2"></div>
		</div>
		<div class="my-2 row">
			<div class="my-2 row col">
				<label class="col text-right">Địa chỉ:</label> <input
					class="col address text-center">
			</div>
			<div class="my-2 row col">
				<label class="col text-right">Mã đơn hàng:</label> <input
					class="col OrderID text-center">
			</div>
			<div class="col-2"></div>
		</div>

		<table class="my-4 table table-striped">
			<thead>
				<tr>
					<th scope="col">STT</th>
					<th scope="col">Tên sản phẩm</th>
					<th scope="col">Số lượng</th>
					<th scope="col">Thành tiền</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Gà rán</td>
					<td>10</td>
					<td>390.000đ</td>
				</tr>

				<tr>
					<th scope="row">2</th>
					<td>Pepsi</td>
					<td>2</td>
					<td>24.000đ</td>
				</tr>
			</tbody>
		</table>

		<div class="my-2 row">
			<div class="my-2 row col">
				<label class="col text-right">Thành tiền:</label> <input
					class="col amount text-center">
			</div>
			<div class="my-2 row col">
				<label class="col text-right">Ngân hàng:</label> <input
					class="col bank text-center">
			</div>
			<div class="col-2"></div>
		</div>
		<div class="my-2 row">
			<div class="my-2 row col">
				<label class="col text-right">Số tài khoản:</label> <input
					class="col account-number text-center">
			</div>
			<div class="my-2 row col">
				<label class="col text-right">Chủ tài khoản:</label> <input
					class="col account-name text-center">
			</div>
			<div class="col-2"></div>
		</div>
		<div class="my-4 d-flex justify-content-around">
			<button id="payment-back" class="button">Quay lại</button>
			<button id="payment-submit" class="button">Thanh toán</button>
		</div>
	</div>
</div>