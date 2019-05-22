<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%--登陆主界面--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆界面</title>
    <style>
        html, body {
            width: 100%;
            height: 100%;
        }
        body {
            font-family: "华文细黑";
            background: url("./images/Login.jpg") no-repeat;
            background-size: 100%;
        }
    </style>
</head>
<body>
<%--form表单控件，其中action表示将数据传送到哪个文件中，method表示传送方法，常有post和get--%>
<form action="login" method="post">
    账号：<input type="text" name="name">
    密码：<input type="password" name="password">
    <input type="submit" value="登陆">
</form>
</body>
</html>
