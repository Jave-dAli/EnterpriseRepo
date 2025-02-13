<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Welcome</title>
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
    Welcome...<br>
    User: ${sessionScope.username}<br><hr>
Videos <a href="videos.jsp">here</a>
<form action="logout" method="post">
    <input type="submit" value="logout">
</form>
</body>
</html>
