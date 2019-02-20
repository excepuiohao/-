<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017-10-11
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/css.css">
    <script type="text/javascript" src="js/js.js"></script>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <a href="#" class="navbar-brand"><span class="glyphicon glyphicon-heart-empty"></span> SixOA</a>
    <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-bell"></span> 消息<span class="badge" style="background-color: #D9534F">3</span></a></li>
        <li><a href="#"><span class="glyphicon glyphicon-home"></span> 主页</a></li>
        <!-- <li><a href="#"><span class="glyphicon glyphicon-cog"></span> 设置</a></li> -->
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> 个人信息</a></li>
    </ul>
</div>

<div class="col-sm-3 col-md-2 sidebar">
    <ul class="nav nav-sidebar">
        <li><a href="main.jsp"><span class="glyphicon glyphicon-pencil"></span> 打卡签到</a></li>
        <li><a href="TalkBookListInfo"><span class="glyphicon glyphicon-book"></span> 同事通讯录</a></li>
        <li class="sidein"><a href="#" class="inactive"><span class="glyphicon glyphicon-tree-conifer"></span> 审批<span class="glyphicon glyphicon-menu-down downbtn" ></span></a>
            <ul class="nav nav-sidebar" style="display: none">
                <li>
                    <a href="#">请假申请</a>
                    <!--<ul class="nav nav-sidebar sidein" style="display: none">-->
                    <!--<li><a href="#">事假</a></li>-->
                    <!--<li><a href="#">年假</a></li>-->
                    <!--<li><a href="#">病假</a></li>-->
                    <!--<li><a href="#">调休</a></li>-->
                    <!--</ul>-->
                </li>
                <li><a href="#">辞职申请</a></li>
                <li><a href="#">申请加班</a></li>
                <li><a href="#">申请修改信息</a></li>

                <li><a href="#">辞职审批</a></li>
                <li><a href="#">请假审批</a></li>
                <li><a href="#">加班审批</a></li>

            </ul>
        </li>
        <li class="sidein"><a href="#" class="inactive"><span class="glyphicon glyphicon-stats"></span> 项目<span class="glyphicon glyphicon-menu-down downbtn" ></span></a>
            <ul class="nav nav-sidebar" style="display: none">
                <li><a href="p_sendProject.jsp">发起项目</a>
                    <!-- <ul>
                        <li><a href="#">办公室</a></li>
                        <li><a href="#">人事处</a></li>
                        <li><a href="#">组联部</a></li>
                        <li><a href="#">外联部</a></li>
                        <li><a href="#">研究部</a></li>
                        <li><a href="#">维权办</a></li>
                    </ul> -->
                </li>
                <li><a href="LookOverRate">查看进度</a>
                    <!-- <ul>
                        <li><a href="#">综合部</a></li>
                        <li><a href="#">大型活动部</a></li>
                        <li><a href="#">展览部</a></li>
                        <li><a href="#">艺委会工作部</a></li>
                        <li><a href="#">信息资源部</a></li>
                        <li><a href="#">双年展办公室</a></li>
                    </ul> -->
                </li>
                <li class="last"><a href="p_workLog.jsp">工作日志</a></li>
                <li class="last"><a href="GOSubmitRate">提交进度</a></li>
            </ul>
        </li>
    </ul>
</div>
</body>
</html>
