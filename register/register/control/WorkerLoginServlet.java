package register.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import register.dao.WorkerDAO;
import register.dao.WorkerDAOImpl;

public class WorkerLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		String ���� = request.getParameter("����");
		String ���� = request.getParameter("����");
		String role;
		String goForward;
		WorkerDAO workerDAO = new WorkerDAOImpl();
		role = workerDAO.validate(����,����);
		if(role.equals("������Ա")) {
		goForward = "Worker.jsp";
		}
		else {
			goForward="WorkerLogin.jsp";
		}
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher(goForward);
		requestDispatcher.forward(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}