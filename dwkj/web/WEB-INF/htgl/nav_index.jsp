<%--
  Created by IntelliJ IDEA.
  User: MXZ
  Date: 2019/6/11
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>导航管理</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/htgl/jumpadd">添加导航</a>
<br>
<hr>
<table>
    <tr>
        <td>导航ID</td>
        <td>导航名称</td>
        <td>导航上级</td>
        <td>导航Servlet</td>
    </tr>
    <c:forEach items="${nav_list}" var="nav">
        <tr>
            <td>${nav.getCategory_id()}</td>
            <td>${nav.getCategory_name()}</td>
            <td>${nav.getLead_name()}</td>
            <td>${nav.getCategory_servlet()}</td>
            <td>
                <a href="${pageContext.request.contextPath}/NavServlet/editBack?id=${nav.category_id}&name=${nav.getCategory_name()}&lead=${nav.getCategory_lead()}&servlet=${nav.getCategory_servlet()}">修改</a>
                <a href="${pageContext.request.contextPath}/NavServlet/delete?id=${nav.category_id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
