<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>�������� ���</title>
</head>
<style>
b {
   font-size:16pt;
}
</style>
<body>
<h2>�������� ���</h2>
<%
   request.setCharacterEncoding("utf-8");
   String username=request.getParameter("username");
   String gender=request.getParameter("gender");
   String[] season=request.getParameterValues("season");
%>
<table>
<tr><td>�̸�</td><td><%=username %></td></tr>
<tr><td>����</td><td><%=gender %></td></tr>
<tr><td>����</td><td>
<%
   for(int i=0;i<season.length;i++){
      out.println(season[i]);
   }
%>
</td></tr>
<tr>
<td colspan=2 align=center><a href="javascript:history.go(-1)">�ڷ� �ٽ�</a></td>
</tr>
</table>
</body>
</html>