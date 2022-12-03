<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="order" class="my-4 hide">
	<div class="container py-4">
		<h2 class="text-center">QUẢN LÝ ĐÁNH GIÁ</h2>
		<div class="content py-4">
			<div class="row search col-6 py-2">
				<button id="order-search" type="button" class="s-button col-3">Tìm kiếm</button>
				<input class="ml-4 input col" type="text"
					placeholder="Nhập mã đơn hàng">
			</div>
			<table class="table table-striped my-4">
				<thead>
					<tr>
						<th scope="col">STT</th>
						<th scope="col">Tên đăng nhập</th>
						<th scope="col">Mã đơn hàng</th>
						<th scope="col">Ngày đặt hàng</th>
						<th scope="col">Đánh giá</th>
						<th scope="col">Góp ý</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>LeeTun2k2</td>
						<td>Lê Quang Tùng</td>
						<td>01/12/2022</td>
						<td>5</td>
						<td>Ngon vãi</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>fifaonline4</td>
						<td>La La La</td>
						<td>30/11/2022</td>
						<td>1</td>
						<td>Có con ruồi trong phần ăn</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>