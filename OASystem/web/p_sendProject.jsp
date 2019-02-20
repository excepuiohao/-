<%@ page import="oa.bean.User" %>
<%@ page import="oa.factory.ServiceFactory" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: St01
  Date: 2017-10-11
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="Css/TalkBook.css" />
    <link rel="stylesheet" type="text/css" href="css/css.css" />
    <style>
        .container table tr{
            margin-top: 30px;
            margin-bottom: 30px;
        }
        .btn{
            border-radius: 5px;
            margin: 5px;
        }
    </style>
</head>
<body>
<%
    List<User> userList = ServiceFactory.getUserService().query(new User());
    request.setAttribute("userList",userList);
%>

<div  class="row ">
    <jsp:include page="navbar.jsp"></jsp:include>
    <div class="col-sm-9 col-md-10 " style="padding-top: 100px">
        <div  class="row ">
            <div class="col-sm-3 col-md-3 ">
            </div>
            <div class="col-sm-9 col-md-9">
               <div class="container">
                   <form action="/SendProject" method="get">
                       <table cellspacing="100px" style="width: 600px">
                           <tr>
                               <td colspan="2" align="center">
                                   <h1>发起项目</h1>
                               </td>
                           </tr>
                           <tr>
                               <td>
                                   项目名称
                               </td>
                               <td>
                                   <input type="text" name="p_title" placeholder="请输入项目名称" required>
                               </td>
                           </tr>
                           <tr>
                               <td> &nbsp;</td>
                           </tr><tr>
                           <td> &nbsp;</td>
                       </tr><tr>
                           <td> &nbsp;</td>
                       </tr>
                           <tr>
                               <td>
                                   项目简介
                               </td>
                               <td>
                                <textarea class="form-control" rows="3" placeholder="请输入项目简介，不多于300字" name="p_context" required></textarea>
                               </td>
                           </tr>
                           <tr>
                               <td> &nbsp;</td>
                           </tr><tr>
                           <td> &nbsp;</td>
                       </tr><tr>
                           <td> &nbsp;</td>
                       </tr>
                       </tr>
                           <tr>
                               <td colspan="2" align="center">
                               </td>
                           </tr>
                           <tr>
                               <td colspan="2">
                                   <ul style="list-style: none">
                                       <li>
                                           <div id="newUser">
                                           </div>
                                       </li>
                                       <li>
                                           <div id="addUser" onclick="showaddUser()">
                                               <img style="width: 20px;height: 20px" src="img/addUser.png">
                                               添加新成员
                                           </div>

                                       </li>
                                       <c:choose>
                                           <c:when test="${!empty userList}">
                                               <c:forEach var="i" begin="0" end="${fn:length(userList)}" items="${userList}">
                                                   <li class="li_addUser btn" onclick="addUser(this)" style="display: none;float: left;background-color: #dddddd" value="${i.u_id}">
                                                           ${i.u_name}

                                                   </li>
                                               </c:forEach>
                                           </c:when>
                                       </c:choose>

                                   </ul>
                               </td>
                           </tr>
                           <tr>
                               <td>&nbsp;</td>
                           </tr>
                           <tr>
                               <td>&nbsp;</td>
                           </tr>
                           <tr>
                               <td>&nbsp;</td>
                           </tr>
                           <tr>
                               <td colspan="2" align="center">
                                   <input type="hidden" value="" id="saveId" name="p_ids">
                                   <input type="submit" value="提交" class="btn">
                               </td>
                           </tr>
                       </table>
                   </form>

               </div>
                <script>
                    function showaddUser() {
                        $(".li_addUser").show();
                    }

                    function delemyself(btn) {
                        $(btn).remove();
                    }

                    function addUser(btn) {
                        var il = $("<button onclick='delemyself(this)' class='btn'></button>");

                        il.val($(btn).val());
                        il.text($(btn).text());
                        $("#saveId").val($("#saveId").val()+$(btn).val()+"#");
                        $("#newUser").append(il);
                        $(btn).remove();
                        $(".li_addUser").hide();
                    }
                </script>
            </div>


        </div>
    </div>
</div>

</body>
</html>

