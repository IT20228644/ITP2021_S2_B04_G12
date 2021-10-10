<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/10/2021
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="icon" type="image/png" href="../../images/icons/favicon.png"/>


    <!-- Main css -->
    <link rel="stylesheet" href="../../css/customerLogin/style.css">
    <title>Luxury Hotel in Galle | Hotel Shappior Marriotte</title>
</head>

<body class="nav-md" style="cursor: pointer">



<!-- Sign up form -->
<small style="font-weight: bolder"><a href="home"> << Back to Home</a></small>

<h2> Banquet Customer Registration </h2>
<div class="container" id="container">
    <div class="form-container sign-up-container">
        <form method="post" action="banquetCustomerSignUp" name="banquetCustomerSignUp" onsubmit="verifyPassword()" >
            <h1>Create Account</h1>
            <span>or use your email for registration</span>
            <input required type="text" placeholder="Name" name="name" />
            <input required type="email" placeholder="Email" name="email" />
            <input required type="text" placeholder="Address" name="address" />
            <input required type="tel" pattern="[0-9]{10}" placeholder="Mobile" name="contactNumber"/>
            <input required type="password" placeholder="Password" id="pwd" name = "password1"/>
             <span id = "message" style="color:red"> </span>
            <input required type="password" placeholder="Re-type Password" id = "pwd11" name="password"/>
            <button type="submit" id="btnSub" onclick="Validate()" >Sign Up</button>
        </form>
    </div>
    <div class="form-container sign-in-container">
        <form action="banquetCustomerSignIn" method="post">
            <h1>Sign in</h1>
            <span>or use your account</span>

            <input type="text" placeholder="Email" name="email" />
            <input type="password" placeholder="Password" name="password"/>
            <a href="#">Forgot your password?</a>
            <button>Sign In</button>
            <%
                session.setAttribute("userId", "usffff");
            %>
        </form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>To keep connected with us please login with your personal info</p>
                <button class="ghost" id="signIn">Sign In</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>Hello, Customer !</h1>
                <p>Create your account & continue the booking process</p>
                <button class="ghost" id="signUp">Sign Up</button>
            </div>
        </div>
    </div>
</div>

<footer style="text-align: center">
    <p >
        By using our site, you acknowledge that you have read and understand our
        Cookie Policy,<a href="#"> Privacy Policy,</a> and our <a href="#">Terms of Service.</a>
    </p>
</footer>

<script src="../../js/customerLogin/main.js"></script>

<script type="text/javascript">
    function verifyPassword() {
        var pw = document.getElementById("pwd").value;
        //check empty password field
        if(pw == "") {
            document.getElementById("message").innerHTML = "**Fill the password please!";
            return false;
        }else{
        }
    }

</script>


<%--<script type="text/javascript">--%>
<%--    function Validate() {--%>
<%--        var password = document.getElementById("pwd").value;--%>
<%--        var confirmPassword = document.getElementById("pwd11").value;--%>
<%--        if (password != confirmPassword) {--%>
<%--            alert("Passwords do not match.");--%>
<%--            return false;--%>
<%--        }--%>
<%--        return true;--%>
<%--    }--%>
<%--</script>--%>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btnSub").click(function () {
            var password = $("#pwd").val();
            var confirmPassword = $("#pwd11").val();
            if (password != confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }
            return true;
        });
    });
</script>


</body>
</html>
