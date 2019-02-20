<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/css.css">
		<script type="text/javascript" src="js/js.js"></script>
</head>
<body>


<jsp:include page="navbar.jsp"></jsp:include>

<div>
	<div class="jumbotron">
		<h1>Hello!This is SixOA!</h1>
		<P>This is a template showcasing the optional theme stylesheet included in Bootstrap. Use it as a starting point to create something more unique by building on or modifying it.</P>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-4 myinf">
				<div id="circle">
					<%--<h4>上班打卡</h4>--%>
						<c:choose>
							<c:when test="${!empty signList}">
								<c:forEach var="i" items="${signList }" begin="${f:length(signList) - 1 }" end="${f:length(signList) - 1}">
									<c:choose>
										<c:when test="${i.s_id % 2 eq 0}">
											<input type="hidden" value="0" id="signType" />
											<h4>上班签到</h4>
										</c:when>
										<c:otherwise>
											<input type="hidden" value="1" id="signType" />
											<h4>下班签退</h4>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<h4>上班签到</h4>
								<input type="hidden" value="0" id="signType" />
							</c:otherwise>
						</c:choose>

					<div id="sysdate"></div>
					<script type="text/javascript">jishi()</script>
				</div>
				<script type="text/javascript">
					$(function () {
                        $("#circle").click(function () {
                            window.location="SignInfo?signType="+$("#signType").val();
                        });
                    });
				</script>

			</div>
			<div class="col-md-4 myinf">
				<h3>项目1进度</h3>
				<div class="progress progress-striped active">
					<div class="progress-bar progress-bar-success" role="progressbar"
						 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
						 style="width: 80%;">
						<span class="">80%</span>
					</div>
				</div>

				<h3>项目2进度</h3>
				<div class="progress progress-striped active">
					<div class="progress-bar progress-bar-info" role="progressbar"
						 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
						 style="width: 50%;">
						<span class="">50%</span>
					</div>
				</div>

				<h3>项目3进度</h3>
				<div class="progress progress-striped active">
					<div class="progress-bar progress-bar-danger" role="progressbar"
						 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
						 style="width: 20%;">
						<span class="">20%</span>
					</div>
				</div>
			</div>

			<div class="col-md-4 myinf">
				<h3>待批准事件:</h3><hr>
				<p>明天的病假</p><hr>
				<p>今晚加班申请</p><hr>
			</div>
		</div>


		<div class="row">
			<div class="col-md-4 myinf">
				<h3>项目1日志</h3>
				<p>今天.....</p><hr>
				<p>昨天.....</p>
				<a href="#">查看更多</a>
			</div>
			<div class="col-md-4 myinf">
				<h3>项目2日志</h3>
				<p>今天.....</p><hr>
				<p>昨天.....</p>
				<a href="#">查看更多</a>
			</div>
			<div class="col-md-4 myinf">
				<h3>项目3日志</h3>
				<p>今天.....</p><hr>
				<p>昨天.....</p>
				<a href="#">查看更多</a>
			</div>

		</div>
	</div>


</div>
</body>
</html>