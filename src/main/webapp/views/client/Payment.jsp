<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<link rel="stylesheet" href="payment.css">
<link href="https://fonts.googleapis.com/css?family=Merriweather:300,400,400i|Noto+Sans:400,400i,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600" rel="stylesheet">


<head>
    <title>Thanh toán đơn hàng</title>
    <meta charset="utf8">
</head>

<body>

    <div class="contains">

        <h1 style="margin-left:400px ;">Thông tin đơn hàng </h1>
        <label>Họ và tên :</label><input class="fullname">
        <label>Địa chỉ giao hàng :</label><input class="address">
        <label>Số điện thoại :</label><input class="phone">
        <label>Mã đơn hàng :</label><input class=" maDH">
        <table style="margin-left:100px" width="1000px" height="50px" border="1" class=" table">
            <thead>
                <tr>
                    <th>Tên sản phẩm </th>
                    <th>Số lượng</th>
                    <th>Thành tiền </th>
                </tr>
            </thead>

            <tr style="height:30px">
                <td></td>
                <td> </td>
                <td> </td>
            </tr>


        </table>
        <label>Tổng số tiền đơn hàng :</label><input class=" totalMonney">
        <label>Tên ngân hàng:</label><input class=" typeCard">
        <label>Số thẻ ngân hàng :</label><input class="numberCard">
        <label>Ngày cấp thẻ(ghi trên thẻ) :</label><input class="dateCard">
        <label>Ngày xuất hóa đơn: </label><input class="dateDH">
        <div class="button">
            <a href=""><button id="submit1">Tiến thành thanh toán </button></a>
            <a href=""><button id="submit">Trở lại giỏ hàng </button></a>
        </div>
    </div>

</body>

</html>