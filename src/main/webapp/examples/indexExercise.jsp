<%--
  Created by IntelliJ IDEA.
  User: nicoll
  Date: 7/18/2019
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    body {font-family: Arial, Helvetica, sans-serif;}
    form {border: 3px solid #f1f1f1;}
    input[type=text]{
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }
    button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }
    button:hover {
        opacity: 0.8;
    }
    .content{
        display: flex;
        justify-content: center;
        width: 20%;
    }
    .container {
        padding: 4px;
    }
</style>
<body>
<div class = "content">
    <form method="post" action="validationData.jsp" >
        <div class="container">
            Name: <input type="text" placeholder="Enter Name" name="name" required><br>
            CNP: <input type="text" placeholder="Enter your CNP" name="CNP" required><br>
            <button type="submit">Register</button>
        </div>
    </form>
</div>
</body>
</html>
