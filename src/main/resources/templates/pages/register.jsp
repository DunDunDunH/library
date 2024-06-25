<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>花城系统-注册</title>
</head>
<body style="margin:0px;background: url(../../images/login.jpg) no-repeat;background-size:100% 100%;background-attachment:fixed;">
<div align="center" style="padding-top: 100px">
    <h1>注册</h1>
    <form action="registerServlet" method="post">
        <p>&nbsp&nbsp用户名:&nbsp&nbsp<input id="username" name="userName" type="text">&nbsp&nbsp</p>
        <p>&nbsp&nbsp&nbsp密码:&nbsp&nbsp&nbsp<input id="password" name="password" type="password"></p>
        <p>确认密码:<input id="confirmPassword" name="confirmPassword" type="password"></p>
        <p>&nbsp手机号:&nbsp&nbsp<input id="phone" name="phone" type="text"></p>
        <input type="submit" class="button" value="确定">
        <button><a href="login.jsp">登录</a></button>
    </form>
    <span style="color:red;font-size:12px">${msg}</span>
</div>
</body>
</html>
