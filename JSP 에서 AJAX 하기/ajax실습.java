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
		//������Ʈ�� �ѱ�ó���Ѵ�//
		request.setCharacterEncoding("utf-8");
		//�������°͵� �ѱ�ó�����ش�//
		response.setContentType("text/html; charset=utf-8");
		//html �� input ������ ���⿡ ���޵ȴ�//
		//getParameter (html�� �������� �޴´�)//
		//�������� ������������//
		//������ ���� �����ö� �迭�� ���� �����´�//
		//��뿹�� ==>check box ���� ������ ���� ������//
		//�������� �ϰ������ getParameterValues�� ����//
		//selectbox�� multiple �� ����� getParameter�� ���� �ϳ��ۿ� �������ʴ´�//
		//select ==> �ܵ� ���� �̸� ==>getParameter()//
		//multiple selection ==> getParameterValues()���//
		//;
			
		//������ư ���� ó���Ҷ� //
		//String gender=request.getParameter("gender");
		//textarea �϶� ����������//
		//String addr=request.getParameter("txtaddr");
		PrintWriter out=response.getWriter();
		
		
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
		//Ŭ���̾�Ʈ�� �����͸� ������ �� �غ��ؾ��Ѵ�/
		PrintWriter out=response.getWriter();
	   
		//�����͸� �޾Ƶ��϶�//
		//�׻� ���ڿ��� �����Ѵ�//
		//����Ҷ��� parseInt�� ����ȯ�����ش�//
		String userid=request.getParameter("userid");
		
		String passwd= request.getParameter("passwd");
		//�޾Ƽ� ���//
		//out.println("<h1>post������� ó���Ǿ����ϴ�.</h1>");
		
		
		out.println(userid+","+passwd);
		
		//����ϸ� �ݾ��־���Ѵ�;
		out.close();
	}
