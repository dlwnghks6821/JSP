package web02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MethodServlet
 */
@WebServlet("/MethodServlet")
public class MethodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MethodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//http servlet request ��? 
		//client �κ��� �� �����Ͱ� ���ԵǾ��ִ� ��ü(���ſ�)//
		//httpservletresponse:web browser(client)�� �����͸� ������ ���Ǵ� ��ü�̴�.(��ſ�)//
		response.setContentType("text/html; charset=utf-8");
		//html �� input ������ ���⿡ ���޵ȴ�//
		//getParameter (html�� �������� �޴´�)//
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("password");
		PrintWriter out=response.getWriter();
		//�޾Ƽ� ���//
		out.println("<h1>get������� ó���Ǿ����ϴ�.</h1>");
		out.println("userid["+userid+"]<br>");
		out.println("passwd["+passwd+"]");
		//����ϸ� �ݾ��־���Ѵ�;
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//post����� id ���� �ʿ���� name���� ó������//
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		String first = request.getParameter("first");
		String second= request.getParameter("second");
		//�޾Ƽ� ���//
		out.println("<h1>get������� ó���Ǿ����ϴ�.</h1>");
		//parseInt�� ����ȯ(Ÿ��ĳ����)//
		int n=Integer.parseInt(first);
		int x=Integer.parseInt(second);
		out.println(n*x);
		
		//����ϸ� �ݾ��־���Ѵ�;
		out.close();
	}

}








<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="MethodServlet"> 
  <input type="text" name="userid" id="userid">
  <input type="password" name="passwd" id="passwd">
  <input type="submit" value="�α���">
  
</form>
<br><br>
<form method="post" action="MethodServlet">
<input type="text" name="first" ><br>
<input type="text" name="second" ><br>
 <input type="submit" value="post������� ȣ��">
</form>
</body>
</html>









