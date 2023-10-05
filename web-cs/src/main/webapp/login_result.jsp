<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>2-登录处理页面</title>
</head>
<body>
<%

%>
<p>
<div style="text-align: center;">
    <%
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String today = sdf.format(now);
    %>
    您好今天是<%=today %>,欢迎来到我的主页，系统正在开发中。。。
</div>
</body>
</html>