package register.control;
import register.dao.WorkerDAOImpl;
import register.dao.WorkerDAO;
import register.model.Worker;
import register.model.Reader;
import register.model.Book;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class AddReplyServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从视图index.jsp读取请求参数
		Reader reader=new Reader();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		reader.set图书证号(request.getParameter("图书证号"));
		reader.setReply(request.getParameter("回复"));
		workerDAO.saveReply(reader);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("Worker.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
