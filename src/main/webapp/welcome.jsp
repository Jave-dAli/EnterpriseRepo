<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Welcome</title>
</head>
<body>
<%
    if(session.getAttribute("username")==null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
    Welcome...<br>
    User: ${username}<br>
    Password: ${password}<br><hr>
Videos <a href="videos.jsp">here</a>
<form action="logout" method="get">
    <input type="submit" value="logout">
</form>
</body>
</html>
