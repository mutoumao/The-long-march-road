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
    <title>人员增加</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/adcc.css">
</head>
<body class="adcc">
<div class="first">
<h1 class="first">填写表单</h1>
<form action="<%=request.getContextPath()%>/add" method="post" class="first"  name="myform" >
    ID&emsp;<input type="text" name="ID"><br>
    姓名<input type="text" name="name">
    <p>性别：
        <input type="radio" value="男" name="sex"/>男
        <input type="radio" value="女" name="sex"/>女
    </p>
   地址 <input type="text" name="adress"></input><br>
    <input type="submit" value="提交" onclick="return judgeNull()"/>
</form>
<form action="<%=request.getContextPath()%>/List" method="post">
    <input type="submit" value="返回">
</form>
</div>
</body>
<script src="<%=request.getContextPath()%>/static/js/adcc.js"></script>
</html>
