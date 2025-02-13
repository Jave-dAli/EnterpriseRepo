<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Videos</title>
</head>
<body>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("Pragma", "no-cache");   // HTTP 1.0
    response.setHeader("Expires", "0"); // Proxies

    if(session.getAttribute("username")==null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<h1>Videos</h1><br><hr>
<iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM?si=AUgltvyXeRz3-UbG" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>


<form action="logout" method="post">
    <input type="submit" value="logout">
</form>
</body>
</html>
