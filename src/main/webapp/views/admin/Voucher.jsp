<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   
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
            <tbody>
               <tr>
                  <th scope="row">1</th>
                  <td>11/11/2022</td>
                  <td>12/12/2022</td>
                  <td>50%</td>
               </tr>
               <tr>
                  <th scope="row">2</th>
                  <td>01/12/2022</td>
                  <td>31/12/2022</td>
                  <td>15%</td>
               </tr>
            </tbody>
         </table>
         <div class="d-flex justify-content-around">
            <button id="voucher-add" class="button">Thêm voucher</button>
            <button id="voucher-edit" class="button">Sửa voucher</button>
            <button id="voucher-delete" class="button">Xóa voucher</button>
         </div>
      </div>
   </div>
</div>