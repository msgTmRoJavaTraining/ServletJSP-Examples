<%@ page import="beans.example.Person" %><%--
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
        HttpSession httpSession = request.getSession();

        Person p1= (Person) httpSession.getAttribute("p1");

        out.println(p1.getName()+"   "+p1.getCNP());

    %>
</body>
</html>
