
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1</title>
</head>
<body>
<%
 	pageContext.setAttribute("name","page man");//name �̶�� ������ page man�� ����//
 	request.setAttribute("name","request man");
 	session.setAttribute("name","session man");
 	application.setAttribute("name","application man");
	System.out.println("FirstPage.jsp");
	System.out.println("�ϳ��� ������ �Ӽ�["+pageContext.getAttribute("name")+"]");
	System.out.println("�ϳ��� ������Ʈ �Ӽ�["+request.getAttribute("name")+"]");
	System.out.println("�ϳ��� ���� �Ӽ�["+session.getAttribute("name")+"]");
	System.out.println("�ϳ��� ���ø����̼� �Ӽ�["+application.getAttribute("name")+"]");
	
	request.getRequestDispatcher("secondPage.jsp").forward(request,response);//post ��� �ٿ�����//
	
	
%>

</body>
</html>