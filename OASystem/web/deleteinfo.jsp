<%@page import="oa.bean.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'deleteinfo.jsp' starting page</title>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css" />
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
    	<table class="table">
       <thead>
    <tr>
      <th>员工id</th>
      <th>员工编号</th>
      <th>领导编号</th>
      <th>员工姓名</th>
      <th>员工密码</th>
      <th>员工邮箱</th>
      <th>员工电话</th>
      <th>员工类型</th>
      <th>修改员工</th>
      <th>删除员工</th>
    </tr>
  </thead>
  <tbody>
    <tr class="active">
       <td>1</td>
      <td>111</td>
      <td>112</td>
      <td>小来</td>
      <td>520</td>
      <td>124122@qq.com</td>
      <td>12545454</td>
      <td>1</td>
      </tr>
    <!--for循环遍历  -->
    
    <%  List<User> list=(List<User>)request.getSession().getAttribute("list");
   	for(int i=0;i<list.size();i++){%>
   	<tr class="active">
   	<td><%=list.get(i).getU_id() %></td>
   	<td><%=list.get(i).getU_no() %></td>
   	<td><%=list.get(i).getLead_no() %></td>
   	<td><%=list.get(i).getU_name() %></td>
   	<td><%=list.get(i).getU_pwd() %></td>
   	<td><%=list.get(i).getU_email() %></td>
   	<td><%=list.get(i).getU_phone() %></td>
   	<td><%=list.get(i).getU_type() %></td>
   	<td><a href="updateinfo?id=<%=list.get(i).getU_id() %>" style="text-decoration: none;">修改</a></td>
   	<td><a href="deleteuser?id=<%=list.get(i).getU_id() %>" style="text-decoration: none;">删除</a></td>
   	</tr>
   	<%}
    %>
  </tbody>
</table>
  </body>
</html>
