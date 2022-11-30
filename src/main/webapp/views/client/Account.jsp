<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Thông tin khách hàng</title>
    <link rel="stylesheet" href="account.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
        integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Merriweather:300,400,400i|Noto+Sans:400,400i,700"
        rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600" rel="stylesheet">
</head>

<body>
    <div class="Register">
        <div class="form">
            <h2>Thông tin khách hàng </h2>

            <label>Họ và tên</label>
            <input type="text" name="hoten" style="text-align: center">
            <label>Ngày sinh</label>
            <input type="date" style=" text-align: center;" name="ngaysinh">
            <label for="">Giới tính </label>
            <input type="text" style=" text-align: center;">

            <label>Số điện thoại</label>
            <input type="text" name="sdt" style="text-align: center">
            <label>Địa chỉ</label>
            <input type="text" name="address" style="text-align: center">
            <label>Email</label>
            <input type="text" name="email" style="text-align: center">


            <a href=""><button id="submit" style="color:white;font-size:20px;">Cập nhật thông tin</button></a>
            <a href=""><button id="submit1" style="color:white;font-size:20px;">Quay lại trang trước</button></a>




        </div>
    </div>
</body>

</html>