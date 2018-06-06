<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改图书信息</title>
</head>
<body>
<h1>修改图书信息</h1>
<form name="form6" method="post" action="ChangeBook">
<table>
	<tr>
		<td>请输入书号：
		<td bgcolor="blue"><input name="书号" type="text">
	<tr>
		<td>请输入书名：
		<td bgcolor="blue"><input name="书名" type="text">
	<tr>
		<td>请输入作者：
		<td bgcolor="blue"><input name="作者" type="text">
	<tr>
		<td>请输入出版社：
		<td bgcolor="blue"><input name="出版社" type="text">
	<tr>
		<td>请输入入库时间：
		<td bgcolor="blue"><input name="入库时间" type="text">
	<tr>
		</table><br>
	<input type="reset" value="重置">
	<input type="submit" value="提交修改">
	</form>
</body>
</html>