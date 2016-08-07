<%--
  Created by IntelliJ IDEA.
  User: dufan
  Date: 16/7/30
  Time: 下午4:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1">
  <tr>
    <th>状态</th>
  </tr>
  <tr>
    <td>${submitText }</td>
  </tr>
</table>

<form action="submit" method="post" ><br>
  请输入你的今日状态：<input type="text" name="submitText" size=10 value="t88" ><br>
  <input type="submit" value="提交" >
</form>

</body>
</html>
