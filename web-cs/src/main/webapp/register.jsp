<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>3-用户注册</title>
    <style type="text/css">
        .star {
            font-size: 10px;
            color: red
        }
    </style>

    <script type="text/javascript">
        function validate() {
            if (frm_register.userName.value == "") {
                alert("用户名不能为空！");
                frm_register.userName.focus();
                return;
            }

            if (frm_register.userPassword.value.length < 6) {
                alert("密码长度不能少于6位！");
                frm_register.userPassword.select();
                return;
            }

            frm_register.submit();//提交表单数据到服务器
        }
    </script>
</head>
<body>
<h3>新闻发布系统>>用户管理>>注册</h3>
<hr color="red">
<form action="register_result.jsp" method="post" name="frm_register">
    <table align="center">
        <tr>
            <td>用户名：</td>
            <td>
                <input type="text" name="userName"><span class="star">**用户名不能为空</span>
            </td>
        </tr>

        <tr>
            <td>密码：</td>
            <td>
                <input type="password" name="userPassword"><span class="star">**密码长度不少于6位</span>
            </td>
        </tr>

        <tr>
            <td>确认密码：</td>
            <td>
                <input type="password" name="userPassword1">
            </td>
        </tr>

        <tr>
            <td>性别：</td>
            <td>
                <input type="radio" name="sex" value="男">男
                <input type="radio" name="sex" value="女" checked>女
            </td>
        </tr>

        <tr>
            <td>爱好：</td>
            <td>
                <input type="checkbox" name="hobbit" value="打游戏">打游戏
                <input type="checkbox" name="hobbit" value="唱歌" checked>唱歌
                <input type="checkbox" name="hobbit" value="跳舞">跳舞
            </td>
        </tr>

        <tr>
            <td>学历：</td>
            <td>
                <select name="dgree">
                    <option value="博士">博士</option>
                    <option value="硕士">硕士</option>
                    <option value="本科">本科</option>
                    <option value="大专">大专</option>
                </select>
            </td>
        </tr>

        <tr>
            <td>个人说明：</td>
            <td>
                <textarea rows="10" cols="50"></textarea>
            </td>
        </tr>

        <tr>
            <td colspan="2" align="center">
                <input type="button" name="ok" value="提交" onclick="validate();">
                <input type="reset" name="cancel" value="取消">
            </td>
        </tr>

    </table>
</form>
</body>
</html>