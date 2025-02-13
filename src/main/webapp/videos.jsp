<%--
  Created by IntelliJ IDEA.
  User: javed
  Date: 2/12/25
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Videos</title>
</head>
<body>
<h1>Videos</h1><%
    if(session.getAttribute("username")==null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<a href="https://www.youtube.com/watch?v=OuBUUkQfBYM&t=844s">Video</a>
<form action="logout">
    <input type="submit" value="logout">
</form>
</body>
</html>
