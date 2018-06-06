<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除读者</title>
</head>
<h1>删除读者</h1>
<body>
<form name="form11" action="DeleteReader" method="post">
<tr>
<td>请输入需要删除的读者的图书证号：
<td bgcolor=blue><input type=text name="图书证号">
<input type=reset value=重置>
<input type=submit value=删除></form>
<a href=Admin.jsp>返回</a>
</body>
</html>