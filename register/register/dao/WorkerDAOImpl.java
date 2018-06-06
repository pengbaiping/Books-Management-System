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
			stmt=con.prepareStatement("update worker set 密码=?where 工号="+worker.get工号()+"");
			stmt.setString(1,worker.get密码());
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
	public String validate(String 工号, String 密码) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String role="";
		try{
			con=getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from worker where 工号='"+工号+"'and 密码='"+密码+"'");
			if(rs.next()){
				role=rs.getString("角色");
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
			stmt1=con.prepareStatement("insert into borrowbook(图书证号,书号,借阅日期,应还日期,状态)values(?,?,?,?,?)");
			stmt2=con.prepareStatement("update book set 是否借出='是' where 书号="+borrow.get书号()+"");
			stmt1.setString(1,borrow.get图书证号());
			stmt1.setString(2,borrow.get书号());
			stmt1.setString(3,borrow.get借阅日期());
			stmt1.setString(4,borrow.get应还日期());
			stmt1.setString(5,"未还");
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
			stmt1=con.prepareStatement("insert into repaybook(图书证号,书号,还书日期)values(?,?,?)");
			stmt2=con.prepareStatement("update borrowbook set 状态='已还' where 图书证号='"+repay.get图书证号()+"'and 书号='"+repay.get书号()+"'");
			stmt3=con.prepareStatement("update book set 是否借出='否' where 书号='"+repay.get书号()+"'");
			stmt1.setString(1,repay.get图书证号());
			stmt1.setString(2,repay.get书号());
			stmt1.setString(3,repay.get还书日期());
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
			stmt=con.prepareStatement("insert into notice(工号,notices,createtime)values(?,?,CURRENT_TIMESTAMP)");
			stmt.setString(1,worker.get工号());
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
			stmt=con.prepareStatement("update message set 回复=?where 图书证号="+reader.get图书证号()+"");
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