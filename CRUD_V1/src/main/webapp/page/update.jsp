<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/9/13
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新页面</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/adcc.css">
</head>
<body class="update">
<div class="first">
<form action="<%=request.getContextPath()%>/update" method="post" class="first" name="myform" >
    <h1>修改页面</h1>
    ID <input type="text" class="id" name="ID" value="<%=request.getParameter("personId")%>">
    姓名<input type="text" class="name" name="name"><br />
    <p class="sex">性别 <input type="radio" value="男" name="sex"/>男
        <input type="radio" value="女" name="sex">女</p>
    地址<input type="text" class="adress" name="address"><br><br>
    &emsp;&emsp;<input type="submit"  value="确认修改" onclick="estimateNull();return false"  />
</form>
    <form action="<%=request.getContextPath()%>/List" method="post">
        <input type="submit" value="返回">
    </form>
</div>
</body>
<script src="<%=request.getContextPath()%>/static/js/adcc.js"></script>
</html>
