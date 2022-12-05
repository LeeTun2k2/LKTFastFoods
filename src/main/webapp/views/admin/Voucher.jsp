<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<div id="voucher" class="my-4 hide">
   <div class="container py-4">
      <h2 class="text-center">QUẢN LÝ MÃ GIẢM GIÁ</h2>
      <div class="content py-4">
         <div class="row search col-6 py-2">
            <button id="voucher-search" type="button" class="s-button col-3">Tìm kiếm</button>
            <input class="ml-4 input col" type="text"
               placeholder="Nhập mã giảm giá">
         </div>
         <table class="table table-striped my-4">
            <thead>
               <tr>
                  <th scope="col">Mã giảm giá</th>
                  <th scope="col">Ngày bắt đầu</th>
                  <th scope="col">Ngày kết thúc</th>
                  <th scope="col">Giá trị</th>
               </tr>
            </thead>
          <c:forEach items="${listVoucher}" var="x">
            <tbody>
               <tr>
                  <td >${x.getId()}</td>
                  <td>${x.getStartDate()}</td>
                  <td>${x.getEndDate()}</td>
                  <td>${x.getDiscount()}</td>
               </tr>
            </tbody>
            </c:forEach>
         </table>
         <div class="d-flex justify-content-around">
            <button id="voucher-add" class="button">Thêm voucher</button>
            <button id="voucher-edit" class="button">Sửa voucher</button>
            <button id="voucher-delete" class="button">Xóa voucher</button>
         </div>
      </div>
   </div>
</div>