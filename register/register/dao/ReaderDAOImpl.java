package register.dao;
import java.sql.*;
import java.util.*;
import register.model.Reader;

public class ReaderDAOImpl implements ReaderDAO{
	private String dbClassName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/bms";
	private String dbUser="root";
	private String dbPwd="1505010604";
	public ReaderDAOImpl(){

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
	public void updateReader(Reader reader){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update reader set ��¼����=?where ͼ��֤��="+reader.getͼ��֤��()+"");
			stmt.setString(1,reader.get��¼����());
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
	
	public String validate(String ͼ��֤��,String ��¼����){
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String role="";
		try{
			con=getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from reader where ͼ��֤��='"+ͼ��֤��+"'and ��¼����='"+��¼����+"'");
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

	@Override
	public void saveMessage(Reader reader) {
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("insert into message(ͼ��֤��,content,time)values(?,?,CURRENT_TIMESTAMP)");
			stmt.setString(1,reader.getͼ��֤��());
			stmt.setString(2,reader.getContent());
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