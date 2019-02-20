<%@ page import="oa.bean.Rate" %>
<%@ page import="java.util.List" %>
<%@ page import="oa.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: St01
  Date: 2017-10-10
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交项目进度</title>
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
    List<Rate> list = (List<Rate>) session.getAttribute("ratelist");
    if (list!=null){
        for (Rate l: list
                ) {%>
<div class="container">
    <div class="progress progress-striped active">
        <%="个人工号：" + l.getU_id()%>
        <%="项目id：" + l.getP_id()%>
        <div class="progress-bar progress-bar-success" role="progressbar"
             aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
             style="width: <%=l.getR_rate()%>%;">
            <span class="sr-only">40% 完成</span>
            <%=l.getR_rate()%>
        </div>
    </div>
</div>
<form action="DOSubmitRate">
    选择项目新完成进度：
    <input name="r_rate" type="number" placeholder="" max="<%=100-l.getR_rate()%>" min="0">
    项目id<input name="r_id" type="text" value="<%=l.getR_id()%>">
    <span>目前项目完成度：<%=l.getR_rate()%>,最大可提交：<%=100-l.getR_rate()%>,最小可提交0</span>
    <input type="submit" value="提交">
</form>
<%}
}
%>
<a href="main.jsp"><button>返回</button></a>
<%=user.toString()%>
</body>
</html>
