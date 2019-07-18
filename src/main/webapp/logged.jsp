<%@ page import="servlets.day9.Info" %><%--
  Created by IntelliJ IDEA.
  User: leucul
  Date: 18/07/2019
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logged In!</title>
</head>
<body>

<%
    String name = request.getParameter("requestName");
    String cnp = request.getParameter("requestCNP");

    if(name.contains(" ")&&cnp.length()==13){
        Info userInfo= new Info(name,cnp);
        session.setAttribute("userInfo",userInfo);

        response.sendRedirect("success.html");

    }else{
        response.sendRedirect("login.jsp");


    }


%>




</body>
</html>
