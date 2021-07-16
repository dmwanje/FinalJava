<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Final Project</title>
</head>
<body>
<div align="center">
<h1><%= "Web Calculator" %>
</h1>
<br/>
<form>
    <form action="calculate" method="post">
        <p>
            Input number A <input type="number" name="a" required />
        </p>
        <p>
            Input number B <input type="number" name="b" required />
        </p>
        <p>
            <input type="submit" value="CALCULATE" />
        </p>
    </form>
</body>
</html>