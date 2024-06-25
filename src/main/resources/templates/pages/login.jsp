<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>花城系统-登录</title>
</head>
<body style="margin:0px;background: url(images/登录.jpg) no-repeat;background-size:100% 100%;background-attachment:fixed;">

<div align="center" style="padding-top: 100px">
    <h1>欢迎登录</h1>
    <form action="loginServlet" method="post">
        <p>用户名:&nbsp<input id="username" name="userName" type="text">&nbsp&nbsp</p>
        <p>密码:&nbsp<input id="password" name="password" type="password"></p>
        <input type="submit" class="button" value="登录">
        <button><a href="register.jsp">注册</a></button>
    </form>
    <span style="color:red;font-size:12px">${msg}</span>
</div>
</body>
</html>
