<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,java.io.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎使用本系统</title>
</head>
<body>
<h1>欢迎<%=(String)request.getParameter("工号")%>使用本系统</h1>
<table width="500"height="200">
  <tbody>
    <tr>
      <td><center><a href="BorrowBook.jsp">读者借书</td>
      <td><center><a href="RepayBook.jsp">读者还书</td>
      <td><center><a href="ChangePassword1.jsp">修改密码</td>
      <td><center><a href="HomePage.jsp">退出系统</td>
    </tr>
  </tbody>
</table>
<h1>借书情况</h1>
<table border=3>
				<tr><td width=120><b><center>图书证号</td>
				<td width=120><b><center>书号</td>
				<td width=120><b><center>借阅日期</td>
				<td width=120><b><center>应还日期</td>
				<td width=120><b><center>状态</td>
</tr>
<%
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","1505010604");
Statement stmt=con.createStatement();
ResultSet rst=stmt.executeQuery("select * from borrowbook");
while(rst.next()){
	out.println("<tr>");
	out.println("<td><center>"+rst.getString("图书证号")+"</center></td>");
	out.println("<td><center>"+rst.getString("书号")+"</center></td>");
	out.println("<td><center>"+rst.getString("借阅日期")+"</center></td>");
	out.println("<td><center>"+rst.getString("应还日期")+"</center></td>");
	out.println("<td><center>"+rst.getString("状态")+"</center></td>");
	out.println("</tr>");
}
rst.close();
stmt.close();
con.close();
%>
</table>
<h1>还书情况</h1>
<table border=3>
				<tr><td width=120><b><center>图书证号</td>
				<td width=120><b><center>书号</td>
				<td width=120><b><center>还书日期</td>
				</tr>
				<%
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con1=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","1505010604");
Statement stmt1=con1.createStatement();
ResultSet rst1=stmt1.executeQuery("select * from repaybook");
while(rst1.next()){
	out.println("<tr>");
	out.println("<td><center>"+rst1.getString("图书证号")+"</center></td>");
	out.println("<td><center>"+rst1.getString("书号")+"</center></td>");
	out.println("<td><center>"+rst1.getString("还书日期")+"</center></td>");
	out.println("</tr>");
}
rst1.close();
stmt1.close();
con1.close();
%>
</table>
<h1>查看留言</h1>
<table border=3>
				<tr><td width=120><b><center>图书证号</td>
				<td width=120><b><center>留言内容</td>
				<td width=120><b><center>时间</td>
</tr>
<%
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con2=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","1505010604");
Statement stmt2=con2.createStatement();
ResultSet rst2=stmt2.executeQuery("select * from message");
while(rst2.next()){
	out.println("<tr>");
	out.println("<td><center>"+rst2.getString("图书证号")+"</center></td>");
	out.println("<td><center>"+rst2.getString("content")+"</center></td>");
	out.println("<td><center>"+rst2.getString("time")+"</center></td>");
	out.println("</tr>");
}
rst2.close();
stmt2.close();
con2.close();
%>
</table>
<h1>公告区</h1>
<form name="form8" action="AddNotice" method="post">
<table><h1>
	<tr>
		<td>请输入工号：
		<td bgcolor="blue"><input name="图书证号" type="text">
	<tr>
		<td>请输入公告内容：
		<td bgcolor="blue"><input name="notices" type="text">
	<tr>
		</h1></table><br>
<input type="submit" value="发布">
</form>

</body>
</html>