<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="ManagerVoucher.css">
<link href="https://fonts.googleapis.com/css?family=Merriweather:300,400,400i|Noto+Sans:400,400i,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600" rel="stylesheet">

<head>
    <title>Danh sách voucher</title>
    <meta charset="utf8">
</head>

<body>
    <div class="Contains">
        <h1>Danh sách voucher </h1>
        <div class="search"><button class="search search-button">Tìm kiếm </button><input type="text"
                placeholder="Nhập mã giảm giá ">
        </div>
        <div class="Order">
            <table border="1">
                <thead>
                    <tr>
                        <th>Mã giảm giá </th>
                        <th>Ngày bắt đầu</th>
                        <th>Ngày kết thúc </th>
                        <th>Giá trị </th>

                    </tr>
                </thead>
                <tr style="height: 30px;">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </div>

        <div class="ChucNang">

            <a href="./Voucher.jsp"> <button class="button add"> Thêm </button></a>
            <a href="./Voucher.jsp"> <button class=" button fix">Sửa </button> </a>
            <a href="./Voucher.jsp"> <button class="button delete">Xóa</button> </a>
        </div>


    </div>


</body>

</html>