<%--
  Created by IntelliJ IDEA.
  User: MXZ
  Date: 2019/6/13
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>头部</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/head.css">
    <script src="${pageContext.request.contextPath}/js/head.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>
</head>
<body>
<div class="head">
    <div class="time">
        <span>
            <span id="clock"></span>
        </span>
    </div>
    <div class="logo"></div>
    <div class="navBar">
        <ul class="nav clearfix">
<%--            <li class="m om">--%>
<%--                <h3><a href="">网站首页</a></h3>--%>
<%--            </li>--%>
            <c:forEach items="${nav_list_lead}" var="lead">
                <li class="m">
                    <ul class="nav_main">
                        <li><h3><a href="">${lead.category_name}</a></h3></li>
                        <c:forEach items="${nav_list}" var="nav">
                                <c:if test="${nav.category_lead == lead.category_id}">
                                    <li class="secondNav"  id="second"><h3><a href="">${nav.category_name}</a></h3></li>
                                </c:if>
                        </c:forEach>
                    </ul>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>
<script>

    // $(function(){
        // $(".nav_main").mouseover(function(){
//			alert("9："+this);// this 是 span
// 			parent()是 .(点)左侧的父辈元素
//			toggleClass 切换  选择器的名称
//			siblings()同辈
//			removeClass('current') 移出 显示的选择器了
//             $(this).parent().toggleClass("current").siblings().removeClass('current');
//             $(this).descendant().toggleClass("secondNav");
//         });
        // $(".nav_main").mouseout(function(){
//			alert("9："+this);// this 是 span
// 			parent()是 .(点)左侧的父辈元素
//			toggleClass 切换  选择器的名称
//			siblings()同辈
//			removeClass('current') 移出 显示的选择器了
//             $(this).parent().toggleC;lass("current").siblings().removeClass('current');
//         })
//     });
    var $jq = jQuery.noConflict(true);
    $jq(function() {

        var s=$jq(".nav_main");
        console.log(s);




    });
</script>