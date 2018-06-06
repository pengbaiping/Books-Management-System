<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*,java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎使用本系统</title>
</head>
<body>
<h1>欢迎<%=(String)request.getParameter("图书证号")%>使用本系统</h1>
<table width="500"height="200">
  <tbody>
    <tr>
      <td><center><a href="ChangePassword2.jsp">修改密码</td>
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
ResultSet rst=stmt.executeQuery("select * from borrowbook where 图书证号="+request.getParameter("图书证号"));
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
<h1>留言区</h1>
<form name="form7" action="AddMessage" method="post">
<table><h1>
	<tr>
		<td>请输入图书证号：
		<td bgcolor="blue"><input name="图书证号" type="text">
	<tr>
		<td>请输入留言内容：
		<td bgcolor="blue"><input name="message" type="text">
	<tr>
		</h1></table><br>
<input type="submit" value="发布">
</form>
</body>
</html>