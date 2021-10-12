<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/12/2021
  Time: 7:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Profile</h1>
<h3>${loggerId.name}</h3>
<h1>Your Reservation</h1>
<h3>${resDetail.date}</h3>
<h3>${resDetail.startTime}</h3>
<h3>${resDetail.endTime}</h3>
<h1>Order Detail</h1>
<h3>${orderDetail.date}</h3>
<h3>${orderDetail.orderDetails}</h3>
</body>
</html>
