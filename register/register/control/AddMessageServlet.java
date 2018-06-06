package register.control;
import register.dao.ReaderDAOImpl;
import register.dao.ReaderDAO;
import register.model.Reader;
import register.model.Book;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class AddMessageServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		Reader reader=new Reader();
		ReaderDAO readerDAO=new ReaderDAOImpl();
		reader.setͼ��֤��(request.getParameter("ͼ��֤��"));
		reader.setContent(request.getParameter("message"));
		readerDAO.saveMessage(reader);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("HomePage.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
