<%@ page import="beans.example.Person" %><%--
  Created by IntelliJ IDEA.
  User: hachb
  Date: 18/07/2019
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registered!</title>
</head>
<body>

        <%
            String name=request.getParameter("name");
            String cnp=request.getParameter("cnp");

            HttpSession httpSession=request.getSession();

            if(name.contains(" ")&& cnp.length()==13)
            {
                Person p1=new Person(name,cnp);
                httpSession.setAttribute("p1",p1);
                response.sendRedirect("correct.jsp");
            }
            else
            {
                response.sendRedirect("registration.jsp");
            }
        %>

</body>
</html>
