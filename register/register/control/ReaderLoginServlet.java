package register.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import register.dao.ReaderDAO;
import register.dao.ReaderDAOImpl;

public class ReaderLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		String ͼ��֤�� = request.getParameter("ͼ��֤��");
		String ��¼���� = request.getParameter("��¼����");
		String role;
		String goForward;
		ReaderDAO readerDAO = new ReaderDAOImpl();
		role = readerDAO.validate(ͼ��֤��,��¼����);
		if(role.equals("����")) {
		goForward = "Reader.jsp";
		}
		else {
			goForward="ReaderLogin.jsp";
		}
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher(goForward);
		requestDispatcher.forward(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}