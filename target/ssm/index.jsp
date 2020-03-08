<%--
  Created by IntelliJ IDEA.
  User: Mr.Ji
  Date: 2020/3/6
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
    <h3>你好请求成功了。。。</h3>
    <a href="account/findAll">测试</a>
    <h3>测试包</h3>
<form action="account/save" method="post">
   姓名：<input type="text" name="name">
   金额：<input type="text" money="money">
  <input type="submit" value="保存">
</form>
</body>
</html>
