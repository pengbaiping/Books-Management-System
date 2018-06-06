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
		//����ͼindex.jsp��ȡ�������
		Reader reader=new Reader();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		reader.setͼ��֤��(request.getParameter("ͼ��֤��"));
		reader.setReply(request.getParameter("�ظ�"));
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
