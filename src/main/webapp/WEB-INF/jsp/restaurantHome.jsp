<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 9/8/2021
  Time: 12:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Restaurant</title>

        <meta charset="utf-8">
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


<body>
<!-- Nav Bar Start -->
<div class="navbar navbar-expand-lg bg-light navbar-light">
    <div class="container-fluid">
        <a href="index.html" class="navbar-brand">Sapphire <span>Marriote Restaurant</span></a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
            <div class="navbar-nav ml-auto">

                <a href="restaurantHome" class="nav-item nav-link active">Welcome</a>
<%--                <a href="about.html" class="nav-item nav-link">About</a>--%>
                <a href="features" class="nav-item nav-link">Feature</a>

<%--                <a href="restaurantHome" class="nav-item nav-link active">Home</a>--%>
<%--                <a href="about.html" class="nav-item nav-link">About</a>--%>
                <a href="barOnline" class="nav-item nav-link">Bar</a>

                <a href="chef" class="nav-item nav-link">Chef</a>
                <a href="onlineOrder" class="nav-item nav-link">Menu</a>
                <a href="onlineTable" class="nav-item nav-link">Booking</a>
<%--                <div class="nav-item dropdown">--%>
<%--                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Pages</a>--%>
<%--                    <div class="dropdown-menu">--%>
<%--                        <a href="blog.html" class="dropdown-item">Blog Grid</a>--%>
<%--                        <a href="single.html" class="dropdown-item">Blog Detail</a>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <a href="orderForm" class="nav-item nav-link">Contact</a>--%>
<%--                <a href="restaurantOnlineCustomer" class="nav-item nav-link" style="position: absolute; top: 0; right: 95px;" >Login ${loggerId.name}</a>--%>

                <button style="background: #cebbae;border-radius: 25px;" >
                <a href="restaurantOnlineCustomer" class="nav-item nav-link" style="color:white;font-weight:900;" >Login ${loggerId.name}</a>
                </button>
                <%--

                                <%--

                 <ul id="top_nav">--%>
<%--                    <li><a href="#"><img src="../../onlineRestaurant/restaurant/images/icon_2.gif" alt=""></a></li>--%>
<%--                    <li class="end"><a href="restaurantOnlineCustomer"><i class="fa fa-user" style="color: rgba(255,255,255,0.91); font-size:20px;">--%>
<%--                        LogIn ${loggerId.name}--%>

<%--                    </i></a></li>--%>

<%--                </ul>--%>
            </div>
        </div>
    </div>
</div>
<!-- Nav Bar End -->


<!-- Carousel Start -->
<div class="carousel">
    <div class="container-fluid">
        <div class="owl-carousel">
            <div class="carousel-item">
                <div class="carousel-img">
                    <img src="../../online/img/carousel-1.jpg" alt="Image">
                </div>
                <div class="carousel-text">
                    <h1>Best <span>Quality</span> Ingredients</h1>
                    <p>
                        Lorem ipsum dolor sit amet elit. Phasellus ut mollis mauris. Vivamus egestas eleifend dui ac consequat at lectus in malesuada
                    </p>
                    <div class="carousel-btn">
                        <a class="btn custom-btn" href="">View Menu</a>
                        <a class="btn custom-btn" href="">Book Table</a>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="carousel-img">
                    <img src="../../online/img/carousel-2.jpg" alt="Image">
                </div>
                <div class="carousel-text">
                    <h1>World’s <span>Best</span> Chef</h1>
                    <p>
                        Morbi sagittis turpis id suscipit feugiat. Suspendisse eu augue urna. Morbi sagittis, orci sodales varius fermentum, tortor
                    </p>
                    <div class="carousel-btn">
                        <a class="btn custom-btn" href="onlineOrder">View Menu</a>
                        <a class="btn custom-btn" href="onlineTable">Book Table</a>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="carousel-img">
                    <img src="../../online/img/carousel-3.jpg" alt="Image">
                </div>
                <div class="carousel-text">
                    <h1>Fastest Order <span>Delivery</span></h1>
                    <p>
                        Sed ultrices, est eget feugiat accumsan, dui nibh egestas tortor, ut rhoncus nibh ligula euismod quam. Proin pellentesque odio
                    </p>
                    <div class="carousel-btn">
                        <a class="btn custom-btn" href="">View Menu</a>
                        <a class="btn custom-btn" href="">Book Table</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Carousel End -->


<!-- About Start -->
<div class="about">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <div class="about-img">
                    <img src="../../online/img/about.jpg" alt="Image">
                    <button type="button" class="btn-play" data-toggle="modal" data-src="https://www.youtube.com/embed/DWRcNpR6Kdc" data-target="#videoModal">
                        <span></span>
                    </button>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="about-content">
                    <div class="section-header">

                        <h2>Cooking Since 1990</h2>
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
        </div>
    </div>
</div>
<!-- About End -->


<!-- Video Modal Start-->
<div class="modal fade" id="videoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <!-- 16:9 aspect ratio -->
                <div class="embed-responsive embed-responsive-16by9">
                    <iframe class="embed-responsive-item" src="" id="video"  allowscriptaccess="always" allow="autoplay"></iframe>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Video Modal End -->


<!-- Feature Start -->
<div class="feature">
    <div class="container">
        <div class="row">
            <div class="col-lg-5">
                <div class="section-header">
                    <p>Why Choose Us</p>
                    <h2>Our Key Features</h2>
                </div>
                <div class="feature-text">
                    <div class="feature-img">
                        <div class="row">
                            <div class="col-6">
                                <img src="../../online/img/feature-1.jpg" alt="Image">
                            </div>
                            <div class="col-6">
                                <img src="../../online/img/feature-2.jpg" alt="Image">
                            </div>
                            <div class="col-6">
                                <img src="../../online/img/feature-3.jpg" alt="Image">
                            </div>
                            <div class="col-6">
                                <img src="../../online/img/feature-4.jpg" alt="Image">
                            </div>
                        </div>
                    </div>
                    <p>
                        Lorem ipsum dolor sit amet consec adipis elit. Phasel nec preti mi. Curabit facilis ornare velit non vulputa. Aliquam metus tortor, auctor id gravida condime, viverra quis sem. Curabit non nisl nec nisi sceleri maximus
                    </p>
                    <a class="btn custom-btn" href="">Book A Table</a>
                </div>
            </div>
            <div class="col-lg-7">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="feature-item">
                            <i class="flaticon-cooking"></i>
                            <h3>World’s best Chef</h3>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                            </p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="feature-item">
                            <i class="flaticon-vegetable"></i>
                            <h3>Natural ingredients</h3>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                            </p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="feature-item">
                            <i class="flaticon-medal"></i>
                            <h3>Best quality products</h3>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                            </p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="feature-item">
                            <i class="flaticon-meat"></i>
                            <h3>Fresh vegetables & Meet</h3>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                            </p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="feature-item">
                            <i class="flaticon-courier"></i>
                            <h3>Fastest door delivery</h3>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                            </p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="feature-item">
                            <i class="flaticon-fruits-and-vegetables"></i>
                            <h3>Ground beef & Low fat</h3>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Feature End -->




<!-- Team Start -->
<div class="team">
    <div class="container">
        <div class="section-header text-center">
            <p>Our Team</p>
            <h2>Our Master Chef</h2>
        </div>
        <div class="row">
            <div class="col-lg-3 col-md-6">
                <div class="team-item">
                    <div class="team-img">
                        <img src="../../online/img/team-1.jpg" alt="Image">
                        <div class="team-social">
                            <a href=""><i class="fab fa-twitter"></i></a>
                            <a href=""><i class="fab fa-facebook-f"></i></a>
                            <a href=""><i class="fab fa-linkedin-in"></i></a>
                            <a href=""><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                    <div class="team-text">
                        <h2>Adam Phillips</h2>
                        <p>CEO, Co Founder</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="team-item">
                    <div class="team-img">
                        <img src="../../online/img/team-2.jpg" alt="Image">
                        <div class="team-social">
                            <a href=""><i class="fab fa-twitter"></i></a>
                            <a href=""><i class="fab fa-facebook-f"></i></a>
                            <a href=""><i class="fab fa-linkedin-in"></i></a>
                            <a href=""><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                    <div class="team-text">
                        <h2>Dylan Adams</h2>
                        <p>Master Chef</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="team-item">
                    <div class="team-img">
                        <img src="../../online/img/team-3.jpg" alt="Image">
                        <div class="team-social">
                            <a href=""><i class="fab fa-twitter"></i></a>
                            <a href=""><i class="fab fa-facebook-f"></i></a>
                            <a href=""><i class="fab fa-linkedin-in"></i></a>
                            <a href=""><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                    <div class="team-text">
                        <h2>Jhon Doe</h2>
                        <p>Master Chef</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="team-item">
                    <div class="team-img">
                        <img src="../../online/img/team-4.jpg" alt="Image">
                        <div class="team-social">
                            <a href=""><i class="fab fa-twitter"></i></a>
                            <a href=""><i class="fab fa-facebook-f"></i></a>
                            <a href=""><i class="fab fa-linkedin-in"></i></a>
                            <a href=""><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                    <div class="team-text">
                        <h2>Josh Dunn</h2>
                        <p>Master Chef</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Team End -->








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

