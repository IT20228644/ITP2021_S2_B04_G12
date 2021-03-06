<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/9/2021
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hotel Sapphire Marriot</title>
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
<body>
<!-- Nav Bar Start -->
<div class="navbar navbar-expand-lg bg-light navbar-light">
    <div class="container-fluid">
<%--        <a href="index.html" class="navbar-brand">Burger <span>King</span></a>--%>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
            <div class="navbar-nav ml-auto">
                <a href="restaurantHome" class="nav-item nav-link">Welcome</a>
<%--                <a href="about.html" class="nav-item nav-link">About</a>--%>
                <a href="feature.html" class="nav-item nav-link">Feature</a>
                <a href="team.html" class="nav-item nav-link">Chef</a>
                <a href="onlineOrder" class="nav-item nav-link">Menu</a>
                <a href="onlineTable" class="nav-item nav-link active">Booking</a>
<%--                <div class="nav-item dropdown">--%>
<%--                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Pages</a>--%>
<%--                    <div class="dropdown-menu">--%>
<%--                        <a href="blog.html" class="dropdown-item">Blog Grid</a>--%>
<%--                        <a href="single.html" class="dropdown-item">Blog Detail</a>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <a href="contact.html" class="nav-item nav-link">Contact</a>--%>
                <button style="background: #cebbae;border-radius: 25px;">
                    <a href="restaurantOnlineCustomer" class="nav-item nav-link" style="color:white;font-weight:900;">Login</a>
                </button>

                <img src="../../online/img/proo.png" alt="" style="width: 20px;height: 20px;margin-left:10px;">
                <p style="color: white;font-weight: bold; margin-right: 30px;">${loggerId.name}</p>

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


<!-- Booking Start -->
<div class="booking">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-7">
                <div class="booking-content">
                    <div class="section-header">
                        <p>Book A Table</p>
                        <h2>Book Your Table For Private Dinners & Happy Hours</h2>
                    </div>
                    <div class="about-text">
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulputate. Aliquam metus tortor, auctor id gravida condimentum, viverra quis sem.
                        </p>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulputate. Aliquam metus tortor, auctor id gravida condimentum, viverra quis sem. Curabitur non nisl nec nisi scelerisque maximus. Aenean consectetur convallis porttitor. Aliquam interdum at lacus non blandit.
                        </p>
                    </div>
                </div>
            </div>
            <div class="col-lg-5">
                <div class="booking-form">


    <form name="form1" id="ff" action="checkTimeForTable">
        <div class="control-group">
            <div class="input-group date" id="date" data-target-input="nearest">
            <input type="date" placeholder="Booking Date" name="vDate" id="vDate" required class="form-control datetimepicker-input">
                </div>
            </div>
        <div class="control-group">
            <div class="input-group time" id="time" data-target-input="nearest">
            <input type="time"  placeholder="In Time" name="vStatT" id="email" required class="form-control datetimepicker-input" >
            </div>
        </div>

        <div class="control-group">
            <div class="input-group time" id="timee" data-target-input="nearest">
                <input type="time"  placeholder="In Time" name="vEndT" id="message" required class="form-control datetimepicker-input" >
            </div>
        </div>

        <input  type="submit" name="Submit" value="Check" class="btn custom-btn">

    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Booking End -->


<!-- Menu Start -->
<div class="menu">
    <div class="container">
        <div class="section-header text-center">
            <p>Food Menu</p>
            <h2>Delicious Food Menu</h2>
        </div>
        <div class="menu-tab">
            <ul class="nav nav-pills justify-content-center">
                <li class="nav-item">
                    <a class="nav-link active" data-toggle="pill" href="#burgers">Burgers</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="pill" href="#snacks">Snacks</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="pill" href="#beverages">Beverages</a>
                </li>
            </ul>
            <div class="tab-content">
                <div id="burgers" class="container tab-pane active">
                    <div class="row">
                        <div class="col-lg-7 col-md-12">
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-burger.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Mini cheese Burger</span> <strong>$9.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-burger.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Double size burger</span> <strong>$11.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-burger.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Bacon, EGG and Cheese</span> <strong>$13.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-burger.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Pulled porx Burger</span> <strong>$18.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-burger.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Fried chicken Burger</span> <strong>$22.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-5 d-none d-lg-block">
                            <img src="../../online/img/menu-burger-img.jpg" alt="Image">
                        </div>
                    </div>
                </div>
                <div id="snacks" class="container tab-pane fade">
                    <div class="row">
                        <div class="col-lg-7 col-md-12">
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-snack.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Corn Tikki - Spicy fried Aloo</span> <strong>$15.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-snack.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Bread besan Toast</span> <strong>$35.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-snack.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Healthy soya nugget snacks</span> <strong>$20.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-snack.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Tandoori Soya Chunks</span> <strong>$30.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-5 d-none d-lg-block">
                            <img src="../../online/img/menu-snack-img.jpg" alt="Image">
                        </div>
                    </div>
                </div>
                <div id="beverages" class="container tab-pane fade">
                    <div class="row">
                        <div class="col-lg-7 col-md-12">
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-beverage.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Single Cup Brew</span> <strong>$7.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-beverage.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Caffe Americano</span> <strong>$9.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-beverage.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Caramel Macchiato</span> <strong>$15.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-beverage.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Standard black coffee</span> <strong>$8.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                            <div class="menu-item">
                                <div class="menu-img">
                                    <img src="../../online/img/menu-beverage.jpg" alt="Image">
                                </div>
                                <div class="menu-text">
                                    <h3><span>Standard black coffee</span> <strong>$12.00</strong></h3>
                                    <p>Lorem ipsum dolor sit amet elit. Phasel nec preti facil</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-5 d-none d-lg-block">
                            <img src="../../online/img/menu-beverage-img.jpg" alt="Image">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Menu End -->


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

</body>
</html>
