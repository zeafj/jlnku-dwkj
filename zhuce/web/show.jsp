<%--
  Created by IntelliJ IDEA.
  User: MXZ
  Date: 2019/5/31
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>show</title>
</head>
<body>
<table>
    <tr>
        <td>用户名</td>
        <td>密码</td>
        <td>性别</td>
    </tr>
</table>
<table>

    <c:forEach var="u" items="${list}">
        <tr>
            <td>${u.userName}</td>
            <td>${u.password}</td>
            <td>${u.sex}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
