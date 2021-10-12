<%--
  Created by IntelliJ IDEA.
  User: THINKPAD
  Date: 10/12/2021
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>Sapphire Marriott</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <%--    <link rel="stylesheet" href="../../css/barOnline/bootstrap.min.css">--%>
    <%--    <!-- style css -->--%>
    <%--    <link rel="stylesheet" href="../../css/barOnline/style.css">--%>
    <%--    <!-- Responsive-->--%>
    <%--    <link rel="stylesheet" href="../../css/barOnline/responsive.css">--%>
    <%--    <!-- fevicon -->--%>
    <link rel="icon" href="../../images/barOnline/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <%--    <link rel="stylesheet" href="../../css/barOnline/jquery.mCustomScrollbar.min.css">--%>
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">

    <link href="../../css/barOnline/animate.min.css" rel="stylesheet">
    <link href="../../css/barOnline/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/barOnline/jquery.mCustomScrollbar.min.css" rel="stylesheet">
    <link href="../../css/barOnline/jquery-ui.css" rel="stylesheet">
    <link href="../../css/barOnline/meanmenu.css" rel="stylesheet">
    <link href="../../css/barOnline/nice-select.css" rel="stylesheet">
    <link href="../../css/barOnline/normalize.css" rel="stylesheet">
    <link href="../../css/barOnline/jowl.carousel.min.css" rel="stylesheet">
    <link href="../../css/barOnline/responsive.css" rel="stylesheet">
    <link href="../../css/barOnline/slick.css" rel="stylesheet">
    <link href="../../css/barOnline/style.css" rel="stylesheet">


    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<!-- body -->
<body class="main-layout">

<!-- header -->
<header>
    <!-- header inner -->
    <div  class="head_top">
        <div class="header">
            <div class="container-fluid">

                    <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">

                        <div class="full">
                            <div class="center-desk">
                                <div class="logo">
                                    <a href="home"><img src="../../images/logonewe.png" alt="home" /></a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">

                        <nav class="navigation navbar navbar-expand-md navbar-dark ">

                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>

                            <div class="collapse navbar-collapse" id="navbarsExample04">
                                <ul class="navbar-nav mr-auto">
                                    </br>
                                    <h1 align="center" style="color: #942a25; font-weight: bold" size="40px" > Bar Online Order</h1>

                                    <li class="nav-item">
                                        <br>
                                        <a class="nav-link" href="#contact">About</a>
                                    </li>
                                    <li class="nav-item">
                                        <br>
                                        <a class="nav-link" href="#">Contact Us</a>
                                    </li>
                                </ul>
                            </div>
                        </nav>
                    </div>
            </div>
        </div>
    </div>
</header>


<!-- talk -->
<div id="talk" class="talk">
    <div class="container">
        <div class="row ">

                <div class="wines">
                    <h3>I am,</h3>
                    <div class="main_form2">
                        <a href="#room"> <button class="send_btn2" >An Inhouse Customer</button> </a>
                    </div>
                    <div class="main_form2">
                        <a href="#restaurant"> <button class="send_btn2"  >From Restaurant</button></a>
                    </div>

                    <br>
                    <p align="center">It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem  ere, content here', making itIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem  ere, content here', making it</p>

                    <br><br><br id="room">
                    <h3 >Order Liquor<br>
                                To your room</h3>
                </div>
            </div>
            <div class="col-md-6 ">
                <form class="main_form ">
                    <div class="row">
                        <br>
                        <div class="col-md-12 ">
                            <input class="form_contril" placeholder="Name " type="text" name="Name ">
                        </div>
                        <div class="col-md-12">
                            <input class="form_contril" placeholder="Phone Number" type="text" name=" Phone Number">
                        </div>
                        <div class="col-md-12">
                            <input class="form_contril" placeholder="Room Number" type="text" name="Room Number">
                        </div>
                        <div class="col-md-12">
                            <input class="form_contril" placeholder="Item ID" type="text" name="Item ID">
                        </div>
                        <div class="col-md-12">
                            <input class="form_contril" placeholder="Quantity" type="text" name="Quantity">
                        </div>
                        <div class="col-md-12">
                            <textarea class="textarea" placeholder="Message" type="text" name="Message"></textarea>
                        </div>
                        <br>
                        <div class="col-sm-12">
                            <button class="send_btn">Confirm Order</button>
                            <br><br><br>
                        </div>
                    </div>
                </form>
            </div>
        <br   id="restaurant"><br>

        <div class="wines">
           <h3>Order Liquor<br>
                    As a customer from restaurant</h3>

        </div>

        <div class="col-md-6 ">

            <form class="main_form ">
                <div class="col-md-12 ">
                    <input class="form_contril" placeholder="Name " type="text" name="Name ">
                </div>
                <div class="col-md-12">
                    <input class="form_contril" placeholder="Phone Number" type="text" name=" Phone Number">
                </div>
                <div class="col-md-12">
                    <input class="form_contril" placeholder="Table Number" type="text" name="Table Number">
                </div>
                <div class="col-md-12">
                    <input class="form_contril" placeholder="Item ID" type="text" name="Item ID">
                </div>
                <div class="col-md-12">
                    <input class="form_contril" placeholder="Quantity" type="text" name="Quantity">
                </div>
                <div class="col-md-12">
                    <textarea class="textarea" placeholder="Message" type="text" name="Message"></textarea>
                </div>
                <br>
                <div class="col-sm-12">
                    <button class="send_btn">Confirm Order</button>
                    <br><br><br>
                </div>
            </form>
        </div>
        </div>
    </div>
</div>
<!-- end talk -->
<!--  footer -->
<footer>
    <div class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p>Copyright 2021 All Right Reserved By <a href="https://github.com/IT20228644/ITP2021_S2_B04_G12/"> ITP2021_S2_B04_G12</a></p>
                </div>
            </div>
        </div>
    </div>
    </div>
</footer>
<!-- end footer -->
<!-- Javascript files-->
<script src="../../js/barOnline/jquery.min.js"></script>
<script src="../../js/barOnline/popper.min.js"></script>
<script src="../../js/barOnline/bootstrap.bundle.min.js"></script>
<script src="../../js/barOnline/jquery-3.0.0.min.js"></script>
<script src="../../js/barOnline/plugin.js"></script>
<!-- sidebar -->
<script src="../../js/barOnline/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="../../js/barOnline/custom.js"></script>
<script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
</body>
</html>


