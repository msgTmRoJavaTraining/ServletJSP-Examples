<%@ page import="beans.example.Person" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%
Person prs=(Person)session.getAttribute("infos");
out.println(prs.getNume());
out.println(prs.getCNP());
%>

</body>
</html>