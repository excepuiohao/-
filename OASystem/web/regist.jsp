<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
		<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/css.css">
		<script type="text/javascript" src="js/js.js"></script>
</head>
<body>
<div id="logintitle">
	<h3><b><span class="glyphicon glyphicon-heart-empty"></span>SixOA</b></h3>
	<p>Open new world's door</p>
	</div>
<form>
<div class="container regist">
	<div class="row">
	<div class="col-xs-3"></div>
		<div class="col-xs-6 regist_input">
			<input class="form-control" type="text" name="username" placeholder="请输入姓名">
		</div>
		<div class="col-xs-3"></div>
	</div>
	<div class="row">
		<div class="col-xs-3"></div>
		<div class="col-xs-6 regist_input">
			<input class="form-control" type="text" name="userpwd" placeholder="请输入密码">
		</div>
		<div class="col-xs-3"></div>
	</div>
	<div class="row">
	<div class="col-xs-3"></div>
		<div class="col-xs-6 regist_input">
			<input class="form-control" type="text" name="useremail" placeholder="请输入邮箱">
		</div>
		<div class="col-xs-3"></div>
	</div>
	<div class="row">
	<div class="col-xs-3"></div>
		<div class="col-xs-6 regist_input">
			<input class="form-control" type="text" name="userphone" placeholder="请输入手机号">
		</div>
		<div class="col-xs-3"></div>
	</div>
	<div class="row">
	<div class="col-xs-3"></div>
		<div class="col-xs-6 regist_input">
			<input class="form-control btn btn-info" type="submit" value="注册">
		</div>
		<div class="col-xs-3"></div>
	</div>
	<div class="row">
	<div class="col-xs-3"></div>
		<div class="col-xs-6 regist_input">
			已有账号?立即<a href="index.jsp">登录</a>
		</div>
		<div class="col-xs-3"></div>
	</div>
</div>
</form>
</body>
</html>