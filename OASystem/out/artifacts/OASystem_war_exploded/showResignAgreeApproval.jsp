<%--
  Created by IntelliJ IDEA.
  User: St01
  Date: 2017-10-11
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示已批准的辞职申请的详细信息</title>
</head>
<%
    request.setAttribute("u_id",request.getParameter("u_id"));
%>
<body>
<table>
    <c:forEach var="i" items="${resagree}">
        <c:choose>
            <c:when test="${i.u_id eq u_id}">
                <td colspan="2"><h1>辞职申请</h1></td>
                <td>工号：</td><td>${i.u_id}</td>
                <td>辞职理由：</td><td>${i.r_info}</td>
                <td>审批人：</td><td>${i.r_ex_uerno}</td>
                <td style="color: red">批准</td>
            </c:when>
        </c:choose>
    </c:forEach>
</table>
</body>
</html>
