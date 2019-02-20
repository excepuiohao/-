<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="oa.factory.ServiceFactory" %>
<%@ page import="oa.bean.Apply" %>
<%@ page import="oa.bean.Work_time" %>
<%@ page import="oa.bean.User" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'HoldayApply.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="<%=basePath%>js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=basePath%>js/Apply.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style>
.leftdiv {
	position: absolute;
}

.rightdiv {
	margin-left: 170px;
}

.pont {
	display: none;
	color: #999;
}

.span_pont {
	height: 30px;
}

li {
	height: 30px;
}

body {
	margin-left: 500px;
}
</style>
</head>

<body>
	<form action="HoldayApplyServlet">
		<h1>请假申请</h1>
		<div>
			<ul style="list-style:none">
				<li>
					<div class="leftdiv">
						<span>请假类型</span>
					</div>
					<div class="rightdiv">
						<select id="holdaytype" name="holdaytype"
							style="width:140px; text-align:center">
							<option></option>
							<option value="0">事假</option>
							<option value="1">年假</option>
							<option value="2">病假</option>
							<option value="3">调休</option>
						</select>
					</div>
				</li>
				<div id="shijia" class="pont">
					<%
						Work_time work_time = new Work_time();
						work_time.setU_id(ServiceFactory.getUserService().getUser().getU_id());
						work_time = ServiceFactory.getWork_TimeService().query(work_time).get(0);
					%>
					<span class="span_pont">事假剩余<%=work_time.getWt_m_h()%>天</span>
				</div>
				<div id="nianjia" class="pont">
					<span class="span_pont">年假剩余<%=work_time.getWt_y_h()%>天</span>
				</div>
				<div id="bingjia" class="pont">
					<span class="span_pont">病假剩余<%=work_time.getWt_i_h()%>天</span>
				</div>
				<div id="tiaoxiu" class="pont">
					<span class="span_pont">调休剩余<%=work_time.getWt_overtime()%>天</span>
				</div>
				<li>
					<div class="leftdiv">
						<span>开始时间</span>
					</div>
					<div class="rightdiv">
						<input type="date" name="begindate" id="begindate" />
					</div>
				</li>
				<li>
					<div class="leftdiv">
						<span>结束时间</span>
					</div>
					<div class="rightdiv">
						<input type="date" name="enddate" id="enddate" />
					</div>
				</li>
				<li>
					<div class="leftdiv">
						<span>时长（天）</span>
					</div>
					<div class="rightdiv">
						<input type="text" readonly="readonly" name="time" id="time" style="border:none" />
					</div>
				</li>
				<li>
					<div class="leftdiv">
						<span>请假事由</span>
					</div>
					<div class="rightdiv">
						<textarea name="reason" placeholder="请输入请假事由"
							style="width:170px; height:50px;"></textarea>
					</div>
				</li>
				<li style="margin-top:40px;">
					<div class="leftdiv">
						<span>审批人</span>
					</div>
					<input type="hidden" name="leadno" value="<%=ServiceFactory.getUserService().getUser().getLead_no()%>"/>
					<div class="rightdiv">
						<input type="text" disabled="disabled" id="lead" value="<%=ServiceFactory.getUserService().query(new User(ServiceFactory.getUserService().getUser().getLead_no())).get(0).getU_name()%>" />
					</div>
				</li>
			</ul>
		</div>
		<input type="submit" value="提交" style="margin-left: 160px; width: 80px;"/>
	</form>
</body>
</html>
