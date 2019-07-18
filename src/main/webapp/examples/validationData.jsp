<%--
  Created by IntelliJ IDEA.
  User: nicoll
  Date: 7/18/2019
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="beans.example.Info" %>
<html>
<head>
    <jsp:useBean id="infoObj" class="beans.example.Info" scope="session">
    </jsp:useBean>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String cnp = request.getParameter("CNP");
    String[] checkName = name.split(" ");
    boolean okName = false;
    boolean okCNP = false;
    if(checkName.length>1) {
        if (checkName[0] != null && checkName[1] != null) {
            okName = true;
            if (cnp.length() == 13) {
                okCNP = true;
            }
        }
    }
    if(okName== true && okCNP == true){
        out.print("<h1> Success!<h1>");
        out.print("<h3>Logged in successfully!<h3>");
        Info obj = (Info) session.getAttribute("infoObj");
        obj.setCnp(cnp);
        obj.setName(name);
    }else{
        response.sendRedirect("indexExercise.jsp");
    }
%>
<a href="personal_info.jsp">My personal info</a>
</body>
</html>
