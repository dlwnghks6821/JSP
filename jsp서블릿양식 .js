package Web01;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class AdittionServlet
 */
@WebServlet("/AdittionServlet")
public class AdittionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdittionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //doget�� ���ϰ��̾��� (void�̱⶧��)//
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//�̷��Ѱ��� Get ����̴�//
		int num1 = 20;
		int num2 = 10;
		int add = num1+num2;
		//�ڹٿ��� �ڵ��ѳ����� ���������� ����ϱ����� Ű����
		PrintWriter out=response.getWriter();
		//���������� �̷��� ������ �����ش�.//
		
		out.println("<html><head><title>Addition</title></head>");
		out.println("<body>");
		out.println(add);
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}