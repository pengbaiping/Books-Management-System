<%@ page language="java" contentType="text/html; charset=gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>��������ѯͼ��</title>
</head>
<body>
<form action="SearchBook" method="post">
	<table>
		<tr>
		<td>������Ҫ��ѯ���ֶ�</td></tr>
		<tr><td><select name="����">
		<option value="����">����</option>
		<option value="����">����</option>
		<option value="������">������</option>
		<option value="���ʱ��">���ʱ��</option>
	</select></td></tr>
		<tr><td><input type="text" name="�ֶ���"></td></tr>
		<tr><td><input type="submit" value="����"></td></tr>
		</table>
		   </form>
		   <h2><font color="blue">${book}</font></h2>
</body>
</html>