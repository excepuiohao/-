<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017-10-11
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的信息</title>
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/css.css">
    <script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <script type="text/javascript" src="js/js.js"></script>
    <style type="text/css">
        span{
            font-size: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <div id="myinfo">
        <table class="table table-hover table-bordered">

            <tr class=""><td><span class="glyphicon glyphicon-asterisk"> ID:xyk123123</span></td></tr>
            <tr class=""><td><span class="glyphicon glyphicon-info-sign"> 工号:65254</span></td></tr>
            <tr class=""><td><span class="glyphicon glyphicon-user"> 姓名:王旭</span></td></tr>
            <tr class=""><td><span class="glyphicon glyphicon-phone"> 电话:18232139878</span></td></tr>
            <tr class=""><td><span class="glyphicon glyphicon-envelope"> 邮箱:956196155@qq.com</span></td></tr>
            <tr class=""><td><span class="glyphicon glyphicon-user"> 上级:王旭</span></td></tr>
            <tr class=""><td><span class="glyphicon glyphicon-briefcase"> 职位:普通员工</span></td></tr>
        </table>
        <button class="btn btn-info glyphicon glyphicon-pencil">点击申请修改信息</button>
    </div>
</div>
</body>
</html>
