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
		//从视图index.jsp读取请求参数
		Worker worker=new Worker();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		if(request.getParameter("newpassword1").equals(request.getParameter("newpassword2"))&&request.getParameter("newpassword1")!=""&&request.getParameter("newpassword2")!=""&&request.getParameter("工号")!="") {
			worker.set工号(request.getParameter("工号"));
			worker.set密码(request.getParameter("newpassword1"));
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
