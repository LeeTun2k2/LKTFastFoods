<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <div id="assessment" class="py-4 hide">
        <div class="py-4 container form">
            <h2 class="text-center">ĐÁNH GIÁ</h2>
	        <div class="py-4 content row">    
				<div class="col-7 order-info">
					<table class="table table-striped">
			            <thead>
			                <tr>
			                	<th scope="col">STT</th>
			                    <th scope="col">Tên sản phẩm </th>
			                    <th scope="col">Số lượng</th>
			                    <th scope="col">Thành tiền </th>
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
				</div>
				
				<div class="col"></div>
				<div class="border rounded col-4 rating">
		            <div class="py-2 row">
		            	<span class="col fw-bold">Mã khách hàng:</span> 
		            	<span class="col-3 text-right ClientID">01</span>
		            </div>
		            <div class="py-2 row">
		            	<span class="col fw-bold">Mã đơn hàng:</span> 
		            	<span class="col-3 text-right OrderID">01</span>
		            </div>
		            <div class="stars py-2 row">
		            	<span class="col">Đánh giá:</span>
		                <form action="submit" class="col text-right inline-block star">
		                	<span class="fa fa-star checked" id="star-1"></span>
							<span class="fa fa-star checked" id="star-2"></span>
							<span class="fa fa-star checked" id="star-3"></span>
							<span class="fa fa-star checked" id="star-4"></span>
							<span class="fa fa-star checked" id="star-5"></span>
		                </form>
		            </div>
		            <div class="py-2 row">
		            	<label class="col" for="comment">Góp ý</label> 
		            	<input class="mr-3 col-8 focus" name="comment">
		            </div>
		            <div class="my-4 text-center">
		            	<button id="assessment-submit" type="submit" class="button">Gửi đánh giá</button>
		            </div>
	            </div>
       		</div>
        </div>
    </div>