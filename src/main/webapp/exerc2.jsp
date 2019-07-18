<%@ page import="beans.example.Person" %><%--
  Created by IntelliJ IDEA.
  User: marana
  Date: 7/18/2019
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignedIn</title>
</head>
<body>
<%
    String name=request.getParameter("Nume");
    String cnp=request.getParameter("CNP");
    if(name.contains(" ") && cnp.length()==13){
    /*out.println("Nume:"+name);*/
    /*out.println("CNP:"+cnp);*/
    Person tmp=new Person();
    tmp.setNume(name);
    tmp.setCNP(cnp);
    session.setAttribute("infos",tmp);
    }
    else
    response.sendRedirect("main2.html");
%>
<a href="moreInfo.jsp">MoreInfo</a>

</body>
</html>
