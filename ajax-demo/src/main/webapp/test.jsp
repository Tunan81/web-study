<%--
  Created by IntelliJ IDEA.
  User: TuNan
  Date: 2023/2/27
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!-- 静态注释 -->
<%-- 动态注释 --%>
<%
Date now = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    String today = sdf.format(now);
    out.print(today);
%>
</body>
<html>
