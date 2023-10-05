<%--
  Created by IntelliJ IDEA.
  User: TuNan
  Date: 2023/5/7
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>信息提交</title>
</head>
<body>
<form action="/web-begin/TestServlet" method="POST">
    <label>您的姓名：</label>
    <input type="text" name="name"><br><br>
    <label>喜欢的音乐是：</label><br>
    <input type="checkbox" name="music" value="古典音乐"> 古典音乐
    <input type="checkbox" name="music" value="民族音乐"> 民族音乐
    <input type="checkbox" name="music" value="流行音乐"> 流行音乐
    <input type="checkbox" name="music" value="摇滚乐"> 摇滚乐<br><br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>

