<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Đánh giá đơn hàng </title>
    <link rel="stylesheet" href="Assessment.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
        integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Merriweather:300,400,400i|Noto+Sans:400,400i,700"
        rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600" rel="stylesheet">
    <link rel='stylesheet prefetch' href='https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css'>


</head>

<body>
    <div class="Register">
        <div class="form">
            <h2>Đánh giá đơn hàng </h2>

            <label>Mã khách hàng :</label>
            <input type="text" name="MaKH" style="text-align: center">
            <label style="margin-left:-820px;">Mã đơn hàng :</label>
            <input type="text" style=" text-align: center;" name="MaDH">
            <div class="stars" style="margin-left:-690px;margin-top: 60px;font-size: 22px"> Chất lượng
                đơn hàng :
                <form action="" class="star-item">
                    <input class="star star-5" id="star-5" type="radio" name="star" />
                    <label class="star star-5" for="star-5"></label>
                    <input class="star star-4" id="star-4" type="radio" name="star" />
                    <label class="star star-4" for="star-4"></label>
                    <input class="star star-3" id="star-3" type="radio" name="star" />
                    <label class="star star-3" for="star-3"></label>
                    <input class="star star-2" id="star-2" type="radio" name="star" />
                    <label class="star star-2" for="star-2"></label>
                    <input class="star star-1" id="star-1" type="radio" name="star" />
                    <label class="star star-1" for="star-1"></label>
                </form>
            </div>
            <a href="./Menu.jsp"><button id="submit">Hoành thành đánh giá</button></a>



        </div>
    </div>
</body>

</html>