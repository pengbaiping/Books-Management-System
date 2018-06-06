<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>借书</title>
</head>
<body>
<form name="form3" method="post" action="BorrowBook">
<table>
<tr>
<td>请输入图书证号：
		<td bgcolor="blue"><input name="图书证号" type="text">
	<tr>
		<td>请输入书号：
		<td bgcolor="blue"><input name="书号" type="ext">
	<tr>
		<td>请输入借阅日期：
		<td bgcolor="blue"><input name="借阅日期" type="text">
	<tr>
		<td>请输入应还日期：
		<td bgcolor="blue"><input name="应还日期" type="text">
		<tr></table><br>
		<input type=reset value=重置>
		<input type=submit value=提交></form>
		<a href="Worker.jsp">返回</a>
</body>
</html>