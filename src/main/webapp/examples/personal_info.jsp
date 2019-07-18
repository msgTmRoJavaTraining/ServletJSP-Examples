<%--
  Created by IntelliJ IDEA.
  User: nicoll
  Date: 7/18/2019
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:useBean id="infoObj" class="beans.example.Info" scope="session">
    </jsp:useBean>

    <title>Title</title>
</head>
<body>
    <p>Name:
        <jsp:getProperty name="infoObj" property="name"/>
    </p>
    <p>Cnp:
        <jsp:getProperty name="infoObj" property="cnp"/>
    </p>
</body>
</html>
