<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>voucher </title>
    <link rel="stylesheet" href="Voucher.css">


</head>

<body>
    <div class="contains">
        <h1>Voucher</h1>
        <div class="information">
            <label for="">Mã giảm giá </label> <input type="text">
            <label for="">Ngày bắt đầu </label> <input type="date">
            <label for="">Ngày kết thúc</label><input type="date">
            <label for="">Giá trị </label><input type="text">
        </div>
        <div class="chucnang">
            <button class="button save">Lưu lại </button>
            <button class="button reset"> Làm mới </button>
            <button class="button edit">Hủy</button>
        </div>
    </div>
</body>

</html>