<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 6/10/2022
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h1> Danh sach: </h1>
<a href="/create">Them</a>
<c:forEach var="p" items="${list}">
    <h1>${p.id},${p.name},${p.price}
        <a href="/edit?id=${p.id}">Edit</a>
        <a href="/delete?id=${p.id}">Delete</a>
    </h1>
</c:forEach>
</body>
</html>
