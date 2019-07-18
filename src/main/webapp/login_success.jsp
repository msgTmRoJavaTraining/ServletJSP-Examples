<%@ page import="servlets.day9.Info" %><%--
  Created by IntelliJ IDEA.
  User: astana
  Date: 7/18/2019
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info Page</title>
</head>
<body>
    <%!
        String userName, userCnp;
    %>

    <%
        Info getUserInfoFromSession = (Info) session.getAttribute("newUserObject");
        userName = getUserInfoFromSession.getName();
        userCnp = getUserInfoFromSession.getCnp();
    %>

    <p>Name: <%  out.print(userName); %> </p>
    <p>Cnp: <%  out.print(userCnp); %> </p>
</body>
</html>
