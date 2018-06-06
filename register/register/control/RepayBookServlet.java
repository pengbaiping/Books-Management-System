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
		//从视图index.jsp读取请求参数
		Repay repay=new Repay();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		repay.set图书证号(request.getParameter("图书证号"));
		repay.set书号(request.getParameter("书号"));
		repay.set还书日期(request.getParameter("还书日期"));
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
