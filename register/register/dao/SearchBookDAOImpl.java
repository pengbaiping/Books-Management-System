package register.dao;
import java.sql.*;
import java.util.*;
import register.model.Book;

public class SearchBookDAOImpl implements SearchBookDAO {
	private String dbClassName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/bms";
	private String dbUser="root";
	private String dbPwd="1505010604";
	public SearchBookDAOImpl(){

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
	public Book listBookBy����(String ����) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			stmt=con.prepareStatement("select * from myuser where ����="+����+"");
			rs=stmt.executeQuery();
			if(rs.next()){
				book.set���(rs.getString(1));
				book.set����(rs.getString(2));
				book.set����(rs.getString(3));
				book.set������(rs.getString(4));
				book.set���ʱ��(rs.getString(5));
				book.set�Ƿ���(rs.getString(6));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		return book;
	}
	@Override
	public Book listBookBy����(String ����) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			stmt=con.prepareStatement("select * from myuser where ����="+����+"");
			rs=stmt.executeQuery();
			if(rs.next()){
				book.set���(rs.getString(1));
				book.set����(rs.getString(2));
				book.set����(rs.getString(3));
				book.set������(rs.getString(4));
				book.set���ʱ��(rs.getString(5));
				book.set�Ƿ���(rs.getString(6));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		return book;
	}
	@Override
	public Book listBookBy������(String ������) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			stmt=con.prepareStatement("select * from myuser where ������="+������+"");
			rs=stmt.executeQuery();
			if(rs.next()){
				book.set���(rs.getString(1));
				book.set����(rs.getString(2));
				book.set����(rs.getString(3));
				book.set������(rs.getString(4));
				book.set���ʱ��(rs.getString(5));
				book.set�Ƿ���(rs.getString(6));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		return book;
	}
	@Override
	public Book listBookBy���ʱ��(String ���ʱ��) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			stmt=con.prepareStatement("select * from myuser where ���ʱ��="+���ʱ��+"");
			rs=stmt.executeQuery();
			if(rs.next()){
				book.set���(rs.getString(1));
				book.set����(rs.getString(2));
				book.set����(rs.getString(3));
				book.set������(rs.getString(4));
				book.set���ʱ��(rs.getString(5));
				book.set�Ƿ���(rs.getString(6));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		return book;
	}
}
