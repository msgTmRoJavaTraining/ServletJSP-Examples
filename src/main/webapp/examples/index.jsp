<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.LocalDateTime" %>
<%--
  Created by IntelliJ IDEA.
  User: kissa
  Date: 7/10/2018
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isThreadSafe="false"%>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%@ include file="header.jsp"%>
<%! int a;

    public String sayHello() {
        return "Hello";
    }
%>
<%= LocalDateTime.now()%>
<%
    out.println("<br/>");
    out.println("Hello there!");
%>

</body>
</html>