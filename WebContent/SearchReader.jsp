<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,java.io.*" %>
<html>
<head>
<title>按条件查询读者</title>
</head>
<body>
<form>
	<table>
		<tr>
		<td>请输入要查询的字段</td></tr>
		<tr><td><select name="字段名">
		<option value="院系">院系</option>
		<option value="班级">班级</option>
	</select></td></tr>
		<tr><td><input type="text" name="条件"></td></tr>
		<tr><td><input type="submit" value="查找"></td></tr>
		</table>
		   </form>
		   <table border=3>
				<tr><td width=120><b><center>图书证号</td>
				<td width=120><b><center>姓名</td>
				<td width=120><b><center>院系</td>
				<td width=120><b><center>班级</td>
</tr>
<%
String 条件=request.getParameter("条件");
String 字段名=request.getParameter("字段名");
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","1505010604");
Statement stmt=con.createStatement();
ResultSet rst=stmt.executeQuery("select * from reader where "+字段名+"='"+条件+"'");
while(rst.next()){
	out.println("<tr>");
	out.println("<td><center>"+rst.getString("图书证号")+"</center></td>");
	out.println("<td><center>"+rst.getString("姓名")+"</center></td>");
	out.println("<td><center>"+rst.getString("院系")+"</center></td>");
	out.println("<td><center>"+rst.getString("班级")+"</center></td>");
	out.println("</tr>");
}
rst.close();
stmt.close();
con.close();
%>
</table>
</body>
</html>