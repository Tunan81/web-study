<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>1-用户登录</title>
</head>
<body>
<h3>新闻发布系统>>用户管理>>登录</h3>
<hr color="red">
<form action="login_result.jsp" method="post" name="frm_login">
    <table align="center">
        <tr>
            <td>用户名：</td>
            <td>
                <input type="text" name="userName">
            </td>
        </tr>

        <tr>
            <td>密码：</td>
            <td>
                <input type="password" name="userPassword">
            </td>
        </tr>

        <tr>
            <td colspan="2" align="center">
                <input type="button" name="ok" value="提交">
                <input type="reset" name="cancel" value="取消"><a href="register.jsp">注册</a>
            </td>
        </tr>

    </table>
</form>
</body>
</html>