package register.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import register.dao.AdminDAO;
import register.dao.AdminDAOImpl;
import register.dao.SearchBookDAO;
import register.dao.SearchBookDAOImpl;
import register.model.Book;
public class SearchBookServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ����=request.getParameter("����");
		String �ֶ���=request.getParameter("�ֶ���");
		Book book=new Book();
		SearchBookDAO searchbookDAO=new SearchBookDAOImpl();
		if(����.equals("����"))
		{
			
			book=searchbookDAO.listBookBy����(����);
			request.setAttribute("book", book);
		}
		if(����.equals("����"))
		{
			book=searchbookDAO.listBookBy����(����);
			request.setAttribute("book", book);
		}
		if(����.equals("������"))
		{
			book=searchbookDAO.listBookBy������(����);
			request.setAttribute("book", book);
		}
		if(����.equals("���ʱ��"))
		{
			book=searchbookDAO.listBookBy���ʱ��(����);
			request.setAttribute("book", book);
		}
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("SearchBook.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}	
}
