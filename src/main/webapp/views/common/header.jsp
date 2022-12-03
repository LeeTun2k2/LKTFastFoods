<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<header id="header" class="py-4 border-bottom">
<!-- Header -->
	<div class="container header">
		<div class="row">
			<div class="inline-block col-5 logo" onclick="location.href='${pageContext.request.contextPath}/views/client/Home.jsp';">
				<div class="row">
					<div>
						<img class="h-100" src="${pageContext.request.contextPath}/views/assets/img/logo/lotteria_logo.svg" alt="LKTFastFood logo"/>
					</div>
					<div class="col brand ml-4">
						<h1 class="brand-name font-weight-bold">LKT FAST FOODS</h1>
						<h5 class="brand-slogan font-weight-light">Mang cả tâm tình trên từng sản phẩm</h5>
					</div>
				</div>
			</div>
	
			<div class="col inline-block d-flex justify-content-end align-items-center quick-access">
				<div>
				    <a href="${pageContext.request.contextPath}/views/client/Menu.jsp"><div class="menu border click inline-block mx-2"><i class="fa fa-cutlery" aria-hidden="true"></i></div></a>
				    <a href="${pageContext.request.contextPath}/views/client/History.jsp"><div class="history inline-block mx-2"><i class="fa fa-history" aria-hidden="true"></i></div></a>	
					<a href="${pageContext.request.contextPath}/views/client/Assessment.jsp"><div class="assessment inline-block mx-2"><i class="fa fa-star-o" aria-hidden="true"></i></div></a>
					<a href="${pageContext.request.contextPath}/views/client/Cart.jsp"><div class="cart inline-block mx-2"><i class="fa fa-shopping-basket" aria-hidden="true"></i></div></a>
					<a href="${pageContext.request.contextPath}/views/client/Account.jsp"><div class="account inline-block mx-2 "><i class="fa fa-user-o" aria-hidden="true"></i></div></a>
				</div>
				<c:choose>
					<c:when test="${sessionScope.account== null }">
						<div class=" col-sm-6">
							<ul class=" list-inline right-topbar pull-right">
								<li><a href="${pageContext.request.contextPath}/Login">Đăng
										nhập</a> <a href="${pageContext.request.contextPath}/Register">
										Đăng ký</a></li>

							</ul>
						</div>
					</c:when>
					<c:otherwise>
						<div class="col-sm-6">
							<ul class="list-inline right-topbar pull-right">
								<li><a
									href="${pageContext.request.contextPath}/member/myaccount">${sessionScope.account.fullName}</a>]
									<a href="${pageContext.request.contextPath}/Logout">Đăng kí</a>
								</li>

							</ul>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
</header>