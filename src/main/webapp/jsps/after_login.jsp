<%@ page import="beans.example.Info" %>
<%@page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Registered!</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String cnp = request.getParameter("cnp");
    if (name.contains(" ") && cnp.length() == 13) {
        out.println("Success!");
        out.println("Logged in successfully!");

        Info myObject = new Info(name, cnp);
        session.setAttribute("Info", myObject);
    } else {
        response.sendRedirect("../indexjsp.html");
    }

%>

<a href="personal_info.jsp"> My personal information.</a>
</body>
</html>