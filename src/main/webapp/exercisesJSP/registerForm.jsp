<%--
  Created by IntelliJ IDEA.
  User: kissa
  Date: 7/13/2018
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registered!</title>
</head>
<body>
<%
    boolean chefIfValid = false;
    String name = request.getParameter("requestName");
    String cnp = request.getParameter("requestCNP");
    HttpSession mySes = request.getSession();
    mySes.setAttribute("NUME",name);
    mySes.setAttribute("CNP",cnp);
      if(cnp.length() == 13 && name.contains(" "))
        chefIfValid = true;

    if(chefIfValid) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Servlet2");
        response.sendRedirect("succesPage.jsp");
    }else{
        response.sendRedirect("form.jsp");
    }

%>
</body>
</html>
