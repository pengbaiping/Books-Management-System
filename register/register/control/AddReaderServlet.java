package register.control;
import register.dao.AdminDAOImpl;
import register.dao.AdminDAO;
import register.model.Admin;
import register.model.Reader;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class AddReaderServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		Reader reader=new Reader();
		AdminDAO adminDAO=new AdminDAOImpl();
		reader.setͼ��֤��(request.getParameter("ͼ��֤��"));
		reader.set��¼����(request.getParameter("��¼����"));
		reader.set����(request.getParameter("����"));
		reader.setԺϵ(request.getParameter("Ժϵ"));
		reader.set�༶(request.getParameter("�༶"));
		reader.set��ɫ("����");
		adminDAO.saveReader(reader);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("Admin.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
