<%--
  Created by IntelliJ IDEA.
  User: heli
  Date: 2019/6/22
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/addUser" method="post">
    <p>
        <label >姓名:</label>
        <input type="text" name="username">

    </p>
    <p>
        <label >年龄:</label>
        <input type="text"  name="userage">
    </p>
    <p><input type="submit" value="submit"></p>
</form>

</body>
</html>
