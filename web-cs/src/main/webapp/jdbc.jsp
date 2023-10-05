<%--
  Created by IntelliJ IDEA.
  User: TuNan
  Date: 2023/3/27
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String driverName = "com.mysql.jdbc.Driver";
    Class.forName(driverName);
    //2-连接数据库
    String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
    String user = "root";
    String password = "261615";
    Connection cn = DriverManager.getConnection(url, user, password);
    Statement st = cn.createStatement();
    String sql = "update user set state=1 where uid=3;";
    int result = st.executeUpdate(sql);
    if (result > 0){
        System.out.println("操作数据库成功");
    }else {
        System.out.println("操作数据库失败");
    }
    st.close();
    cn.close();
%>
</body>
</html>
