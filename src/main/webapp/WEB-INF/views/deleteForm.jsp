<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 6/11/2022
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/delete" method="post">
    <input type="number" name="id" value="${delete.id}">
    <input type="text" name="name" value="${delete.name}">
    <input type="number" name="price" value="${delete.price}">
    <button>Delete</button>
</form>
</body>
</html>
