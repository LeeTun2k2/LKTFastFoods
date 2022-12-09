<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<header id="header" class="py-4 border-bottom">
<!-- Header -->
	<div class="container header">
		<div class="row">
			<div class="inline-block col-5 logo" onclick="location.href='${pageContext.request.contextPath}/views/client/Trang-chu';">
				<div class="row">
					<div>
						<img class="h-100" src="/LKTFastFood/views/assets/img/logo/lotteria_logo.svg" alt="LKTFastFood logo"/>
					</div>
					<div class="col brand ml-4">
						<h1 class="brand-name font-weight-bold">LKT FAST FOODS</h1>
						<h5 class="brand-slogan font-weight-light">Mang cả tâm tình trên từng sản phẩm</h5>
					</div>
				</div>
			</div>
			<div class="col inline-block d-flex justify-content-end align-items-center ">
		       <ul class="navbar">
		         <a href="/LKTFastFoodNew/Login" class="account item"><h6>Đăng xuất</h6></a>
		       </ul>
		       </div>
			<div class="col inline-block d-flex justify-content-end align-items-center quick-access">
				<div>
					<div class="menu border click inline-block mx-2"><i class="fa fa-cutlery" aria-hidden="true"></i></div>
					<div class="history inline-block mx-2"><i class="fa fa-history" aria-hidden="true"></i></div>
					<div class="assessment inline-block mx-2"><i class="fa fa-star-o" aria-hidden="true"></i></div>
					<div class="cart inline-block mx-2"><i class="fa fa-shopping-basket" aria-hidden="true"></i></div>
					<div class="account inline-block mx-2 "><i class="fa fa-user-o" aria-hidden="true"></i></div>
				</div>
			</div>
		</div>
	</div>
</header>