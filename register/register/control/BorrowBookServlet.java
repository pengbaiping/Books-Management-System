package register.control;
import register.dao.WorkerDAOImpl;
import register.dao.WorkerDAO;
import register.model.Worker;
import register.model.Book;
import register.model.Borrow;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class BorrowBookServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		Borrow borrow=new Borrow();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		borrow.setͼ��֤��(request.getParameter("ͼ��֤��"));
		borrow.set���(request.getParameter("���"));
		borrow.set��������(request.getParameter("��������"));
		borrow.setӦ������(request.getParameter("Ӧ������"));
		workerDAO.saveBorrow(borrow);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("Worker.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
