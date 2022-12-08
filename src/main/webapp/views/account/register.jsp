<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Đăng kí tài khoản </title>
    <link rel="stylesheet" href="/LKTFastFood/views/account/registerStyle.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
        integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Merriweather:300,400,400i|Noto+Sans:400,400i,700"
        rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600" rel="stylesheet">
</head>

<body>
  <form action="Register" method="post">
    <div  class="Register">
        <div class="form">
        
            <h2>Đăng ký tài khoản </h2>
           
            <label style="margin-left: -270px;">Họ và tên</label>
            <input type="text" name="hoten" style="text-align: center">
            <label style="margin-left: -270px;">Ngày sinh</label>
            <input type="date" style="width: 70% ; text-align: center;" name="ngaysinh">
              <div class="gender" >
                <input name="Gender" type="radio" value="false" style="margin:5px 5px 30px 40px">Nam
                <input name="Gender" type="radio" value="true" style="margin:5px 5px 30px 40px">Nữ
                 </div>
              <label style="margin-left: -250px;">Tên đăng nhập</label>
            <input type="text" name="username" style="text-align: center">
             <label style="margin-left: -230px;">Nhập mật khẩu </label>
            <input type="password" style="width: 70%;text-align: center " name="password">
            <label style="margin-left: -210px;">Nhập lại mật khẩu </label>
            <input type="password" style="width: 70%;text-align: center; " name="password">
           <label style="margin-left: -250px;">Số điện thoại</label>
            <input type="text" name="sdt" style="text-align: center">
            <label style="margin-left: -290px;">Địa chỉ</label>
            <input type="text" name="address" style="text-align: center">
            <label style="margin-left: -300px;">Email</label>
            <input type="text" name="email" style="text-align: center">
           

            <button type="submit" id="submit" >Submit</button>
        </div>
        </div>
        </form>
    </div>
</body>

</html>
