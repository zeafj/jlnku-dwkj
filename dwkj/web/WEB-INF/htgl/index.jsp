<%--
  Created by IntelliJ IDEA.
  User: MXZ
  Date: 2019/6/11
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <script src="js/jquery-1.7.2.min.js"></script>
    <style>
        .login{
            background: aqua;
            width: 100px;
            height: 100px;
        }
        .nav{
            width: 300px;
            height: 500px;
            background: darkcyan;
            list-style: none;
        }
    </style>
</head>
<body>
<div class="login">
    <p>
        ${sessionScope.user.getUser()} 你好
    </p>
    <a href="${pageContext.request.contextPath}/htgl/logout">注销</a>
</div>
<div class="nav">
    <ul>
        <li><a href="${pageContext.request.contextPath}/NavServlet/query">导航管理</a></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>
</div>

</body>
</html>
