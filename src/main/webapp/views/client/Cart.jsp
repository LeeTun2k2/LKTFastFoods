<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="cart" class="py-4 hide">
	<div class="container py-4">
		<h2 class="text-center">GIỎ HÀNG</h2>
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
					<td>
						<ul>
							<li class="action decrease"><i class="fas fa-minus"></i></li>
							<li><span class="quantity">10</span></li>
							<li class="action increase"><i class="fa fa-plus"></i></li>
						</ul> 
					</td>
					<td>390.000đ</td>
				</tr>

				<tr>
					<th scope="row">2</th>
					<td>Pepsi</td>
					<td>
						<ul>
							<li class="action"><i class="fas fa-minus"></i></li>
							<li><span class="quantity">2</span></li>
							<li class="action"><i class="fa fa-plus"></i></li>
						</ul> 
					</td>
					<td>24.000đ</td>
				</tr>
			</tbody>
		</table>

		<div class="my-2 row">
			<div class="my-2 row col">
				<span class="col text-right">Tổng cộng:</span> 
				<span class="amount col"> </span>
			</div>
			<div class="col"></div>
		</div>
		<div class="my-4 d-flex justify-content-around">
			<button id="payment-back" class="button">Quay lại</button>
			<button id="payment-submit" class="button">Thanh toán</button>
		</div>
	</div>
</div>