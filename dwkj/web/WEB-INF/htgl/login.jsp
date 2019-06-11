<%--
  Created by IntelliJ IDEA.
  User: MXZ
  Date: 2019/6/11
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/UserServlet/login">
    用户名<input type="text" name="user"><br>
    密 码 <input type="text" name="password"><br>
    <input type="submit" name="登录">
</form>
</body>
</html>
