<%--
  Created by IntelliJ IDEA.
  User: MXZ
  Date: 2019/5/31
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"userServlet",
                    type:"post",
                    data:$("#myForm").serialize(),
                    success:function (data) {
                        alert("yes"+data);
                    },
                    error:function (data) {
                        alert("no"+data)
                    }
                });
            });

        });
    </script>
</head>
<body>
<form id="myForm">
    用户名<input type="text" name="userName"><br><br>
    密 码<input type="text" name="password"><br><br>
    性 别<input type="text" name="sex"><br><br>
    <input type="button" id="btn" value="提交"><br><br>
</form>
</body>
</html>
