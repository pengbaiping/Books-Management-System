package register.dao;
import java.sql.*;
import java.util.*;
import register.model.Admin;
import register.model.Book;
import register.model.Reader;
import register.model.Worker;

public class AdminDAOImpl implements AdminDAO{
	private String dbClassName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/bms";
	private String dbUser="root";
	private String dbPwd="1505010604";
	public AdminDAOImpl(){

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
	@Override
	public String validate(String �û���,String ��������){
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String role="";
		try{
			con=getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from admin where �û���='"+�û���+"'and ��������='"+��������+"'");
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
	
	public void saveReader(Reader reader){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("insert into reader(ͼ��֤��,��¼����,����,Ժϵ,�༶,��ɫ)values(?,?,?,?,?,?)");
			stmt.setString(1,reader.getͼ��֤��());
			stmt.setString(2,reader.get��¼����());
			stmt.setString(3,reader.get����());
			stmt.setString(4,reader.getԺϵ());
			stmt.setString(5,reader.get�༶());
			stmt.setString(6,"����");
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
	public void deleteReader(String ͼ��֤��){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("delete from reader where ͼ��֤��=?");
			stmt.setString(1,ͼ��֤��);
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
	public void saveWorker(Worker worker){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("insert into worker(����,����,��ɫ)values(?,?,?)");
			stmt.setString(1,worker.get����());
			stmt.setString(2,worker.get����());
			stmt.setString(3,"������Ա");
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
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("insert into book(���,����,����,������,���ʱ��,�Ƿ���)values(?,?,?,?,?,?)");
			stmt.setString(1,book.get���());
			stmt.setString(2,book.get����());
			stmt.setString(3,book.get����());
			stmt.setString(4,book.get������());
			stmt.setString(5,book.get���ʱ��());
			stmt.setString(6,book.get�Ƿ���());
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
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("delete from book where ���=?");
			stmt.setString(1,book.get���());
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
	public void updateReader(Reader reader) {
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update reader set ����=?,Ժϵ=?,�༶=?where ͼ��֤��="+reader.getͼ��֤��()+"");
			stmt.setString(1,reader.get����());
			stmt.setString(2,reader.getԺϵ());
			stmt.setString(3,reader.get�༶());
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
	public void updateBook(Book book) {
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update book set ����=?,����=?,������=?,���ʱ��=?where ���="+book.get���()+"");
			stmt.setString(1,book.get����());
			stmt.setString(2,book.get����());
			stmt.setString(3,book.get������());
			stmt.setString(4,book.get���ʱ��());
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
	public void deleteReader(Reader reader) {
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("delete from reader where ͼ��֤��=?");
			stmt.setString(1,reader.getͼ��֤��());
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