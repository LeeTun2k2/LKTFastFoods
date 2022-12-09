<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<header id="header" class="py-4 border-bottom">
<!-- Header -->
	<div class="container header">
		<div class="row">
			<div class="inline-block col-5 logo" onclick="location.href='/LKTFastFoods/views/admin/Trang-chu';">
				<div class="row">
					<div>
						<img class="h-100" src="${pageContext.request.contextPath}/views/assets/img/logo/lotteria_logo.svg" alt="LKTFastFood logo"/>
					</div>
					<div class="col brand ml-4">
						<h1 class="brand-name font-weight-bold">LKT FAST FOODS</h1>
						<h6 class="brand-slogan font-weight-light">Mang cả tâm tình trên từng sản phẩm</h6>
					</div>
				</div>
			</div>
			<div class="col inline-block d-flex justify-content-end align-items-center quick-access">
				<ul class="navbar">
					<li class="account item"><h6>Tài khoản</h6></li>
					<li class="order item"><h6>Đánh giá</h6></li>
					<li class="menu item"><h6>Menu</h6></li>
					<li class="voucher item"><h6>Giảm giá</h6></li>
				</ul>
			</div>
		</div>
	</div>
</header>