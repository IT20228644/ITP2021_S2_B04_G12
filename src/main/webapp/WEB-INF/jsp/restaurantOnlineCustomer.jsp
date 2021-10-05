<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/3/2021
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Online Registration Form</h2>

        <form method="post" action="onlineCustomerSave" name="onlineCustomerSave">
            <h1>Create Account</h1>

            <input required type="text" placeholder="Name" name="name" />
            <input required type="email" placeholder="Email" name="email" />
            <input required type="text" placeholder="Address" name="address">
            <input required type="number" placeholder="Mobile" name="contact"/>
            <input required type="text" placeholder="User Name" name="userName" />
            <input  required type="password" placeholder="Password"  />
            <input required type="password" placeholder="Re-type Password" name="password"/>
            <button type="submit">Sign Up</button>
        </form>


<h2> Sign In </h2>
<form action="onlineSignIn" method="post">

    <input type="username" placeholder="User Name" name="userName" />
    <input type="password" placeholder="Password" name="password"/>
    <a href="#">Forgot your password?</a>
    <button>Sign In</button>
<%--    <%--%>
<%--        session.setAttribute("userId", "usffff");--%>
<%--    %>--%>
</form>
</body>
</html>
