<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="forgot.css">
    <title>Quên mật khẩu</title>
</head>

<body>
    <section>
        <div class="form">
            <h1 style="color:black;margin:50px 250px;">Tạo lại mật khẩu </h1>
            <label for="password" style=" color:black ; margin:20px 30px;">Nhập mật khẩu mới </label>
            <input type="password" name="password" style="font-size:30px">
            <div>
                <label for="password" style=" color:black ; margin:100px 34px;">Nhập lại mật khẩu</label>
                <input type="password" name="password" style="font-size:30px">
            </div>
            <a href="./login.jsp"><input id="submit" type="submit" name="submit" value="submit"></a>
        </div>

    </section>

</body>

</html>