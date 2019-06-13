<%--
  Created by IntelliJ IDEA.
  User: MXZ
  Date: 2019/6/12
  Time: 8:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>导航更新</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/NavServlet/updata">

    <p>当前修改的为   ${id} ${name} 上级为 </p>
    <br>
    <input type="hidden" name="id" value="${id}">
    导航名称 <input type="text" name="name" value="${name}"><br>
    导航servlet链接 <input type="text" name="servlet" value="${servlet}"><br>
    导航上级
    <select name="lead">
        <option value="0">无上级</option>
        <c:forEach items="${nav_list_lead}" var="nav">

            <option value="${nav.category_id}">${nav.category_name}</option>
        </c:forEach>
    </select>
    <input type="submit" value="提交">

</form>

</body>
</html>
