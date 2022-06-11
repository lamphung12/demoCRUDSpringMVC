<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 6/10/2022
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/edit" method="post">
    <input type="number" name="id" value="${edit.id}">
    <input type="text" name="name" value="${edit.name}">
    <input type="number" name="price" value="${edit.price}">
    <button type="submit">edit</button>
</form>
</body>
</html>
