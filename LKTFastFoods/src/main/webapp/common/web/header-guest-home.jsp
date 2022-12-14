<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<c:set value="${pageContext.request.contextPath}/assets-web" var="dir" />
<c:set value="" var="url"/>

<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
</head>

<body>
	
	<!-- Topbar Start -->
    <div class="container-fluid">
        <div class="row bg-secondary py-2 px-xl-5">
            <div class="col-lg-6 d-none d-lg-block">
                <div class="d-inline-flex align-items-center">
                    <a class="text-dark" href="">FAQs</a>
                    <span class="text-muted px-2">|</span>
                    <a class="text-dark" href="">Help</a>
                    <span class="text-muted px-2">|</span>
                    <a class="text-dark" href="">Support</a>
                </div>
            </div>
            <div class="col-lg-6 text-center text-lg-right">
                <div class="d-inline-flex align-items-center">
                    <a class="text-dark px-2" href="">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a class="text-dark px-2" href="">
                        <i class="fab fa-twitter"></i>
                    </a>
                    <a class="text-dark px-2" href="">
                        <i class="fab fa-linkedin-in"></i>
                    </a>
                    <a class="text-dark px-2" href="">
                        <i class="fab fa-instagram"></i>
                    </a>
                    <a class="text-dark pl-2" href="">
                        <i class="fab fa-youtube"></i>
                    </a>
                </div>
            </div>
        </div>
        <div class="row align-items-center py-3 px-xl-5">
            <div class="col-lg-3 d-none d-lg-block">
                <a href="${Url}home" class="text-decoration-none">
                    <h1 class="m-0 display-5 font-weight-semi-bold"><span class="text-primary font-weight-bold border px-3 mr-1">E</span>Shopper</h1>
                </a>
            </div>
            <div class="col-lg-6 col-6 text-left">
                <form action="">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search for products">
                        <div class="input-group-append">
                            <span class="input-group-text bg-transparent text-primary">
                                <i class="fa fa-search"></i>
                            </span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-lg-3 col-6 text-right">
                <a href="${Url}login" class="btn border">
                    <i class="fas fa-heart text-primary"></i>
                    <span class="badge"></span>
                </a>
                <a href="${Url}login" class="btn border">
                    <i class="fas fa-shopping-cart text-primary"></i>
                    <span class="badge"></span>
                </a>
            </div>
        </div>
    </div>
    <!-- Topbar End -->


    <!-- Navbar Start -->
    <div class="container-fluid mb-5">
        <div class="row border-top px-xl-5">
            <div class="col-lg-3 d-none d-lg-block">
                <a class="btn shadow-none d-flex align-items-center justify-content-between bg-primary text-white w-100" data-toggle="collapse" href="#navbar-vertical" style="height: 65px; margin-top: -1px; padding: 0 30px;">
                    <h6 class="m-0"><i class="fas fa-x-ray text-primary mr-1"></i>Ph??n lo???i</h6>
                    <i class="fa fa-angle-down text-dark"></i>
                </a>
                <nav class="collapse show navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0" id="navbar-vertical">
                    <div class="navbar-nav w-100 overflow-hidden" style="height: 410px">
                        <a href="?????" class="nav-item nav-link">Chicken</a>	
                        <a href="?????" class="nav-item nav-link">Chicken set</a>	
                        <a href="?????" class="nav-item nav-link">Burger</a>	
                        <a href="?????" class="nav-item nav-link">Combo</a>	
                        <a href="?????" class="nav-item nav-link">Value</a>	
                        <a href="?????" class="nav-item nav-link">Rice</a>	
                        <a href="?????" class="nav-item nav-link">Pack</a>	
                        <a href="?????" class="nav-item nav-link">Drinks</a>
                    </div>
                </nav>
            </div>
            <div class="col-lg-9">
                <nav class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0">
                    <a href="" class="text-decoration-none d-block d-lg-none">
                        <h1 class="m-0 display-5 font-weight-semi-bold"><span class="text-primary font-weight-bold border px-3 mr-1">E</span>Shopper</h1>
                    </a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                        <div class="navbar-nav mr-auto py-0">	
                            <a href="${Url}home" class="nav-item nav-link active"><i class="fas fa-home text-primary mr-1"></i>Trang ch???</a>	
                            <a href="?????" class="nav-item nav-link"><i class="fas fa-x-ray text-primary mr-1"></i>Danh m???c</a>	
                            <a href="?????" class="nav-item nav-link active"><i class="fas fa-search text-primary mr-1"></i>T??m ki???m</a>	
                            <a href="contact.html" class="nav-item nav-link"><i class="fas fa-chalkboard-teacher text-primary mr-1"></i>Li??n h???</a>
                        </div>
                        <div class="navbar-nav ml-auto py-0">
	                         <a href="<c:url value="/login"/>" class="nav-item nav-link"> <i class="fas fa-sign-in-alt text-primary mr-1"></i>????ng nh???p</a>
	                         <div class="nav-item dropdown">
									<a href="?????" class="nav-link dropdown-toggle"
										data-toggle="dropdown"><i class="fas fa-user-plus text-primary mr-1"></i>????ng k??</a>
									<div class="dropdown-menu rounded-0 m-0">
										<a href="<c:url value="/register/customer"/>" class="dropdown-item">Ng?????i mua</a> 
										<a href="<c:url value="/register/vendor"/>" class="dropdown-item">Ng?????i b??n</a>
									</div>
							</div>   
                        </div>
                    </div>
                </nav>
                
                <!-- Hi???n th??? h??nh ???nh n???i b???t -->
                <div id="header-carousel" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active" style="height: 410px;">
                            <img class="img-fluid" src="${dir}/img/carousel-1.jpg" alt="Image">
                        </div>
                        <div class="carousel-item" style="height: 410px;">
                            <img class="img-fluid" src="${dir}/img/carousel-2.jpg" alt="Image">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#header-carousel" data-slide="prev">
                        <div class="btn btn-dark" style="width: 45px; height: 45px;">
                            <span class="carousel-control-prev-icon mb-n2"></span>
                        </div>
                    </a>
                    <a class="carousel-control-next" href="#header-carousel" data-slide="next">
                        <div class="btn btn-dark" style="width: 45px; height: 45px;">
                            <span class="carousel-control-next-icon mb-n2"></span>
                        </div>
                    </a>
                </div>
                <!-- Hi???n th??? h??nh ???nh n???i b???t -->
                
            </div>
        </div>
    </div>
    <!-- Navbar End -->
	
</body>

</html>