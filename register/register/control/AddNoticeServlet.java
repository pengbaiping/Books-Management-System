package register.control;
import register.dao.WorkerDAOImpl;
import register.dao.WorkerDAO;
import register.model.Worker;
import register.model.Book;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class AddNoticeServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从视图index.jsp读取请求参数
		Worker worker=new Worker();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		worker.set工号(request.getParameter("工号"));
		worker.setNotices(request.getParameter("notices"));
		workerDAO.saveNotices(worker);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("HomePage.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
