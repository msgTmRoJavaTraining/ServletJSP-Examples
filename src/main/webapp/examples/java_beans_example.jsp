<%@ page import="beans.example.Animal" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kissa
  Date: 7/10/2018
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<br>
<head>
    <title>$Title$</title>
</head>

    <jsp:useBean id="bobbyDog" class="beans.example.Animal" scope="page">
        <jsp:setProperty name="bobbyDog" property="name" value="Bobby"/>
        <jsp:setProperty name="bobbyDog" property="species" value="Terrier"/>
    </jsp:useBean>

    <p>Name:
        <jsp:getProperty name="bobbyDog" property="name"/>
    </p>
    <p>Species:
        <jsp:getProperty name="bobbyDog" property="species"/>
    </p>

    <p>By using EL: ${bobbyDog.name} ${bobbyDog.species}</p>

    <%--Setting beans using scriplets:--%>
    <%
        session.setAttribute("sessionCatBean", new Animal("Kata", "Cat"));
    %>

    <%--Accessing this bean can be done these ways:--%>
    <%=((Animal)session.getAttribute("sessionCatBean")).getName()%>
    </br>

    <jsp:getProperty name="sessionCatBean" property="name"/>
    </br>

    ${sessionCatBean.name}
    ${sessionCatBean.species}
    </br>

</body>
</html>