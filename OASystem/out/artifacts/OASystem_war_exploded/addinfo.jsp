<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addinfo.jsp' starting page</title>
    <link rel="stylesheet" href="css/addinfo.css" />
    <script type="text/javascript" src="js/jquery-1.11.1.min.js" ></script>
	<script type="text/javascript" src="js/addjob.js"></script>
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
   	<form class="form-horizontal" role="form" action="addinfo" >
				
					<div id="h1">
					<h1>添加员工信息</h1>
					</div>
				<div class="form-group ">
	          <div class="col-sm-4"></div>
	          	<div class="col-sm-4">
	        <input type="text" class="form-control" name="u_no" placeholder="请输入工号" required="required">
	         </div>
	        </div>
	        <div class="form-group ">
	          <div class="col-sm-4"></div>
	          	<div class="col-sm-4">
	        <input type="text" class="form-control" name="u_name" placeholder="请输入名字" required="required">
	         </div>
	        </div>
	        <div class="form-group ">
	          <div class="col-sm-4"></div>
	          	<div class="col-sm-4">
	        <input type="password" class="form-control" name="u_pwd" placeholder="请输入密码" required="required">
	         </div>
	        </div>
	  <div class="form-group ">
	    <div class="col-sm-4"></div>
	    <div class="col-sm-4">
	      <input type="text" class="form-control" name="u_email" placeholder="请输入邮箱" required="required">
	    </div>
	  </div>
	  <div class="form-group ">
	        <div class="col-sm-4"></div>
	        <div class="col-sm-4">
	      <input type="text" class="form-control" name="u_phone" placeholder="请输入电话" required="required">
	    </div>
	    </div>
	    <div class="form-group ">
	        <div class="col-sm-4"></div>
	       <div class="col-sm-4 type" >
	      <input type="text" class="form-control"  placeholder="请输入职位" id="kind2" required="required">
	     </div>    
	     <div class="col-sm-1">
	      <select id="kind1" name="u_type" >
				<option value="0,普通员工" >普通员工</option>
				<option value="1,项目经理" >项目经理</option>
				<option value="2,人事部" >人事部</option>
			</select>
		</div>
		<script type="text/javascript">
			$(function(){
				$("#kind1").bind("click", function(){
			
				var str = $(this).val();
					var ss = str.split(",");
					
					$("#kind2").val(ss[1]);
				});
			
				
			});
		</script>
	    </div>
	    </div>
	    <div class="form-group ">
	          <div class="col-sm-4"></div>
	          	<div class="col-sm-4">
	        <input type="text" class="form-control" name="lead_no" placeholder="请输入领导编号" required="required">
	         </div>
	        </div>
	     <div id="add1">
	     	<input type="submit" class="btn btn-primary btn-lg btn-block " value="添加"></input>
	     </div>
	    
	  </form>
	  </div>
	 <div style="text-align:center;" id="foot1">
      <p><a href="main.jsp">返回</a></p>
</div>
  </body>
</html>
