<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="menu" class="my-4 hide">
	<div class="container py-4">
		<h2 class="text-center">QUẢN LÝ MENU</h2>
		<div class="content py-4">
			<div class="row search col-6 py-2">
				<button id="menu-search" type="button" class="s-button col-3">Tìm kiếm</button>
				<input class="ml-4 input col" type="text"
					placeholder="Mã sản phẩm">
			</div>
			<table class="table table-striped my-4">
				<thead>
					<tr>
						<th scope="col">Mã sản phẩm</th>
						<th scope="col">Tên sản phẩm</th>
						<th scope="col">Giá niêm yết</th>
						<th scope="col">Giá bán</th>
						<th scope="col">Mã giảm giá</th>
						<th scope="col">Mô tả</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>Gà rán</td>
						<td>100.000đ</td>
						<td>70.000đ</td>
						<td>1</td>
						<td>Gà rán chấm mắm tôm</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>Coca hắc ám</td>
						<td>200.000đ</td>
						<td>1.000đ</td>
						<td>2</td>
						<td>Coca mix trân câu đường đen</td>
					</tr>
				</tbody>
			</table>

			<div class="d-flex justify-content-around">
				<button id="menu-add" class="button">Thêm sản phẩm</button>
				<button id="menu-edit" class="button">Sửa sản phẩm</button>
				<button id="menu-delete" class="button">Xóa sản phẩm</button>
			</div>
		</div>
	</div>
</div>