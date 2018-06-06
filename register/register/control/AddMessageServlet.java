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
		//从视图index.jsp读取请求参数
		Reader reader=new Reader();
		ReaderDAO readerDAO=new ReaderDAOImpl();
		reader.set图书证号(request.getParameter("图书证号"));
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
