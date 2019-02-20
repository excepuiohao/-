<%--
  Created by IntelliJ IDEA.
  User: St01
  Date: 2017-10-11
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示不予批准的请假信息</title>
</head>
<%
    request.setAttribute("u_id",request.getParameter("u_id"));
%>
<body>
<table>
    <c:forEach var="i" items="${appDisagree}">
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
                <td style="color: red">不予批准</td>
            </c:when>
        </c:choose>
        <tr>
        </tr>
    </c:forEach>
</table>
</body>
</html>
