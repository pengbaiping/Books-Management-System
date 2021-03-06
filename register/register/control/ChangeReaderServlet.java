package register.control;
import register.dao.AdminDAOImpl;
import register.dao.AdminDAO;
import register.model.Reader;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class ChangeReaderServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从视图index.jsp读取请求参数
		Reader reader=new Reader();
		AdminDAO adminDAO=new AdminDAOImpl();
			reader.set图书证号(request.getParameter("图书证号"));
			reader.set姓名(request.getParameter("姓名"));
			reader.set院系(request.getParameter("院系"));
			reader.set班级(request.getParameter("班级"));
			adminDAO.updateReader(reader);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("Admin.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
