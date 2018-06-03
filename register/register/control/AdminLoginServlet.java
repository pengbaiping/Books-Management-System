package register.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import register.dao.AdminDAO;
import register.dao.AdminDAOImpl;

public class AdminLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����ͼindex.jsp��ȡ�������
		String �û��� = request.getParameter("�û���");
		String �������� = request.getParameter("��������");
		String role;
		String goForward;
		AdminDAO adminDAO = new AdminDAOImpl();
		role = adminDAO.validate(�û���,��������);
		if(role.equals("����Ա")) {
		goForward = "Admin.jsp";
		}
		else {
			goForward="AdminLogin.jsp";
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