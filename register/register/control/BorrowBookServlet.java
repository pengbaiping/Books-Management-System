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
		//从视图index.jsp读取请求参数
		Borrow borrow=new Borrow();
		WorkerDAO workerDAO=new WorkerDAOImpl();
		borrow.set图书证号(request.getParameter("图书证号"));
		borrow.set书号(request.getParameter("书号"));
		borrow.set借阅日期(request.getParameter("借阅日期"));
		borrow.set应还日期(request.getParameter("应还日期"));
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
