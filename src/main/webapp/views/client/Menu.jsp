<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="menu" class="py-5">
	<div class="py-4 container">
		<div class="row justify-content-center text-center">
			<div class="col-md-8 col-lg-6">
				<div class="header">
					<h2 class="pb-4">THỰC ĐƠN</h2>
				</div>
			</div>
		</div>
		<div class="row">
			<!-- Single Product -->
			<div class="col-md-6 col-lg-4 col-xl-3">
			
				<c:forEach items="${products}" var="product">
					<div id="product_${product.id}" class="single-product">
						<div class="part-1">
							<img class="w-100" src="${product.image}}"
								alt="${product.name}" /> <span class="discount">${product.voucher}</span>
							<ul>
								<li><i class="fas fa-plus"></i></li>
							</ul>
						</div>
						<div class="part-2">
							<h3 class="product-title">${product.name}</h3>
							<p class="text-justify product-description">${product.description}</p>
							<div class="d-flex justify-content-between align-items-center">
								<h4 class="product-old-price">${product.exportPrice}</h4>
								<div>
									<h4 class="product-price mr-4">${product.amount}</h4>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				
			</div>
		</div>
	</div>
</div>