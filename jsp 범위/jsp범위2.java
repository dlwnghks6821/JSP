<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2</title>
</head>
<body>
�ϳ��� ������ �Ӽ�:<%=pageContext.getAttribute("name") %><br>
�ϳ��� request �Ӽ�:<%=request.getAttribute("name") %><br>
�ϳ��� session �Ӽ�:<%=session.getAttribute("name") %><br>
�ϳ��� application �Ӽ�:<%=application.getAttribute("name") %><br><br>
<a href="thirdPage.jsp">����° ������</a>

</body>
</html>