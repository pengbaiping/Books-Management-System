<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改个人信息</title>
</head>
<body>
<h1>修改个人信息</h1>
<form name="form5" method="post" action="ChangeReader">
<table>
	<tr>
		<td>请输入图书证号：
		<td bgcolor="blue"><input name="图书证号" type="text">
	<tr>
		<td>请输入姓名：
		<td bgcolor="blue"><input name="姓名" type="text">
	<tr>
		<td>请输入院系：
		<td bgcolor="blue"><input name="院系" type="text">
	<tr>
	<tr>
		<td>请输入班级：
		<td bgcolor="blue"><input name="班级" type="text">
	<tr>
		</table><br>
	<input type="reset" value="重置">
	<input type="submit" value="提交修改">
	</form>
</body>
</html>