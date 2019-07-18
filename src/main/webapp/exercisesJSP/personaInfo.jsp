<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registered!</title>
</head>
<body>
<%
    HttpSession mySes = request.getSession();
    out.print("Name:"+(String) mySes.getAttribute("NUME")+"\n");
    out.print("CNP:"+(String) mySes.getAttribute("CNP"));

%>
</body>
</html>