<%@ page import="servlets.day9.Info" %><%--
  Created by IntelliJ IDEA.
  User: astana
  Date: 7/18/2019
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Status</title>
</head>
<body>

<h1>Success!</h1>
<h1>Logged in successfully!</h1>
<a href="login_success.jsp">My personal information</a>
    <%
        String name = request.getParameter("submittedName");
        String cnp = request.getParameter("submittedCNP");

        String[] wordsInName = name.split(" ");
        if(wordsInName.length != 2 || cnp.length() != 13) {
            response.sendRedirect("login.jsp");
        } else {
            Info newUserInfo = new Info(name, cnp);

            session.setAttribute("newUserObject", newUserInfo);
        }
    %>


</body>
</html>
