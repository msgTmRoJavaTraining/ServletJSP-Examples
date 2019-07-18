<%@ page import="beans.example.Info" %><%--
  Created by IntelliJ IDEA.
  User: mihaer
  Date: 7/18/2019
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Personal information</title>
</head>
<body>
<jsp:useBean id="myInfo" class="beans.example.Info" scope="session">

</jsp:useBean>

<%
    Info object = (Info) session.getAttribute("Info");
%>

<p>
    Name:
    <%
        out.println(object.getName());
    %>
</p>

<p>
    CNP:
    <%
        out.println(object.getCNP());

    %>
</p>


</body>
</html>
