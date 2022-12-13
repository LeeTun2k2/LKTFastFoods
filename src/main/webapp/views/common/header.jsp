<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<header id="header" class="py-4 border-bottom">
<!-- Header -->
	<div class="container header">
		<div class="row">
			<div class="inline-block col-5 logo" onclick="window.location = 'Menu';">
				<div class="row">
					<div>
						<img class="" src="${pageContext.request.contextPath}/views/assets/img/logo/lotteria_logo.svg" alt="LKTFastFood logo"/>
					</div>
					<div class="col brand ml-4">
						<h1 class="brand-name font-weight-bold">LKT FAST FOODS</h1>
						<h5 class="brand-slogan font-weight-light">Mang cả tâm tình trên từng sản phẩm</h5>
					</div>
				</div>
			</div>
			<div class="col inline-block d-flex justify-content-end align-items-center quick-access">
				<div>
				    <div id="header-menu" class="inline-block mx-2"><i class="fa fa-cutlery" aria-hidden="true"></i></div>
					<div id="header-history" class="inline-block mx-2"><i class="fa fa-history" aria-hidden="true"></i></div>
					<div id="header-assessment" class="assessment inline-block mx-2"><i class="fa fa-star-o" aria-hidden="true"></i></div>
					<div id="header-cart" class="inline-block mx-2"><i class="fa fa-shopping-basket" aria-hidden="true"></i></div>
					<div id="header-account" class="inline-block mx-2 "><i class="fa fa-user-o" aria-hidden="true"></i></div>
				</div>
			</div>
			</div>
		</div>
</header>