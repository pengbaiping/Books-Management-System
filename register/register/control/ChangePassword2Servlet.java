package register.control;
import register.dao.ReaderDAOImpl;
import register.dao.ReaderDAO;
import register.model.Reader;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class ChangePassword2Servlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		Reader reader=new Reader();
		ReaderDAO readerDAO=new ReaderDAOImpl();
		if(request.getParameter("newpassword1").equals(request.getParameter("newpassword2"))&&request.getParameter("newpassword1")!=""&&request.getParameter("newpassword2")!=""&&request.getParameter("ͼ��֤��")!="") {
			reader.setͼ��֤��(request.getParameter("ͼ��֤��"));
			reader.set��¼����(request.getParameter("newpassword1"));
			readerDAO.updateReader(reader);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("ReaderLogin.jsp");
		requestDispatcher.forward(request, response);
		}
		else {
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("ChangePassword2.jsp");
			requestDispatcher.forward(request, response);
		}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
