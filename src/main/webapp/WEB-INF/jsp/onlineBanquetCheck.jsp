<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 11/10/2021
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>Luxury Hotel in Galle | Hotel Shappior Marriott</title>

    <!-- Google font -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:400,700" rel="stylesheet">

    <!-- Bootstrap -->
    <link type="text/css" rel="stylesheet" href="../../css/onlineReservation/bootstrap.min.css" />

    <!-- Custom stlylesheet -->
    <link type="text/css" rel="stylesheet" href="../../css/onlineReservation/style.css" />

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body background="../../images/booking3.jpg">
<div id="booking" class="section">
    <div class="section-center">
        <div class="container">
            <div class="row">
                <div class="booking-form">
                    <div class="modal-title">
                        <h3 style="color: whitesmoke"><i>Make your Booking</i></h3>
                    </div>
                    <form method="POST"  action="onlineBanquetCheck" name="onlineBanquetCheck" >
                        <div class="row">
                            <div class="col-md-12">
                        <div class="form-group">

                            <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12"> <br>
                                <label style="color:whitesmoke">Date</label>
                                <input type="date" class="form-control"
                                       required="required" name="date" id="date" placeholder="Date"/>
<%--                            <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-6"> <br>--%>
                                <button type="submit" class="btn" style=" width:100px;height:40px; top:26px; position: relative;
                             border: 3px solid #6d6d6b;  background-color: #050505;
                                    color: #c6d4d3;font-weight: bolder" value="">Check
                                </button>
<%--                            </div>--%>
                        </div>
                        </div>

                        <div class="form-group">

                            <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12"> <br>
                                <h3 style="color:whitesmoke">${checkDate}  ${answer1}</h3>
                                <br>

                                <h3 style="color: whitesmoke">Hall No 1: ${answer2}</h3>
                                <h3 style="color: whitesmoke">Hall No 2: ${answer3}</h3>
                            </div>

                        </div>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../../js/jquery.min.js"></script>

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
</body>
</html>