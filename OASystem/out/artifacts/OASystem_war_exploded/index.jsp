<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017-10-10
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/css.css">

</head>
<body style="background-color: #EEEEEE ; background-image: url(img/login.svg);overflow: hidden; ">

<div id="login">
    <div id="logintitle">
        <h3><b><span class="glyphicon glyphicon-heart-empty"></span>SixOA</b></h3>
        <p>Login to your account</p>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-xs-12 ">
                <form action="UserLogin" method="post">
                    <input style="
   				margin-top: 30px;" class="logininput" type="text" name="username" placeholder="请输入您的个人ID"><br>
                    <br>
                    <input class="logininput" type="password" name="password" placeholder="请输入您的密码">
                    <br>
                    <input id="logincheckbox" name="remember" type="checkbox">
                    <span>记住我</span>
                    <br><br>
                    <input class="btn btn-info" id="loginsubmit" type="submit" value="登录">
					<br><br>
					<span style="position: relative;right: 108px;">没有账号?立即<a href="regist.jsp">注册</a></span>
                </form>
            </div>
        </div>
    </div>

</div>
</body>
</html>
