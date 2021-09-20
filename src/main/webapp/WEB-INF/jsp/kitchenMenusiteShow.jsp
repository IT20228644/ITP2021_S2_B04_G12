
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
        SimpleDateFormat sdf = new SimpleDateFormat ( "dd-MM-yyyy" );
        String date = sdf.format ( new Date ( ) );
    %>

    <style>
        .large-btn {
            height: 90px;
            width: 100%;
            font-family: "Playfair Display", Georgia, "Times New Roman", serif;
            font-weight: bolder;
            font-size: 27px;
        }

        select {
            -webkit-appearance:none;
            -moz-appearance:none;
            -ms-appearance:none;
            appearance:none;
            outline:0;
            box-shadow:none;
            border:0!important;
            background: #8c6f60;
            background-image: none;
            flex: 1;
            padding: 0 .5em;
            color:#fff;
            cursor:pointer;
            font-size: 1em;
            font-family: 'Open Sans', sans-serif;
        }
        select::-ms-expand {
            display: none;
        }
        .select {
            position: relative;
            display: flex;
            width: 20em;
            height: 3em;
            line-height: 3;
            background: #8c6f60;
            overflow: hidden;
            border-radius: .25em;
        }
        .select::after {
            content: '\25BC';
            position: absolute;
            top: 0;
            right: 0;
            padding: 0 1em;
            background: #4c2a18;
            cursor:pointer;
            pointer-events:none;
            transition:.25s all ease;
        }
        .select:hover::after {
            color: #23b499;
        }


    </style>

</head>

<body class="nav-md" style="cursor: pointer">
<div class="container body">
    <div class="main_container">
        <!-- Side header -->
        <jsp:include page="sideHeader.jsp" />
        <!-- /Side header -->

        <!-- Top header -->
        <jsp:include page="topHeader.jsp" />
        <!-- /Top header -->

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>Menu Site Management
                            <small>Welcome To Hotel Sapphire Marriott</small>
                        </h3>
                        <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div class="col-6 col-sm-6 col-md-6 col-lg-2 col-xl-2">
                                <a href="/kitchenMenusite">
                                    <button type="button" class="large-btn btn btn-dark"><i class="fa fa-mail-reply">
                                        Add New</i>
                                    </button>
                                </a>
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
                        <div class="select">
                            <select name="format" id="format">
                                <option selected disabled>Choose Type Of Menu</option>
                                <option value="super">Super Menu</option>
                                <option value="breakfast">Breakfast Menu</option>
                                <option value="lunch">Lunchen Menu</option>
                                <option value="dinner">Dinner Menu</option>
                                <option value="afternoon">Afternoon and High Tea Menu</option>
                                <option value="room">Room service Menu</option>
                            </select>
                        </div>
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

                <%--//////////////////////////////////////////////////////////////////////////////////////////////////--%>
                <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">




                </div>
                <%--                    /////////////////////////////////////////////////////--%>
                <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                    <div class="row" style="display: block;">
                        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                            <div class="row">
                            <div class="x_panel">
                                <div class="x_title">
                                    <h2>Menu Site List</h2>
                                    <ul class="nav navbar-right panel_toolbox">
                                        <li><a class="collapse-link"></a>
                                        </li>
                                        <li class="dropdown">
                                            <a aria-expanded="false" class="dropdown-toggle" data-toggle="dropdown"
                                               href="#"
                                               role="button"><i class="fa fa-wrench"></i></a>
                                        </li>
                                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                                        </li>
                                    </ul>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="card-box table-responsive">
                                                <table class="table table-striped table-bordered" id="datatable-buttons"
                                                       style="text-align: center">
                                                    <thead class="thead-light">
                                                    <tr>
                                                        <th>Menu Id</th>
                                                        <th>Menu Name</th>
                                                        <th>Type Of Menu</th>
                                                        <th>Type Of menu Item</th>
                                                        <th>Description</th>
                                                        <th>Unit Price</th>
                                                        <th>Image</th>
                                                        <th></th>
                                                    </tr>

                                                    </thead>
                                                    <tbody>
                                                    <c:forEach items="${MenuItem}" var="e">
                                                        <tr>
                                                            <td>${e.menusId}</td>
                                                            <td>${e.menuname}</td>
                                                            <td>${e.menutype}</td>
                                                            <td>${e.typeitem}</td>
                                                            <td>${e.descrip}</td>
                                                            <td>${e.unitPrice}</td>

                                                            <td><img src="${e.mpicture}"
                                                                     class="pic" alt="Adam" style="width: 50px;height: 50px"></td>

                                                            <td><a href="kitchenMenusiteShow/${e.menusId}">
                                                                <i class="fa fa-trash"></i>
                                                            </a></td>
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

                </div>
                <%--/////////////////////////////////////////////    /////////////////////////////////////////////--%>





            </div>
        </div>

        <!-- /page content -->



        <!-- footer content -->
        <jsp:include page="footer.jsp" />
        <!-- /footer content -->

    </div>
</div>



<!-- jQuery -->
<script src="../../vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../../vendors/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>

<!-- Datatables -->
<script src="../../vendors/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="../../vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<script src="../../vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>


<script src="../../vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="../../vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
<script src="../../vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
<script src="../../vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>


<script>

    var selectedRow = null;
    $("#datatable-buttons tbody").on('click', 'tr', function () {
        selectedRow = $(this);
        $("#menusId").val($(this).find("td:first-child").text());
        $("#menuname").val($(this).find("td:nth-child(2)").text());
        $("#menutype").val($(this).find("td:nth-child(3)").text());
        $("#typeitem").val($(this).find("td:nth-child(4)").text());
        $("#descrip").val($(this).find("td:nth-child(5)").text());
        $("#unitPrice").val($(this).find("td:nth-child(6)").text());
        selectedRow.addClass('row-selected');
    });



    let imgPreview = document.getElementById('img-preview');
    let fileUpload = document.getElementById('file-upload');
    let imgUrl = document.getElementById("imgUrl");
    let CLOUDINARY_API_URL = '	https://api.cloudinary.com/v1_1/dojpfi7m0/upload';
    let CLOUDINARY_UPLOAD_PRESET = 'hq9n0d3k';

    fileUpload.addEventListener('change', function (event) {

        let file = event.target.files[0];

        let formData = new FormData();

        formData.append('file', file);

        console.log("form-data", file);

        formData.append('upload_preset', CLOUDINARY_UPLOAD_PRESET);

        axios({
            url: CLOUDINARY_API_URL, method: 'POST', headers: {

                'Content-Type': 'application/x-www-form-urlencoded'
            }, data:

            formData
        }).then(function (res) {
            imgPreview.src = res.data.secure_url;
            imgUrl.value = res.data.secure_url;
        }).catch(function (err) {

            console.error(err);
        });


    });
</script>

</body>
</html>