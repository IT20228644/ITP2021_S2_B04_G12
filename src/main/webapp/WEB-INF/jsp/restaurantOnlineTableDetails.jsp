<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="../../onlineRestaurant/restaurant/css/reset.css" type="text/css" media="all">
    <link rel="stylesheet" href="../../onlineRestaurant/restaurant/css/layout.css" type="text/css" media="all">
    <link rel="stylesheet" href="../../onlineRestaurant/restaurant/css/style.css" type="text/css" media="all">
    <link rel="stylesheet" href="../../onlineRestaurant/restaurant/css/zerogrid.css" type="text/css" media="all">
    <link rel="stylesheet" href="../../onlineRestaurant/restaurant/css/responsive.css" type="text/css" media="all">
    <script type="text/javascript" src="../../onlineRestaurant/restaurant/js/jquery-1.6.js"></script>
    <script type="text/javascript" src="../../onlineRestaurant/restaurant/js/cufon-yui.js"></script>
    <script type="text/javascript" src="../../onlineRestaurant/restaurant/js/cufon-replace.js"></script>
    <script type="text/javascript" src="../../onlineRestaurant/restaurant/js/Forum_400.font.js"></script>
    <script type="text/javascript" src="../../onlineRestaurant/restaurant/js/atooltip.jquery.js"></script>
    <script type="text/javascript" src="../../onlineRestaurant/restaurant/js/css3-mediaqueries.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script type="text/javascript" src="../../onlineRestaurant/restaurant/js/html5.js"></script>
    <style type="text/css">
        .slider_bg {
            behavior: url(../../onlineRestaurant/restaurant/js/PIE.htc)
        }
    </style>

    <!--[if lt IE 7]>
    <div style='clear:both;text-align:center;position:relative'>
        <a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img
                src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0"
                alt=""/></a>
    </div>
    <![endif]-->

    <title>Burger King - Food Website Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free Website Template" name="keywords">
    <meta content="Free Website Template" name="description">

    <!-- Favicon -->
    <link href="../../online/img/favicon.ico" rel="icon">

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400|Nunito:600,700" rel="stylesheet">

    <!-- CSS Libraries -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="../../online/lib/animate/animate.min.css" rel="stylesheet">
    <link href="../../online/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="../../online/lib/flaticon/font/flaticon.css" rel="stylesheet">
    <link href="../../online/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Template Stylesheet -->
    <link href="../../online/css/style.css" rel="stylesheet">
</head>

<body >
<%--<div class="body6">--%>
<%--    <div class="body1">--%>
<%--        <div class="main zerogrid">--%>
<%--            <!-- header -->--%>
<%--            <header>--%>
<%--                <h1><a href="onlineDashboard" style="position: relative;left: -50px;top: -30px" id="logo"><img--%>
<%--                        src="../../onlineRestaurant/restaurant/images/logo.png"/></a></h1>--%>
<%--                <nav>--%>
<%--                    <ul id="top_nav">--%>
<%--                        <li><a href="onlineDashboard"><img src="../../onlineRestaurant/restaurant/images/icon_1.gif"--%>
<%--                                                           alt=""></a></li>--%>
<%--                        <li><a href="#"><img src="../../onlineRestaurant/restaurant/images/icon_2.gif" alt=""></a></li>--%>
<%--                        <li class="end"><a href="onlineCustomer"><i class="fa fa-user"--%>
<%--                                                                    style="color: rgba(255,255,255,0.91); font-size:20px;">--%>
<%--                            LogIn</i></a></li>--%>
<%--                    </ul>--%>
<%--                </nav>--%>
<%--                <nav>--%>
<%--                    <ul id="menu">--%>
<%--                        <li><a href="onlineDashboard">Dashboard</a></li>--%>
<%--                        <li><a href="onlineOrder">Order</a></li>--%>
<%--                        <li class="active"><a href="onlineTable">Table</a></li>--%>
<%--                        <li><a href="#">About Us</a></li>--%>
<%--                        <li><a href="onlineContact">Contacts</a></li>--%>
<%--                    </ul>--%>
<%--                </nav>--%>
<%--            </header>--%>
<%--            <!-- / header -->--%>
<%--            <!-- content -->--%>
<%--            <article id="content">--%>
<%--                <div class="wrap">--%>
<%--                    <section class="col-1-3">--%>
<%--                        <div class="wrap-col">--%>
<%--                            <div class="box">--%>
<%--                                <div>--%>
<%--                                    <h2>Did You <span>Know</span></h2>--%>
<%--                                    <figure><img src="../../onlineRestaurant/restaurant/images/page2_img1.jpg" alt="">--%>
<%--                                    </figure>--%>
<%--                                    <p class="pad_bot1">Neque porro quisquam est, qui dolor- em ipsum qudolor sitamet--%>
<%--                                        consectetur adipisci velit, sed quia non numquam eius modi tempora incidunt.</p>--%>
<%--                                    <a href="#" class="button1">Read More</a>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </section>--%>
<%--                    <section class="col-1-3">--%>
<%--                        <div class="wrap-col">--%>
<%--                            <div class="box">--%>
<%--                                <div>--%>
<%--                                    <h2 class="letter_spacing">Types<span> of Cuisine</span></h2>--%>
<%--                                    <ul class="list1 pad_bot1">--%>
<%--                                        <li><a href="#">Lorem ipsum dolor sit amet</a></li>--%>
<%--                                        <li><a href="#">Consectetur adipisicing elit sed</a></li>--%>
<%--                                        <li><a href="#">Eiusmod tempor incididunt labore</a></li>--%>
<%--                                        <li><a href="#">Ut enim ad minim veniam</a></li>--%>
<%--                                        <li><a href="#">Quis nostrud exercation ullamco </a></li>--%>
<%--                                        <li><a href="#">Laboris nisi ut aliquip</a></li>--%>
<%--                                        <li><a href="#">Commodo consequat aute </a></li>--%>
<%--                                        <li><a href="#">Irure dolor in reprehenderit</a></li>--%>
<%--                                        <li><a href="#">Voluptate velit esse cillum dolore</a></li>--%>
<%--                                    </ul>--%>
<%--                                    <a href="#" class="button1">Proposal for You</a>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </section>--%>
<%--                    <section class="col-1-3">--%>
<%--                        <div class="wrap-col">--%>
<%--                            <div class="box">--%>
<%--                                <div>--%>
<%--                                    <h2>Dish <span>of the Day</span></h2>--%>
<%--                                    <figure><img src="../../onlineRestaurant/restaurant/images/page2_img2.jpg" alt="">--%>
<%--                                    </figure>--%>
<%--                                    <p class="pad_bot1">At vero eos et accusamus et iusto odio dignissimos ducimus qui--%>
<%--                                        blanditiis praesentium voluptatum deleniti atque corrupti quos.</p>--%>
<%--                                    <a href="#" class="button1">Read More</a>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </section>--%>
<%--                </div>--%>
<%--            </article>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<!-- Nav Bar Start -->
<div class="navbar navbar-expand-lg bg-light navbar-light">
    <div class="container-fluid">
        <a href="index.html" class="navbar-brand">Burger <span>King</span></a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
            <div class="navbar-nav ml-auto">
                <a href="index.html" class="nav-item nav-link">Home</a>
                <a href="about.html" class="nav-item nav-link">About</a>
                <a href="feature.html" class="nav-item nav-link">Feature</a>
                <a href="team.html" class="nav-item nav-link">Chef</a>
                <a href="menu.html" class="nav-item nav-link">Menu</a>
                <a href="booking.html" class="nav-item nav-link active">Booking</a>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Pages</a>
                    <div class="dropdown-menu">
                        <a href="blog.html" class="dropdown-item">Blog Grid</a>
                        <a href="single.html" class="dropdown-item">Blog Detail</a>
                    </div>
                </div>
                <a href="contact.html" class="nav-item nav-link">Contact</a>

                <nav>
                    <ul id="top_nav">
                        <li><a href="#"><img src="../../onlineRestaurant/restaurant/images/icon_2.gif" alt=""></a></li>
                        <li class="end"><a href="onlineCustomer"><i class="fa fa-user"
                                                                    style="color: rgba(255,255,255,0.91); font-size:20px;">
                            LogIn ${loggerId.name}
                        </i></a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>
<!-- Nav Bar End -->


<!-- Page Header Start -->
<div class="page-header mb-0">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <h2>Book A Table</h2>
            </div>
            <div class="col-12">
                <a href="">Home</a>
                <a href="">Booking</a>
            </div>
        </div>
    </div>
</div>
<!-- Page Header End -->

<div class="body2">
    <div class="main zerogrid">
        <article id="content2">
            <div class="wrapper">
                <section>
                    <h2>Available Tables</h2>
                    <h5>Please Select </h5>
                    <div class="wrapper">

                            <form method="POST" action="saveOnlineTable" name="saveOnlineTable">
                                <input style="display: none" readonly required type="text" id="itemPay" name="orderData">
                                <input  style="" readonly required="required" type="date" id="vDate" value="${reservedDate}" name="vDate">
                                <input readonly required ="required"type="time" id="timeIn" value="${timeIn}" name="vStatT">
                                <input readonly required ="required" type="time" id="timeOut" value="${timeOut}" name="vEndT">
                            <button type="submit" onclick="getValue()"  class="btn custom-btn">
                                Submit
                            </button>
                        </form>
                        <br>
                        <table>

                            <tbody id="reservationTable">
                            <c:forEach items="${loadAllTables}" var="e">
                                <tr>
                                    <div class="col-1-4">
                                        <div class="wrap-col">
                                            <div class="wrapper pad_bot1" id="#0001">
                                                <figure style="   width: 140px;height: 140px;" class="pad_bot1"><img
                                                        src="../../onlineRestaurant/restaurant/images/pngwave.png"
                                                        alt=""></figure>


                                                <h5 onclick="myFunction(${e.tableId})" ><span
                                                        id="selectedTableId"
                                                        style="font-size: 20px">${e.tableId} </span><a
                                                        class="button1x">+</a></h5>
                                            </div>
                                        </div>
                                    </div>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </section>
            </div>
        </article>
        <!-- / content -->
    </div>
</div>
<%--<div class="body3">--%>

<%--    <div class="main zerogrid">--%>
<%--        <!-- footer -->--%>
<%--        <!-- footer -->--%>
<%--        <footer>--%>
<%--            <div class="wrapper">--%>
<%--                <section class="col-2-3">--%>
<%--                    <div class="wrap-col">--%>
<%--                        <h3>Hot-line: <span>+94 778 7999 40</span></h3>--%>
<%--                        Designed by <a rel="nofollow" href="" target="_blank">Team Reliance</a> | <a--%>
<%--                            href="https://github.com/rivinduchamath/Hello-Hotel" title="free website templates">Project ITP</a>--%>
<%--                    </div>--%>
<%--                </section>--%>
<%--                <section class="col-1-3">--%>
<%--                    <div class="wrap-col">--%>
<%--                        <h3>Follow Us </h3>--%>
<%--                        <ul id="icons">--%>
<%--                            <li><a href="#" class="normaltip" title="Facebook"><img--%>
<%--                                    src="../../onlineRestaurant/restaurant/images/icon1.gif" alt=""></a></li>--%>
<%--                            <li><a href="#" class="normaltip" title="Linkedin"><img--%>
<%--                                    src="../../onlineRestaurant/restaurant/images/icon2.gif" alt=""></a></li>--%>
<%--                            <li><a href="#" class="normaltip" title="Twitter"><img--%>
<%--                                    src="../../onlineRestaurant/restaurant/images/icon3.gif" alt=""></a></li>--%>
<%--                            <li><a href="#" class="normaltip" title="Delicious"><img--%>
<%--                                    src="../../onlineRestaurant/restaurant/images/icon4.gif" alt=""></a></li>--%>
<%--                            <li><a href="#" class="normaltip" title="Technorati"><img--%>
<%--                                    src="../../onlineRestaurant/restaurant/images/icon5.gif" alt=""></a></li>--%>
<%--                        </ul>--%>
<%--                    </div>--%>
<%--                </section>--%>
<%--            </div>--%>
<%--            <!-- {%FOOTER_LINK} -->--%>
<%--        </footer>--%>
<%--        <!-- / footer -->--%>
<%--    </div>--%>

<%--</div>--%>

<!-- Footer Start -->
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="col-lg-7">
                <div class="row">
                    <div class="col-md-6">
                        <div class="footer-contact">
                            <h2>Our Address</h2>
                            <p><i class="fa fa-map-marker-alt"></i>123 Street, New York, USA</p>
                            <p><i class="fa fa-phone-alt"></i>+012 345 67890</p>
                            <p><i class="fa fa-envelope"></i>info@example.com</p>
                            <div class="footer-social">
                                <a href=""><i class="fab fa-twitter"></i></a>
                                <a href=""><i class="fab fa-facebook-f"></i></a>
                                <a href=""><i class="fab fa-youtube"></i></a>
                                <a href=""><i class="fab fa-instagram"></i></a>
                                <a href=""><i class="fab fa-linkedin-in"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="footer-link">
                            <h2>Quick Links</h2>
                            <a href="">Terms of use</a>
                            <a href="">Privacy policy</a>
                            <a href="">Cookies</a>
                            <a href="">Help</a>
                            <a href="">FQAs</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-5">
                <div class="footer-newsletter">
                    <h2>Newsletter</h2>
                    <p>
                        Lorem ipsum dolor sit amet elit. Quisque eu lectus a leo dictum nec non quam. Tortor eu placerat rhoncus, lorem quam iaculis felis, sed lacus neque id eros.
                    </p>
                    <div class="form">
                        <input class="form-control" placeholder="Email goes here">
                        <button class="btn custom-btn">Submit</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="copyright">
        <div class="container">
            <p>Copyright &copy; <a href="#">Your Site Name</a>, All Right Reserved.</p>
            <p>Designed By <a href="https://htmlcodex.com">HTML Codex</a></p>
        </div>
    </div>
</div>
<!-- Footer End -->
<a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
<script src="../../online/lib/easing/easing.min.js"></script>
<script src="../../online/lib/owlcarousel/owl.carousel.min.js"></script>
<script src="../../online/lib/tempusdominus/js/moment.min.js"></script>
<script src="../../online/lib/tempusdominus/js/moment-timezone.min.js"></script>
<script src="../../online/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

<!-- Contact Javascript File -->
<script src="../../online/mail/jqBootstrapValidation.min.js"></script>
<script src="../../online/mail/contact.js"></script>

<!-- Template Javascript -->
<script src="../../online/js/main.js"></script>


<script type="text/javascript"> Cufon.now(); </script>
<script src="../../vendors/jquery/dist/jquery.min.js"></script>

<%--<script>--%>
<%--    $(window).scroll(function () {--%>
<%--        if ($(document).scrollTop() > 50) {--%>
<%--            $(".button1x1").show();--%>
<%--        } else {--%>
<%--            $(".button1x1").hide();--%>
<%--        }--%>
<%--    });--%>
<%--</script>--%>
<script>
    var myTableArray = [];
    var selectedRow = null;

    function myFunction(x) {
        selectedRow = $(this)
        if (!myTableArray.includes(x)) {
            alert("Added Table " + x);
            myTableArray.push(x)
        } else {
            alert("Table " + x + " already Booked");
        }
    }

    function getValue() {

        if (vDate == "" || timeIn == "" || timeOut == "") {
            alert("Please Select Item In Table");
            return;
        }

        var str, stre = "";
        var inputArray = []

        for (var i = 0; i < myTableArray.length; i++) {
            if (!inputArray.includes(myTableArray[i])) {
                inputArray.push(myTableArray[i])
                str = myTableArray[i] + " "
                stre += str;
            }
        }

        $("#itemPay").val(stre);
    }
</script>


</body>
</html>