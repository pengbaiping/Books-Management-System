package register.control;
import register.dao.WorkerDAOImpl;
import register.dao.WorkerDAO;
import register.model.Worker;
import register.model.Book;
import register.model.Borrow;
import register.model.Repay;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class RepayBookServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		Repay repay=new Repay();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		repay.setͼ��֤��(request.getParameter("ͼ��֤��"));
		repay.set���(request.getParameter("���"));
		repay.set��������(request.getParameter("��������"));
		workerDAO.saveRepay(repay);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("Worker.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
