<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书下架</title>
</head>
<h1>图书下架</h1>
<body>
<form name="form11" action="DeleteBook" method="post">
<tr>
<td>请输入需要删除的图书的书号：
<td bgcolor=blue><input type=text name=书号>
<input type=reset value=重置>
<input type=submit value=下架></form>
<a href=Admin.jsp>返回</a>
</body>
</html>