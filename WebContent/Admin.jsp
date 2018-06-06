<%@page language="java" contentType="text/html;charset=utf-8" %>
<html>
<head>
<meta charset="utf-8">
<title>图书馆系统管理员</title>
</head>
<body>
	<table width="500"height="200"background="file:///D:/Users/pbPeng/eclipse-workspace/Books%20Management%20System/images/Desert.jpg">
  <tbody>
    <tr>
      <td><center>工作人员管理</td>
      <td><center>读者管理</td>
      <td><center>图书管理</td>
      <td><center><a href="HomePage.jsp">退出系统</td>
    </tr>
    <tr>
      <td><center><a href="WorkerList.jsp">浏览员工信息</td>
      <td><center><a href="ReaderList.jsp">浏览读者信息</td>
      <td><center><a href="AddBook.jsp">添加图书</td>
      <td><center></td>
    </tr>
    <tr>
      <td><center><a href="AddWorker.jsp">添加员工</td>
      <td><center><a href="SearchReader.jsp">查询读者信息</td>
      <td><center><a href="DeleteBook.jsp">图书下架</td>
    </tr>
    <tr>
      <td><center><a href="DeleteReader.jsp">删除读者</td>
      <td><center><a href="ChangeReader.jsp">修改信息</td>
      
    </tr>
  </tbody>
</table>
</body>
</html>