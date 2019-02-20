<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="oa.bean.User" %>
<%@ page import="oa.factory.ServiceFactory" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'UpdateInfoApply.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<center>
	<h1>个人信息修改申请</h1>
		<form action="UpdateInfoApplyServlet">
			<table cellspacing="20px;">
				<tr>
					<td>工号</td>
					<td><input type="text" name="uno" value="${user.u_no}" readonly="readonly" /></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input type="text" name="uname" value="${user.u_name}" /></td>
				</tr>
				<tr>
					<td>邮箱</td>
					<td><input type="text" name="uemail" value="${user.u_email}" /></td>
				</tr>
				<tr>
					<td>电话</td>
					<td><input type="text" name="uphone" value="${user.u_phone}" /></td>
				</tr>
				<tr>
					<td>批阅人</td>
					<input type="hidden" name="leadno" value="<%=ServiceFactory.getUserService().getUser().getLead_no()%>">
					<td><input type="text" disabled="disabled" id="lead" value="<%=ServiceFactory.getUserService().query(new User(ServiceFactory.getUserService().getUser().getLead_no())).get(0).getU_name()%>" /></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="submit" value="提交" style="width: 150px;" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
