<%--
  Created by IntelliJ IDEA.
  User: prabo
  Date: 10/8/2021
  Time: 1:07 AM
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
    <title>Luxury Hotel in Negombo| Hotel Sapphire </title>
</head>

<body class="nav-md" style="cursor: pointer">



<!-- Sign up form -->
<small style="font-weight: bolder"><a href="home"> << Back to Home</a></small>

<h2> Customer Registration </h2>
<div class="container" id="container">
    <div class="form-container sign-up-container">
        <form method="post" action="customerSignUp" name="customerSignUp">
            <h1>Create Account</h1>
            <span>or use your email for registration</span>
            <input required type="text" placeholder="Name" name="name" />
            <input required type="email" placeholder="Email" name="email" />
            <input required type="text" placeholder="Address" name="address" />
            <input required type="number" placeholder="Mobile" name="contactNumber"/>
            <input  required type="password" placeholder="Password"  />
            <input required type="password" placeholder="Re-type Password" name="password"/>
            <button type="submit">Sign Up</button>
        </form>
    </div>
    <div class="form-container sign-in-container">
        <form action="customerSignIn" method="post">
            <h1>Sign in</h1>
            <span>or use your account</span>

            <input type="text" placeholder="Email" name="email" id="email"/>
            <input type="password" placeholder="Password" name="password" id="pwd1"/>
            <a href="#">Forgot your password?</a>
            <button onclick="login()">Sign In</button>
            <script>
                function login()
                {
                    var uname = document.getElementById("email").value;
                    var pwd = document.getElementById("pwd1").value;
                    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
                    if(uname =='')
                    {
                        alert("please enter email.");
                    }
                    else if(pwd=='')
                    {
                        alert("enter the password");
                    }
                    else if(!filter.test(uname))
                    {
                        alert("Enter valid email id.");
                    }
                    else
                    {
                        alert('Thank You for Login & You are Redirecting to room details page');

                    }
                }
            </script>
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
                <button onclick="signup()" class="ghost" id="signUp">Sign Up</button>
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

</body>
</html>
