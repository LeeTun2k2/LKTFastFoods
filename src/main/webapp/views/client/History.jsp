<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="History.css">

<head>
    <title>Thông tin đơn hàng </title>
    <meta charset="utf-8">
</head>

<body>

    <div class="contains"  style="height:auto">
        <h1 style="margin-left:400px">Thông tin đơn hàng </h1>
        <span class="orderInf">Họ và tên :<span class="orderInf fullname-orderInf"> </span></span>
        <span class="orderInf">Địa chỉ :<span class=" orderInf address-orderInf"> </span></span>
        <span class="orderInf">Số điện thoại :<span class=" orderInf phone-orderInf"> </span></span>
        <table style="margin-left:100px" width="1000px" height="50px" border="1" class="orderInf table-orderInf">
            <thead style="height:50px">
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
        <span class="orderInf">Tổng số tiền đơn hàng :<span class=" totalMonney-orderInf"> </span></span>
        <span class="orderInf">Ngày xuất hóa đơn: <span></span class="date-oerderInf"></span>
        <a href=""><button id="submit">Trở về trang chủ</button></a>
    </div>

</body>

</html>