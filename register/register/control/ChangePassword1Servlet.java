package register.control;
import register.dao.WorkerDAOImpl;
import register.dao.WorkerDAO;
import register.model.Worker;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class ChangePassword1Servlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		Worker worker=new Worker();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		if(request.getParameter("newpassword1").equals(request.getParameter("newpassword2"))&&request.getParameter("newpassword1")!=""&&request.getParameter("newpassword2")!=""&&request.getParameter("����")!="") {
			worker.set����(request.getParameter("����"));
			worker.set����(request.getParameter("newpassword1"));
			workerDAO.updateWorker(worker);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("WorkerLogin.jsp");
		requestDispatcher.forward(request, response);
		}
		else {
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("ChangePassword1.jsp");
			requestDispatcher.forward(request, response);
		}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
