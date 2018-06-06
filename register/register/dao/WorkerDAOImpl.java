package register.dao;
import java.sql.*;
import java.util.*;
import register.model.Borrow;
import register.model.Repay;
import register.model.Worker;
import register.model.Reader;

public class WorkerDAOImpl implements WorkerDAO{
	private String dbClassName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/bms";
	private String dbUser="root";
	private String dbPwd="1505010604";
	public WorkerDAOImpl(){

	}

	public Connection getConnection(){
		Connection con=null;
		try{
			Class.forName(dbClassName);
			con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

	

	public void updateWorker(Worker worker){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update worker set ����=?where ����="+worker.get����()+"");
			stmt.setString(1,worker.get����());
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public String validate(String ����, String ����) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String role="";
		try{
			con=getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from worker where ����='"+����+"'and ����='"+����+"'");
			if(rs.next()){
				role=rs.getString("��ɫ");
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return role;
	}
	public void saveBorrow(Borrow borrow) {
		Connection con=null;
		PreparedStatement stmt1=null;
		PreparedStatement stmt2=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt1=con.prepareStatement("insert into borrowbook(ͼ��֤��,���,��������,Ӧ������,״̬)values(?,?,?,?,?)");
			stmt2=con.prepareStatement("update book set �Ƿ���='��' where ���="+borrow.get���()+"");
			stmt1.setString(1,borrow.getͼ��֤��());
			stmt1.setString(2,borrow.get���());
			stmt1.setString(3,borrow.get��������());
			stmt1.setString(4,borrow.getӦ������());
			stmt1.setString(5,"δ��");
			stmt1.execute();
			stmt2.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt1.close();
				//stmt2.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public void saveRepay(Repay repay) {
		Connection con=null;
		PreparedStatement stmt1=null;
		PreparedStatement stmt2=null;
		PreparedStatement stmt3=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt1=con.prepareStatement("insert into repaybook(ͼ��֤��,���,��������)values(?,?,?)");
			stmt2=con.prepareStatement("update borrowbook set ״̬='�ѻ�' where ͼ��֤��='"+repay.getͼ��֤��()+"'and ���='"+repay.get���()+"'");
			stmt3=con.prepareStatement("update book set �Ƿ���='��' where ���='"+repay.get���()+"'");
			stmt1.setString(1,repay.getͼ��֤��());
			stmt1.setString(2,repay.get���());
			stmt1.setString(3,repay.get��������());
			stmt1.execute();
			stmt2.execute();
			stmt3.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt1.close();
				//stmt2.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void saveNotices(Worker worker) {
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("insert into notice(����,notices,createtime)values(?,?,CURRENT_TIMESTAMP)");
			stmt.setString(1,worker.get����());
			stmt.setString(2,worker.getNotices());
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public void saveReply(Reader reader) {
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update message set �ظ�=?where ͼ��֤��="+reader.getͼ��֤��()+"");
			stmt.setString(1,reader.getReply());
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}