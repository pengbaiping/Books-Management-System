<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
</head>
<body>
<h1>修改密码</h1>
<form name="form6" method="post" action="ChangePassword2">
<table>
	<tr>
		<td>请输入图书证号：
		<td bgcolor="blue"><input name="图书证号" type="text">
	<tr>
		<td>请输入新密码：
		<td bgcolor="blue"><input name="newpassword1" type="password">
	<tr>
		<td>确认密码：
		<td bgcolor="blue"><input name="newpassword2" type="password">
	<tr>
		</table><br>
	<input type="reset" value="重置">
	<input type="submit" value="提交修改">
	</form>
</body>
</html>