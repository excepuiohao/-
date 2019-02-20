<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: St01
  Date: 2017-10-11
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>未处理的请假的详细信息</title>
</head>
<%
    request.setAttribute("u_id",request.getParameter("u_id"));
%>
<body>
    <table>
        <c:forEach var="i" items="${app}">
            <c:choose>
                <c:when test="${i.u_id eq u_id}">
                    <td colspan="2"><h1>请假申请</h1></td>
                    <td>工号：</td><td>${i.u_id}</td>
                    <td>请假类型：</td><td>${i.a_type}</td>
                    <td>开始时间：</td><td>${i.a_start_time}</td>
                    <td>结束时间：</td><td>${i.a_end_time}</td>
                    <td>请假时长：</td><td>${i.a_day}</td>
                    <td>请假事由：</td><td>${i.a_info}</td>
                    <td>审批人：</td><td>${i.a_ex_uerno}</td>
                    <td><a href="SubmitAgreeApplyServlet?u_id="+${i.u_id}><button>批准</button></a></td>
                    <td><a href="SubmitDisagreeApplyServlet?u_id="+${i.u_id}><button>不予批准</button></a></td>
                </c:when>

            </c:choose>
        </c:forEach>
    </table>
</body>
</html>
