package register.control;
import register.dao.AdminDAOImpl;
import register.dao.AdminDAO;
import register.model.Admin;
import register.model.Worker;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class AddWorkerServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		Worker worker=new Worker();
		AdminDAO adminDAO=new AdminDAOImpl();
		worker.set����(request.getParameter("����"));
		worker.set����(request.getParameter("����"));
		worker.set��ɫ("������Ա");
		adminDAO.saveWorker(worker);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("Admin.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
