<%@ page import="java.util.List" %>
<%@ page import="oa.bean.Rate" %>
<%@ page import="oa.bean.Project" %>
<%@ page import="oa.factory.ServiceFactory" %>
<%@ page import="oa.bean.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017-10-10
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查看进度</title>
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>

<%
    User user = ServiceFactory.getUserService().getUser();
    Project project = new Project();
    project.setP_managerno(user.getU_no());
    List<Project> projects = ServiceFactory.getProjectService().query(project);

    List<List<Rate>> ratell = new ArrayList<List<Rate>>();
    for (Project p:projects) {
        String[] strings = p.getP_teamno().split("#");
        Rate rate = new Rate();
        for (int i = 0; i < strings.length; i++) {
            rate.setU_id(Integer.valueOf(strings[0]));
            List<Rate> rates = ServiceFactory.getRateService().query(rate);
            ratell.add(rates);
        }
    }
    request.setAttribute("ratell",ratell);

    Rate rate = new Rate();
    rate.setU_id(user.getU_id());
    List<Rate> rates = ServiceFactory.getRateService().query(rate);
    request.setAttribute("rates",rates);


%>
<div  class="row ">
    <jsp:include page="navbar.jsp"></jsp:include>
    <div class="col-sm-9 col-md-10 " style="padding-top: 100px">
        <div  class="row ">
            <div class="col-sm-2 col-md-2 ">
            </div>
            <div class="col-sm-8 col-md-8 ">

                <c:choose>
                    <c:when test="">
                        <h1>个人项目</h1>
                        <c:forEach items="${rates}" var="i">
                           <c:choose>
                               <c:when test="${i.u_id eq user.u_id}">
                                   <h3>项目名称：${i.p_title}</h3>
                                   <div class="container">
                                       <div class="progress progress-striped active">
                                                ${u.u_name}
                                           <div class="progress-bar progress-bar-success" role="progressbar"
                                                aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                                                style="width: ${i.p_rate}%;">
                                               <span class="sr-only">40% 完成</span>

                                           </div>
                                       </div>
                                   </div>
                               </c:when>
                           </c:choose>
                        </c:forEach>
                    </c:when>
                </c:choose>
            </div>

            <div class="col-sm-2 col-md-2 ">
            </div>
        </div>
    </div>
</div>


<%--<div class="container">--%>
    <%--<c:choose>--%>
        <%--<c:when test="${!empty projectlist}">--%>
            <%--<c:forEach begin="0" end="${fn:length(projectlist)}" var="i">--%>
                <%--<div class="progress progress-striped active">--%>
                    <%--<div class="progress-bar progress-bar-success" role="progressbar"--%>
                         <%--aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"--%>
                         <%--style="width: 40%;">--%>
                        <%--<span class="sr-only">40% 完成</span>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</c:forEach>--%>
        <%--</c:when>--%>
    <%--</c:choose>--%>
<%--</div>--%>


<%--<div class="progress progress-striped active">--%>
    <%--<div class="progress-bar progress-bar-success" role="progressbar"--%>
         <%--aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"--%>
         <%--style="width: 40%;">--%>
        <%--<span class="sr-only">40% 完成</span>--%>
    <%--</div>--%>
<%--</div>--%>
</body>
</html>
