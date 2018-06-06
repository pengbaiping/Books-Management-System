package register.control;
import register.dao.AdminDAOImpl;
import register.dao.AdminDAO;
import register.model.Book;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class DeleteBookServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
			Book book=new Book();
			AdminDAO adminDAO=new AdminDAOImpl();
			book.set���(request.getParameter("���"));
			adminDAO.deleteBook(book);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("Admin.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
