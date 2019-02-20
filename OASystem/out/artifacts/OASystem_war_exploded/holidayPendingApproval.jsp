<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: St01
  Date: 2017-10-10
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>请假</title>
    <script type="text/javascript" src="jquery/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</head>
<body>


<%--<ul>
    <li id="list">姓名　类型
        <a href="showPendingApproval.jsp" style="text-decoration: none">Check</a>
    </li>
    &lt;%&ndash; <li style="display:none" id="hidden-show"><div>
         <table>
             <tr>
                 <td>具体描述</td><td></td>
             </tr>
             <tr>
                 <td colspan="２" style="color: red">已批准</td>
             </tr>
         </table>

     </div></li>&ndash;%&gt;
</ul>--%>
<ul id="myTab" class="nav nav-tabs">
    <li class="active">
        <a href="#home" data-toggle="tab">待审批</a>
    </li>
    <li class="dropdown">
        <a href="#" id="myTabDrop1" class="dropdown-toggle"
           data-toggle="dropdown">已审批<b class="caret"></b>
        </a>
        <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">
            <li><a href="#jmeter" tabindex="-1" data-toggle="tab">
                未批准</a>
            </li>
            <li><a href="#ejb" tabindex="-1" data-toggle="tab">
          已批准</a>
            </li>
        </ul>
    </li>
</ul>



<div id="myTabContent" class="tab-content">
    <div class="tab-pane fade in active" id="home">
    <table>
    <c:forEach var="i" items="${app}">
    <tr>
        <td>工号:</td>
        <td>${i.u_id}</td>
        <td>请假类型:</td>
        <td>${i.a_type}</td>
        <td><a href="showPendingApproval.jsp?u_id="+${i.u_id}>Check</a> </td>
    </tr>
    </c:forEach>

    </table>
    </div>
    <%--不予批准--%>
    <div class="tab-pane fade" id="jmeter">
       <table>
           <c:forEach var="i" items="${appDisagree}">
               <tr>
                   <td>工号:</td>
                   <td>${i.u_id}</td>
                   <td>请假类型:</td>
                   <td>${i.a_type}</td>
                   <td><a href="showHolidayDisagreeApproval.jsp?u_id="+${i.u_id}>Check</a> </td>
               </tr>
           </c:forEach>
       </table>
    </div>
    <%--批准--%>
    <div class="tab-pane fade" id="ejb">
       <table>
           <c:forEach var="i" items="${appAgree}">
               <tr>
                   <td>工号：</td>
                   <td>${i.u_id}</td>
                   <td>请假类型:</td>
                   <td>${i.a_type}</td>
                   <td><a href="showHolidayAgreeApproval.jsp?u_id="+${i.u_id}>Check</a> </td>
               </tr>
           </c:forEach>
       </table>
    </div>
</div>
<script>
    $(function () {
        $('#myTab li:eq(1) a').tab('show');
    });
</script>
</body>
</html>
