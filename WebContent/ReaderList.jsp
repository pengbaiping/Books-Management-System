<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ page import="java.sql.*,java.io.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>ͼ���б�</title>
</head>
<body>
<center><b>������Ϣ���<hr>
		<table border=3>
			<tr><td><b><center>ͼ��֤��</td>
				<td><b><center>��¼����</td>
				<td><b><center>����</td>
				<td><b><center>Ժϵ</td>
				<td><b><center>�༶</td>
			</tr>
		<%
		   Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","1505010604");
Statement stmt=con.createStatement();
ResultSet rst=stmt.executeQuery("select * from reader;");
while(rst.next()){
	out.println("<tr>");
	out.println("<td>"+rst.getString("ͼ��֤��")+"</td>");
	out.println("<td>"+rst.getString("��¼����")+"</td>");
	out.println("<td>"+rst.getString("����")+"</td>");
	out.println("<td>"+rst.getString("Ժϵ")+"</td>");
	out.println("<td>"+rst.getString("�༶")+"</td>");
	out.println("</tr>");
}
rst.close();
stmt.close();
con.close();
%>
</table>
<p><a href="HomePage.jsp">�ص���ҳ</a></p>
</body>
</html>