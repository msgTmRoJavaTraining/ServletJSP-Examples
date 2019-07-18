<%@ page import="servlets.day9.Info" %><%--
  Created by IntelliJ IDEA.
  User: leucul
  Date: 18/07/2019
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaBean</title>
</head>
<body>
<%
    Info getinfo= (Info) session.getAttribute("userInfo");
    String name=getinfo.getName();
    String cnp=getinfo.getCnp();

%>

<p>Nume:<% out.println(name);%></p>
<p>CNP:<% out.println("\n" + cnp);%></p>


</body>
</html>
