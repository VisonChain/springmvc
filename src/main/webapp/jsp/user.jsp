<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 46100
  Date: 2019-04-13
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${user}" var="obj">
        <tr>
            <td>${obj.name}</td>
            <td>${obj.age}</td>
            <td>${obj.address}</td><br>
        </tr>
    </c:forEach>
</body>
</html>
