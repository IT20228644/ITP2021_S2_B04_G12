<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="css/bootstrap.css" rel="stylesheet">
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
        <div class="right_col" role="main">
            <div class="page-title">
                <div class="title_left">
                    <h3>Edit Menu</h3>
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                        <div class="col-6 col-sm-6 col-md-6 col-lg-2 col-xl-2">
                            <a href="/kitchen">
                                <button type="button" class="large-btn btn btn-dark"><i class="fa fa-mail-reply">
                                    Back</i>
                                </button>
                            </a>
                        </div>
                        <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
                            <a href="/manageFoodPacks">
                                <button type="button" class="large-btn btn btn-dark">Show Menu Details</button>
                            </a>
                        </div>
                    </div>
                </div>

                <%--Time--%>
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
                                    <p>
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
            <%--/Time--%>

            <%--Input Feilds--%>

            <%--/Input Feilds--%>
            <!--Content//////////////////////////////////////////////////////////////////-->
            <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">

                <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6">
                    <!--Add food items form-------------------------------------------------------------------->

                    <div class="row">
                        <div class="col-md-12 col-sm-12 ">
                            <div class="x_panel">
                                <div class="x_title">
                                    <h2>Add/Update Menu in to the Site...</h2>
                                    <ul class="nav navbar-right panel_toolbox">
                                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                        </li>
                                        <li class="dropdown">
                                            <a aria-expanded="false" aria-haspopup="true" class="dropdown-toggle"
                                               data-toggle="dropdown"
                                               href="#" role="button"><i
                                                    class="fa fa-wrench"></i></a>
                                        </li>
                                    </ul>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <br/>

                                    <form:form action="kitchenMenusiteShow" method="post" modelAttribute="menusiteDTO">
                                        <input class="form-control" name="menusId" value="0" id="menusId" type="hidden" >


                                        <div class=" form-group">
                                            <label class=" label-align"
                                                   for="menuname">Menu Name:
                                                <span class="required">*  &nbsp;</span>
                                            </label>
                                            <div class=" ">
                                                <input class="form-control" name="menuname" id="menuname"
                                                       required="required" type="text">
                                            </div>
                                        </div>
                                        <div class=" form-group">
                                            <label class="label-align">Type Of Menu: <span class="required">* &nbsp; &nbsp; &nbsp;</span>
                                            </label>
                                            <select class="form-control" required="required" name="menutype"
                                                    id="menutype" onchange="menuin(this.id,'menutype')">
                                                <option value="">--Choose Menu Type--</option>
                                                <option value="super">Super Menu</option>
                                                <option value="breakfast">Breakfast Menu</option>
                                                <option value="lunch">Lunchen Menu</option>
                                                <option value="dinner">Dinner Menu</option>
                                                <option value="afternoon">Afternoon and High Tea Menu</option>
                                                <option value="room">Room service Menu</option>

                                            </select>
                                        </div>
                                        <div class=" form-group">
                                            <label class="label-align">Type Of Menu Item: <span class="required">* &nbsp; &nbsp; &nbsp;</span>
                                            </label>
                                            <div class=" ">
                                                <input class="form-control" name="typeitem" id="typeitem"
                                                       required="required" type="text">
                                            </div>

                                        </div>

                                        <div class=" form-group">
                                            <label class="label-align">Description: <span class="required">* &nbsp; &nbsp; &nbsp;</span>
                                            </label>
                                            <textarea class="form-control" name="descrip" id="descrip"
                                                      required="required" type="textarea"></textarea>

                                            </select>
                                        </div>
                                        <div class=" form-group">
                                            <label class="label-align"
                                                   for="unitPrice">Unit Price: <span class="required">* &nbsp; &nbsp; &nbsp;</span>
                                            </label>
                                            <div class="">
                                                <input class="form-control" id="unitPrice" name="unitPrice"
                                                       required="required" type="number">
                                            </div>
                                        </div>
                                        <div class=" form-group">
                                            <div class="col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6"><br>
                                                <div class="col-md-5 col-lg-5 col-xl-5">

                                                    <label for="img-preview">Image</label>
                                                    <div class="img-upload-card ">
                                                        <c:choose>
                                                            <c:when test="${empty foodItemDTO.mpicture}">
                                                                <img src="../../images/icons/food.jpg" id="img-preview"
                                                                     style="width: 100%; height: 40px"/>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <img src="${foodItemDTO.mpicture}" id="img-preview"
                                                                     style="width: 100%;height: 40px"/>
                                                            </c:otherwise>
                                                        </c:choose>
                                                        <label class="file-upload-container" for="file-upload"
                                                               style="font-size: 13px; padding: -10px 5px 0px 5px; height: 30px">
                                                            <input id="file-upload" type="file" style="display:none;">
                                                            Select
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                            <br>
                                            <br>
                                        </div>
                                        <form:hidden id="imgUrl" path="mpicture" value="../../images/icons/food.jpg"/>
                                        <div class=" form-group">
                                            <div class=" ">
                                                <button class="btn btn-dark" type="submit" value="Register">+Add /
                                                    Update
                                                </button>
                                                <button class="btn btn-outline-dark" type="reset">Reset</button>

                                            </div>
                                        </div>
                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--/Order items form------------------------------------------------------------------->



                    <!--/Content/////////////////////////////////////////////////////////////////-->

                </div>

            </div>

<jsp:include page="footer.jsp"/>

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
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
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
