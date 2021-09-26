<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/9/14
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>人员列表</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/adcc.css">
</head>
<body class="view">
<div class="first">
    <table align ="center" border ="1" cellspacing ="0" cellpadding ="0">
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>性别</th>
            <th>地址</th>
            <th>操作</th>
            <th>操作</th>
        </tr>
     <tbody>
         <c:forEach items="${persons}" var="person">
             <tr>
                 <td>${person.ID}</td>
                 <td>${person.name}</td>
                 <td>
                     <c:choose>
                         <c:when test="${person.sex =='女'}">女</c:when>
                         <c:when test="${person.sex =='男'}">男</c:when>
                     </c:choose>
                 </td>
                 <td>${person.adress}</td>
                 <td>
                     <form action="<%=request.getContextPath()%>/page/update.jsp?personId=${person.ID}" method="post">
                         <input type="submit" value="修改">
                     </form>
                 </td>
                 <td>
                     <form action="<%=request.getContextPath()%>/delete?personId=${person.ID}" method="post">
                         <input type="submit" value="删除">
                     </form>
                 </td>
             </tr>
         </c:forEach>
     </tbody>

    </table>
     <a href="<%=request.getContextPath()%>/page/addPage.jsp">增加人员</a>
</div>

</body>
</html>
