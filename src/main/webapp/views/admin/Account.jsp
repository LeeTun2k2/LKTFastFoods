<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<link rel="stylesheet" href="Account.css">
<link href="https://fonts.googleapis.com/css?family=Merriweather:300,400,400i|Noto+Sans:400,400i,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600" rel="stylesheet">

<head>
    <title>Quản lý tài khoản </title>
    <meta charset="utf8">
</head>

<body>
    <div class="Contains">
        <h1>Quản lý khách hàng </h1>
        <div class="search"><button class="search search-button">Tìm kiếm  </button><input type="text"
                placeholder="Nhập tên đăng nhập tài khoản">
        </div>
        <div class="account">
            <table border="1">
                <thead>
                    <tr>
                        <th>Tên đăng nhập</th>
                        <th>Họ tên </th>
                        <th>Ngày sinh </th>
                        <th>Số điện thoại</th>
                        <th>Email</th>
                        <th>Địa chỉ</th>
                    </tr>
                </thead>
                <tr style="height: 30px;">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </div>

        <div class="ChucNang">
        <a href=""><button class="button lock"> Khóa tài khoản </button> </a>
       <a href=""><button class=" button unlock">Mở khóa tài khoản </button></a>
            
        </div>


    </div>


</body>

</html>