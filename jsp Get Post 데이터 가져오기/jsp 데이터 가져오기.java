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
			String userid=request.getParameter("userid");
			String userpwd=request.getParameter("passwd1");
			String userpwd2=request.getParameter("passwd2");
			String username=request.getParameter("username");
			String userbirth=request.getParameter("birth");
			String gender=request.getParameter("gender");
			String usermobile=request.getParameter("mobile");
			String []selArea=request.getParameterValues("selArea");
			String []interest=request.getParameterValues("interest");
			
		//������ư ���� ó���Ҷ� //
		//String gender=request.getParameter("gender");
		//textarea �϶� ����������//
		//String addr=request.getParameter("txtaddr");
		PrintWriter out=response.getWriter();
		out.println("userid["+userid+"]");
		out.println("userpwd["+userpwd+"]");
		out.println("userpwd2["+userpwd2+"]");
		out.println("userpwd2["+userpwd2+"]");
		out.println("userbirth["+userbirth+"]");
		out.println("gender["+gender+"]");
		out.println("usermobile["+usermobile+"]");
		for(int i = 0 ; i<selArea.length;i++) {
			out.println("selArea["+selArea[i]+"]<br>");
			}
		for(int i = 0 ; i<interest.length;i++) {
			out.println("interest["+interest[i]+"]<br>");
			}
		
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
		//Ŭ���̾�Ʈ�� �����͸� ������ �� �غ��ؾ��Ѵ�/
		PrintWriter out=response.getWriter();
	   
		//�����͸� �޾Ƶ��϶�//
		//�׻� ���ڿ��� �����Ѵ�//
		//����Ҷ��� parseInt�� ����ȯ�����ش�//
		String[]userid=request.getParameterValues("userid");
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
