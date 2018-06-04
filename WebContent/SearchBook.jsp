<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,java.io.*" %>
<html>
<head>
<title>按条件查询图书</title>
</head>
<body>
<form>
	<table>
		<tr>
		<td>请输入要查询的字段</td></tr>
		<tr><td><select name="字段名">
		<option value="书名">书名</option>
		<option value="作者">作者</option>
		<option value="出版社">出版社</option>
		<option value="入库时间">入库时间</option>
	</select></td></tr>
		<tr><td><input type="text" name="条件"></td></tr>
		<tr><td><input type="submit" value="查找"></td></tr>
		</table>
		   </form>
		   <table border=3>
				<tr><td width=120><b><center>书号</td>
				<td width=120><b><center>书名</td>
				<td width=120><b><center>作者</td>
				<td width=120><b><center>出版社</td>
				<td width=120><b><center>入库时间</td>
				<td width=120><b><center>是否借出</td>
</tr>
<%
String 条件=request.getParameter("条件");
String 字段名=request.getParameter("字段名");
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","1505010604");
Statement stmt=con.createStatement();
ResultSet rst=stmt.executeQuery("select * from book where "+字段名+"="+条件+"");
while(rst.next()){
	out.println("<tr>");
	out.println("<td><center>"+rst.getString("书号")+"</center></td>");
	out.println("<td><center>"+rst.getString("书名")+"</center></td>");
	out.println("<td><center>"+rst.getString("作者")+"</center></td>");
	out.println("<td><center>"+rst.getString("出版社")+"</center></td>");
	out.println("<td><center>"+rst.getString("入库时间")+"</center></td>");
	out.println("<td><center>"+rst.getString("是否借出")+"</center></td>");
	out.println("</tr>");
}
rst.close();
stmt.close();
con.close();
%>
</table>
</body>
</html>