<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Echo Servlet Test</title>
    <style>
        form {
            border: 1px solid red;
            margin-top: 100px;
            margin-bottom: 100px;
            margin-right: 80px;
            margin-left: 80px;

        }
    </style>
</head>
<body>

<form action="registerForm.jsp" method="post">
    NAME:<input type="text" name="requestName"/>
    <br/>
    CNP:<input type="text" name="requestCNP"/>
    <br/>
    <input type="submit" value="Submit!"/>
</form>

</body>
</html>