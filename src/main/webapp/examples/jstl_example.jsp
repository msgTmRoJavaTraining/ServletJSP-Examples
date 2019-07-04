<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kissa
  Date: 7/10/2018
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>$Title$</title>
</head>
<body>

<c:set var = "myNumber" scope = "session" value = "${1}"/>
<c:if test="${myNumber > 0}">
    <c:out value="Hello!"/>
</c:if>

</br>
<c:set var = "myArray1" scope = "session" value = "${[1,2,3]}"/>
<c:forEach var="item" items="${myArray1}">
    <c:out value="${item}"/>
</c:forEach>

</body>
</html>