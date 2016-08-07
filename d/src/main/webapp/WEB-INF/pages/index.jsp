<%--
  Created by IntelliJ IDEA.
  User: dufan
  Date: 16/7/29
  Time: 下午5:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
      hello!~~~~~!
    </title>
</head>
<body>
<form name="form1" action="onSubmit" method="post">
    <table width="300" border="1">
        <tr>
            <td colspan="2">登录窗口</td>
        </tr>
        <tr>
            <td>用户名td>
            <td><input type="text" name="username" size="10">td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password" size="10"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="submit"
                                   value="登录"> <a
                    href="register.do?method=init">注册新用户</a>
            </td>
        </tr>
    </table>
</form></body>
</html>
