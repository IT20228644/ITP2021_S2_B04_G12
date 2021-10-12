<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 4/10/2021
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="icon" type="image/png" href="../../images/icons/gdfgd.png"/>
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
    <%
        if(request.getAttribute("errorMsg1") != null){
    %>
    <script>alert("Date is Unavailable... Please check availability.")</script>
    <%
        }
    %>

    <%
        if(request.getAttribute("errorMsg2") != null){
    %>
    <script>alert("Hall 01 is Unavailable... Please check availability.")</script>
    <%
        }
    %>

    <%
        if(request.getAttribute("errorMsg3") != null){
    %>
    <script>alert("Hall 02 is Unavailable... Please check availability.")</script>
    <%
        }
    %>

    <%
        if(request.getAttribute("successfulMsg") != null){
    %>
    <script>alert("Added Successfully")</script>
    <%
        }
    %>

    <!-- Datatables -->
    <link href="../../vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">

<%--    <style>--%>
<%--        .large-btn {--%>
<%--            height: 40px;--%>
<%--            width: 100%;--%>
<%--            font-family: "Playfair Display", Georgia, "Times New Roman", serif;--%>
<%--            font-weight: bolder;--%>

<%--        }--%>

<%--        .large-btn:hover {--%>
<%--            color: #0f0f0f;--%>
<%--        }--%>

<%--        #chartdiv {--%>
<%--            position: relative;--%>
<%--            top: 40px;--%>
<%--            width: 100%;--%>
<%--            height: 500px;--%>
<%--        }--%>

<%--        #chartdiv1 {--%>
<%--            position: relative;--%>
<%--            top: 40px;--%>
<%--            width: 100%;--%>
<%--            height: 500px;--%>
<%--        }--%>
<%--    </style>--%>
    <style>
        .large-btn {
            height: 90px;
            width: 100%;
            font-family: "Playfair Display", Georgia, "Times New Roman", serif;
            font-weight: bolder;
            font-size: 27px;
        }

        .btnq2:hover {
            transform: scale(1.05, 1.1);
            transition: 0.8s ease;
            -webkit-transition: 0.8s ease;
            -moz-transition: 0.8s ease;
        }

        .btnq3:hover {
            transform: scale(1.3, 1.3);
            transition: 0.8s ease;
            -webkit-transition: 0.8s ease;
            -moz-transition: 0.8s ease;
        }
        /*#chartdiv {*/
        /*    width: 100%;*/
        /*    height: 500px;*/
        /*}*/

        /*#chartdiv1 {*/
        /*    width: 100%;*/
        /*    height: 500px;*/
        /*}*/

        .large-btn:hover {
            color: #cebbbb;
        }
        /*//////////////////////////////////////////////////////////////*/

        .containerx {
            display:flex;
            background: url("/images/newHotel3.jpg");
            padding-top: 20px;
            padding-bottom: 50px;


        }


        .btnq {
            text-decoration: none;
            border: 5px solid rgb(190, 175, 166);
            position: relative;
            overflow: hidden;
            height: 90px;
            width: 100%;
            font-size: 1.5rem;
            text-align: center;
            border-radius: 5px 5px;
            /*background-color: #a98e77;*/
        }

        .btnq:before {
            content: "";
            position: absolute;
            top: 0;
            left: -00%;
            text-align: center;
            width: 100%;
            height: 100%;
            background: linear-gradient(
                    120deg,
                    transparent,
                    rgba(64, 45, 34, 0.4),
                    transparent
            );
            transition: all .8s;
        }

        .btnq:hover:before {
            left: 100%;
        }

        .text1 {
            font-family: -apple-system;
            padding-left: 150px;


        }



    </style>

</head>

<body class="nav-md" style="cursor: pointer">
<div class="container body center-margin">
    <div class="main_container containerx">


<%--        <!-- Side header -->--%>
<%--        <jsp:include page="sideHeader.jsp"/>--%>
<%--        <!-- /Side header -->--%>

<%--        <!-- Top header -->--%>
<%--        <jsp:include page="topHeader.jsp"/>--%>
<%--        <!-- /Top header -->--%>


        <!-- page content -->
        <div  class="right_col col-8" role="main">
            <div class="page-title">
                <div class="text1">
                    <h3>Get in Touch with Our Wedding Specialist</h3>
                    <div class="col-14 col-sm-14 col-md-14 col-lg-14 col-xl-14">
                        <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
<%--                            <a href="/banquet">--%>
<%--                                <button style=" border: 3px solid #4c2a18;  background-color: #8c6f60;--%>
<%--                                    color: #c6d4d3;font-weight: bolder" type="button"  class="btnq2 btn"><i class="fa fa-reply">--%>
<%--                                    Back</i>--%>
<%--                                </button>--%>
<%--                            </a>--%>

                        </div>

                    </div>
                </div>


            <%--Input Feilds--%>
            <div class="col-12 col-sm-12 col-md-14 col-lg-14 col-xl-14">
                <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">

                    <form method="POST" action="saveOnlineBanquet" name="saveOnlineBanquet">
                        <br><br>
                        <h6><i><u>Contact Detail</u></i></h6>

                        <div class="form-group">

                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-4">
                                <input type="hidden" value="${topOnlineNo}" class="form-control"
                                                      required="required" name="onlineNo"
                                                      id="onlineNo" placeholder="Online No" readonly/></div>
<%--<new add></new>--%>

                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-4">
                            <br>
<%--                                <label for="onlineNo">Customer Id</label>--%>
                                <input type="hidden" value="${topBanquetCustomerId}" class="form-control"
                                       required="required" name="customerId"
                                       id="customerId" placeholder="Customer Id" readonly/></div>

                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-4">
                                <input type="hidden" value="${topBanquetId}" class="form-control"
                                       required="required" name="orderId"
                                       id="orderId" placeholder="Order Id" readonly/></div>

                        </div>


                        <div class="form-group">


                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>
                                <label for="onlineNo">Customer Name</label>
                                <input type="text" class="form-control"
                                       required="required" name="name"
                                       id="name" placeholder="Customer Name"/></div>

                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>
                                <label for="onlineNo">Address</label>
                                <input type="text" class="form-control"
                                       required="required" name="address"
                                       id="address" placeholder="Address"/></div>
                        </div>


                        <div class="form-group">
                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>
                                <label for="onlineNo">Email</label>
                                <input type="email" class="form-control"
                                       required="required" name="email"
                                       id="email" placeholder="Email"/><br><br></div>

                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>
                                <label for="onlineNo">Mobile No</label>
                                <input type="tel" class="form-control"
                                       pattern="[0-9]{10}" required name="contactNo"
                                       id="contactNo" placeholder="Mobile No"/> <br><br><br></div>

                        </div>

                        <div class="title">

                            <h6><u><i>Order Detail</i></u></h6></div>

                        <div class="form-group">
                            <br>
                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6">
                            <label for="onlineNo">Today Date</label>
                            <input type="date" class="form-control"
                                   required="required" name="orderDate"
                                   id="orderDate" placeholder="Order Date"/></div>
<%--                        </div>--%>

                        <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6">
                            <label for="onlineNo">Booking Date</label>
                            <input type="date" class="form-control"
                                   required="required" name="date"
                                   id="date" placeholder="Date"/></div>
                    </div>




                        <div class="form-group">

<%--                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>--%>
<%--                                <label for="onlineNo">Booking Date</label>--%>
<%--                                <input type="date" class="form-control"--%>
<%--                                       required="required" name="date"--%>
<%--                                       id="date" placeholder="Date"/></div>--%>
                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>
                                <label for="onlineNo">Hall No</label>
                                <select class="form-control"required="required" name="hallId"
                                        id="hallId">
                                    <option value="No 1">Choose Hall No</option>
                                    <option value="No 1">No 1</option>
                                    <option value="No 2">No 2</option>
                                </select>

                            </div>
                            <br>
                        </div>
                        <div class="form-group">
                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>
                                <label for="onlineNo">Num Of Plates</label>
                                <input type="number" size="6" min="10" max="1000" class="form-control"
                                       required="required" name="noOfPlates"
                                       id="noOfPlates" placeholder="Num Of Plates"/></div>

                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>
                                <label for="onlineNo">Package</label>
                                <select class="form-control"required="required" name="menuId"
                                        id="menuId">
                                    <option value="1">Choose Package</option>
                                    <option value="1">Bronze</option>
                                    <option value="2">Silver</option>
                                    <option value="3">Gold</option>
                                    <option value="4">Platinum</option>
                                </select>

                            </div>

                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"> <br>
                                <input type="hidden" required="required" name="banquetBillId"
                                       id="billId" value="${topBanquetBillId}">
                                <label for="onlineNo">Advance Payment</label>
                                <input type="number" class="form-control"
                                       required="required" name="advanceFee"
                                       id="advancePayment" placeholder="Advance Payment"/></div>

                        </div>

<%--                        <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12"> <br>--%>
<%--                            <label>Aditional Request</label>--%>
<%--                           <textarea id="aditional" name="aditionanal"--%>
<%--                                     placeholder="Input your additional requirement.."></textarea>--%>
<%--                </div>--%>
                        <br>
                        <label>
                            <br><br>
                            <input type="checkbox" id ="check" name="check" onclick="terms_changed(this)"> By ticking this box,
                            I agree to receive Meetings & Events marketing materials,
                            </label>


                     <div style="padding-left: 180px">
                         <br><br>
                        <button type='submit' id="btnS" class="btn btn-default" style="background-color: rgba(189,175,122,0.89); width: 200px; top: 20px; position: relative" value="Register" disabled>
                            Submit
                        </button>
                        <button type='reset' class="btn btn-outline-success" style="width:150px; top: 20px; position: relative" value="">Reset</button>
                     </div>

                    </form>
                </div>

            </div>
        </div>

<%--        <!-- /page content -->--%>

<%--        <!-- footer content -->--%>
<%--        <jsp:include page="footer.jsp"/>--%>
<%--        <!-- /footer content -->--%>
        </div>
    </div>
</div>


<!-- jQuery -->
<script src="../../vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../../vendors/bootstrap/dist/js/bootstrap.bundle.min.js"></script>

<!-- Datatables -->
<script src="../../vendors/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="../../vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<%--Show Print Buttons--%>
<script src="../../vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
<script src="../../vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
<script src="../../vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
<script src="../../vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="../../vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
<script src="../../vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
<script src="../../vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
<%--Responsive Table--%>
<script src="../../vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
<script src="../../vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
<%--<script src="../../vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>--%>
<%--Print--%>
<script src="../../vendors/jszip/dist/jszip.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>
<%--Pie Chart 1--%>

<%--<script>--%>

<%--    var selectedRow = null;--%>
<%--    $("#datatable-buttons tbody").on('click', 'tr', function () {--%>
<%--        selectedRow = $(this);--%>
<%--        $("#customerId").val($(this).find("td:nth-child(1)").text());--%>
<%--        $("#name").val($(this).find("td:nth-child(2)").text());--%>
<%--        $("#address").val($(this).find("td:nth-child(3)").text());--%>
<%--        $("#contactNumber").val($(this).find("td:nth-child(4)").text());--%>
<%--        $("#email").val($(this).find("td:nth-child(5)").text());--%>
<%--        selectedRow.addClass('row-selected');--%>
<%--    });--%>
<%--</script>--%>
<script>
    var dateController = {
        currentDate : null
    }

    $(document).on( "change", "#date",function( event, ui ) {
        var now = new Date();
        var selectedDate = new Date($(this).val());

        if(selectedDate <= now) {
            $(this).val("");
            alert("Invalid date... Please enter future date... Can't enter today and old dates");

        } else {
            dateController.currentDate = $(this).val();
        }
    });
</script>

<script>
    var dateController = {
        currentDate : null
    }

    $(document).on( "change", "#orderDate",function( event, ui ) {
        var now = new Date();
        var selectedDate = new Date($(this).val());

        if(selectedDate > now) {
            $(this).val("");
            alert("Invalid date... Please enter today date");

        } else {
            dateController.currentDate = $(this).val();
        }
    });
</script>

<script>
    function terms_changed(check){
        //If the checkbox has been checked
        if(check.checked){
            //Set the disabled property to FALSE and enable the button.
            document.getElementById("btnS").disabled = false;
        } else{
            //Otherwise, disable the submit button.
            alert("Please checked the button.....")
            document.getElementById("btnS").disabled = true;
        }
    }
</script>





</body>
</html>
