<%--
  Created by IntelliJ IDEA.
  User: St01
  Date: 2017-10-11
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="Css/TalkBook.css" />
    <link rel="stylesheet" type="text/css" href="css/css.css" />
</head>
<body>

<div  class="row ">
    <jsp:include page="navbar.jsp"></jsp:include>
    <div class="col-sm-9 col-md-10 " style="padding-top: 100px">
        <div  class="row ">
            <div class="col-sm-2 col-md-2 ">
            </div>
            <div class="col-sm-10 col-md-10 ">
                <h3>通讯录</h3>
                <table class="table table-hover" id="talkBook_tab">
                    <tr>
                        <td>员工工号</td>
                        <td>员工姓名</td>
                        <td>员工邮箱</td>
                        <td>员工电话</td>
                        <td>员工类型</td>
                    </tr>
                    <c:forEach var="i" items="${userList }">
                        <tr>
                            <td>
                                <c:out value="${i.u_no }"></c:out>
                            </td>
                            <td>
                                <c:out value="${i. u_name }"></c:out>
                            </td>
                            <td>
                                <c:out value="${i.u_email }"></c:out>
                            </td>
                            <td>
                                <c:out value="${i.u_phone }"></c:out>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${i.u_type eq 0}">
                                        <c:out value="普通员工"></c:out>
                                    </c:when>
                                    <c:when test="${i.u_type eq 1}">
                                        <c:out value="项目经理"></c:out>
                                    </c:when>
                                    <c:when test="${i.u_type eq 2}">
                                        <c:out value="人事部"></c:out>
                                    </c:when>
                                </c:choose>
                            </td>
                        </tr>
                    </c:forEach>
                </table>

            </div>


        </div>
    </div>
</div>

</body>
</html>
