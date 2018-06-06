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
		//从视图index.jsp读取请求参数
		Reader reader=new Reader();
		ReaderDAO readerDAO=new ReaderDAOImpl();
		if(request.getParameter("newpassword1").equals(request.getParameter("newpassword2"))&&request.getParameter("newpassword1")!=""&&request.getParameter("newpassword2")!=""&&request.getParameter("图书证号")!="") {
			reader.set图书证号(request.getParameter("图书证号"));
			reader.set登录密码(request.getParameter("newpassword1"));
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
