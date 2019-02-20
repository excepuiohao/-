<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateinfo.jsp' starting page</title>
    <script type="text/javascript" src="js/jquery-1.11.1.min.js" ></script>
	<link rel="stylesheet" href="css/addinfo.css" />
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
      <div id="content">
    <form class="form-horizontal" role="form" action="updateinfo">
				
					<div id="h1">
					<h1>修改员工信息</h1>
					</div>
				<div class="form-group ">
	          <div class="col-sm-4"></div>
	          	<div class="col-sm-4">
	        <input type="text" class="form-control" name="u_no" placeholder="请输入工号" value="1111">
	         </div>
	        </div>
	        <div class="form-group ">
	          <div class="col-sm-4"></div>
	          	<div class="col-sm-4">
	        <input type="text" class="form-control" name="u_name" placeholder="请输入名字" value="小帅">
	         </div>
	        </div>
	        <div class="form-group ">
	          <div class="col-sm-4"></div>
	          	<div class="col-sm-4">
	        <input type="password" class="form-control" name="ui_pwd" placeholder="请输入密码" value="111">
	         </div>
	        </div>
	  <div class="form-group ">
	    <div class="col-sm-4"></div>
	    <div class="col-sm-4">
	      <input type="text" class="form-control" name="ui_email" placeholder="请输入邮箱" value="222@qq.com">
	    </div>
	  </div>
	  <div class="form-group ">
	        <div class="col-sm-4"></div>
	        <div class="col-sm-4">
	      <input type="text" class="form-control" name="ui_phone" placeholder="请输入电话" value="123456789">
	    </div>
	    </div>
	    <div class="form-group ">
	        <div class="col-sm-4"></div>
	       <div class="col-sm-4">
	      <input type="text" class="form-control"  placeholder="请输入你的想法" value="" id="kind4">
	    </div>
	    <div class="col-sm-1">
	    	<select id="kind3" name="ui_statu">
				<option value="0,未读">未读</option>
				<option value="0,未批准">未批准</option>
				<option value="0,已批准">已批准</option>
			</select>
	    </div>
	    <script type="text/javascript">
			$(function(){
				$("#kind3").bind("click", function(){
					var str = $(this).val();
					var ss = str.split(",");
					$("#kind4").val(ss[1]);
				});
			});
			</script>
	    </div>
	    </div>
	    <div class="form-group ">
	          <div class="col-sm-4"></div>
	          	<div class="col-sm-4">
	        <input type="text" class="form-control" name="ui_ex_userno" placeholder="请输入审批人" value="小红">
	         </div>
	        </div>
	     <div id="add1">
	     	<input type="submit" class="btn btn-primary btn-lg btn-block" value="修改"></input>
	     </div>
	     
	  </form>
	  </div>
	  <div style="text-align:center;" id="foot1">
      <p><a href="main.jsp">返回</a></p>
</div>
  </body>
</html>
