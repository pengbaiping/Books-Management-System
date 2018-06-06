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
		//����ͼindex.jsp��ȡ�������
		Worker worker=new Worker();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		worker.set����(request.getParameter("����"));
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
