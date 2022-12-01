<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="account" class="my-4">
	<div class="container py-4">
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
						<th scope="col">STT</th>
						<th scope="col">Tên đăng nhập</th>
						<th scope="col">Họ tên</th>
						<th scope="col">Ngày sinh</th>
						<th scope="col">SĐT</th>
						<th scope="col">Email</th>
						<th scope="col">Địa chỉ</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>LeeTun2k2</td>
						<td>Lê Quang Tùng</td>
						<td>07/10/2002</td>
						<td>0961382753</td>
						<td>lequangtung2002@gmail.com</td>
						<td>TP. Thủ Đức</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>fifaonline4</td>
						<td>La La La</td>
						<td>17/12/2002</td>
						<td>0841092841</td>
						<td>fifaonline4@gmail.com</td>
						<td>Hà Nội</td>
					</tr>
				</tbody>
			</table>

			<div class="d-flex justify-content-around">
				<button id="account-lock" class="button">Khóa tài khoản</button>
				<button id="account-unlock" class=" button">Mở tài khoản</button>
			</div>
		</div>
	</div>
</div>