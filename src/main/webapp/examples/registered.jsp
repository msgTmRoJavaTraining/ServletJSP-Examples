<%--
  Created by IntelliJ IDEA.
  User: kissa
  Date: 7/13/2018
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registered!</title>
</head>
<body>
    <%
        String name = request.getParameter("nume");
        String varsta = request.getParameter("varsta");
        out.print("Hello "+name + " aged "+varsta);
    %>
</body>
</html>
