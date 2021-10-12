<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/10/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="icon" type="image/png" href="../../images/icons/gdfgd.png"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js"></script>
    <!-- Bootstrap -->
    <link href="../../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="../../build/css/custom.min.css" rel="stylesheet">

    <%
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sdf.format(new Date());
    %>
    <style>
        .large-btn {
            height: 90px;
            width: 100%;
            font-family: "Playfair Display", Georgia, "Times New Roman", serif;
            font-weight: bolder;
            font-size: 27px;
        }

        #chartdiv {
            width: 100%;
            height: 500px;
        }

        #chartdiv1 {
            width: 100%;
            height: 500px;
        }

        .large-btn:hover {
            color: #0f0f0f;
        }

        #backImg {
            background-image: url("../../images/picture.jpg");
        }

        #myVideo {
            position: fixed;
            right: 0;
            bottom: 0;
            top: 110px;
            min-width: 100%;
            min-height: 100%;
        }


        #myBtn {
            width: 200px;
            font-size: 18px;
            padding: 10px;
            border: none;
            background: #000;
            color: #fff;
            cursor: pointer;
        }

        #myBtn:hover {
            background: #ddd;
            color: black;
        }
    </style>
</head>
<body class="nav-md" style="cursor: pointer">
<div class="container body">
    <div class="main_container">
        <!-- Side header -->
        <jsp:include page="sideHeader.jsp"/>
        <!-- /Side header -->

        <!-- Top header -->
        <jsp:include page="topHeader.jsp"/>
        <!-- /Top header -->

        <!-- page content -->

        <div id="" class="right_col " role="main">

            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>Restaurant Manage
                            <small>Welcome To Hotel Sapphire Marriot</small>
                        </h3>
                        <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div class="col-6 col-sm-6 col-md-6 col-lg-4 col-xl-4">
                                <a href="/restaurant">
                                    <button type="button" class=" btn btn-dark"><i class="fa fa-mail-reply"> Back to
                                        Dashboard</i>
                                    </button>
                                </a>



                                <li>
                                    <a type='submit' class="img__wrap" href="/addLocation" value="Register">
                                        <i style="font-size: 18px"  class="fa fa-gear img__img"><label class="img__description" style=" font-size: 15px"> &nbsp; Location Settings</label> </i>
                                    </a>

                                </li>

                            </div>
                        </div>
                    </div>


                    <div class="title_right">
                        <script>

                            function formatTime() {
                                now = new Date();
                                hour = now.getHours();
                                min = now.getMinutes();
                                sec = now.getSeconds();

                                if (document.clock.sivamtime[0].checked) {
                                    if (min <= 9) {
                                        min = "0" + min;
                                    }
                                    if (sec <= 9) {
                                        sec = "0" + sec;
                                    }
                                    if (hour > 12) {
                                        hour = hour - 12;
                                        add = " p.m.";
                                    } else {
                                        hour = hour;
                                        add = " a.m.";
                                    }
                                    if (hour == 12) {
                                        add = " p.m.";
                                    }
                                    if (hour == 0) {
                                        hour = "12";
                                    }

                                    document.clock.sivam.value = ((hour <= 9) ? "0" + hour : hour) + ":" + min + ":" + sec + add;
                                }

                                if (document.clock.sivamtime[1].checked) {
                                    if (min <= 9) {
                                        min = "0" + min;
                                    }
                                    if (sec <= 9) {
                                        sec = "0" + sec;
                                    }
                                    if (hour < 10) {
                                        hour = "0" + hour;
                                    }
                                    document.clock.sivam.value = hour + ':' + min + ':' + sec;
                                }

                                setTimeout("formatTime()", 1000);
                            }

                            window.onload = formatTime;

                        </script>
                        <form name="clock" style="float: right">
                            <table class="clock" width="135">
                                <tr>
                                    <td class="clock2">
                                    </td>
                                </tr>
                                <tr>
                                    <h6 style="color:#73879C; float:right;border: none;background-color: #f6f6f6">
                                        <input style="color:#73879C; float:right;border: none;background-color: #f6f6f6"
                                               class="clock2" type="text" name="sivam" size="12"><br>
                                        <p><%=date%>
                                        </p>
                                    </h6>

                                </tr>
                                <tr>
                                    <td>
                                        <label class="clock3" for="1"><input type="radio" style="display: none" id="1"
                                                                             name="sivamtime" checked></label><br>
                                        <label class="clock3" for="2"><input type="radio" style="display: none" id="2"
                                                                             name="sivamtime"></label>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>

                <%-- ////////////////////////////////////////////// BODY /////////////////////////////////////////////////////////////--%>
                <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                    <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6">
                        <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div class="row">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>Online Table Reservations
                                            <small>list</small>
                                        </h2>
                                        <ul class="nav navbar-right panel_toolbox">
                                            <li><a class="collapse-link"></a>
                                            </li>
                                            <li class="dropdown">
                                                <a aria-expanded="false" class="dropdown-toggle" data-toggle="dropdown"
                                                   href="#"
                                                   role="button"><i class="fa fa-wrench"></i></a>
                                            </li>
                                        </ul>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="card-box table-responsive">
                                                    <table class="table table-striped table-bordered"
                                                           id="datatable-buttons"
                                                           style="text-align: center">
                                                        <thead class="thead-light">
                                                        <tr>
                                                            <th>Reservation Id</th>
                                                            <th>Date</th>
                                                            <th>Start Time</th>
                                                            <th>End Time</th>
                                                            <th>State</th>


                                                        </tr>

                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${onlineTableReservation}" var="item">
                                                            <tr>
                                                                <td>${item.onlineTableReservationId}</td>
                                                                <td>${item.date}</td>
                                                                <td>${item.startTime}</td>
                                                                <td>${item.endTime}</td>
                                                                <td>confirm</td>
                                                            </tr>
                                                        </c:forEach>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6"
                         style="float: right; position: relative;display: inline-block">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>Restaurant Online Orders
                                    <small>Check And Submit</small>
                                </h2>
                                <form method="POST" action="invoiceRestaurantOrder" name="invoiceRestaurantOrder">
                                    <input style="display: none" type="text" id="itemPay" name="dataValue">
                                    <input style="display: none" type="text" id="cId" value="0" name="customerId">
                                    <ul class="nav navbar-right panel_toolbox">
                                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                        </li>

                                    </ul>
                                </form>

                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="card-box table-responsive">
                                            <table style="text-align: center"
                                                   class="table table-striped jambo_table bulk_action table-bordered">
                                                <thead class="thead-light">
                                                <tr>
                                                    <th>OrderId</th>
                                                    <th>CustomerId</th>
                                                    <th>Date</th>
                                                    <th>food item id</th>
                                                    <th>Quantity</th>
                                                    <th>State</th>
                                                </tr>
                                                </thead>

                                                <tbody id="tblOrder">
                                                <c:forEach items="${listAllOnlineOrders}" var="item">
                                                    <tr>
                                                        <td>${item.orderId}</td>
                                                        <td>${item.customer}</td>
                                                        <td>${item.date}</td>
                                                        <td>1</td>
                                                        <td>2</td>
                                                        <td>confirm</td>
                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <%--                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--%>


                <%--////////////////////////////////////////////////////////////--%>
            </div>
        </div>

        <!-- /page content -->


        <!-- footer content -->
        <jsp:include page="footer.jsp"/>
        <!-- /footer content -->

    </div>
</div>


<!-- jQuery -->
<script src="../../vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../../vendors/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>

<!-- Chart code -->
<script src="https://www.amcharts.com/lib/4/core.js"></script>
<script src="https://www.amcharts.com/lib/4/charts.js"></script>
<script src="https://www.amcharts.com/lib/4/themes/moonrisekingdom.js"></script>
<script src="https://www.amcharts.com/lib/4/themes/spiritedaway.js"></script>
<script src="https://www.amcharts.com/lib/4/themes/animated.js"></script>
</body>
</html>
