<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/5/24
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<h2>${error}</h2>
<form action="check.action" method="post">
    <div>
        <label>用户名：</label>
        <input name="username" type="text"/>
    </div>
    <div>
        <label>密码：</label>
        <input type="password" name="password">
    </div>
    <div>
        <input type="submit" value="登录">
    </div>
</form>
</body>
</html>
