<%--
  Created by IntelliJ IDEA.
  User: MXZ
  Date: 2019/6/11
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>正在跳转</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <script>
        //直接跳转首页
        //window.location.href= "<%=path%>" + "/htgl/login";
        window.location.href= "${pageContext.request.contextPath}/NavServlet/mainnav";
    </script>
</head>

<body>

</body>
</html>
