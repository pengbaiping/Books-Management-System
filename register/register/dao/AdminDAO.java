package register.dao;
import register.model.Admin;
import register.model.Worker;
import register.model.Reader;
import register.model.Book;
public interface AdminDAO {
	public void saveWorker(Worker worker);//添加工作人员
	public void deleteReader(Reader reader);//删除读者信息
	public void saveBook(Book book);//图书入库
	public void deleteBook(Book book);//图书下架
	public void updateBook(Book book);
	public void updateReader(Reader reader);
	public String validate(String 用户名,String 管理密码);
}
