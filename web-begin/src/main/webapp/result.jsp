<%--
  Created by IntelliJ IDEA.
  User: TuNan
  Date: 2023/5/7
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>提交结果</title>
</head>
<body>
<p>您的姓名：${name}</p>
<p>您喜欢的音乐：</p>
<ul>
    <c:forEach var="type" items="${music}">
        <li>${type}</li>
    </c:forEach>
</ul>
</body>
</html>

