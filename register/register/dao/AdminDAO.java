package register.dao;
import register.model.Admin;
import register.model.Worker;
import register.model.Reader;
import register.model.Book;
public interface AdminDAO {
	public void saveWorker(Worker worker);//��ӹ�����Ա
	public void deleteReader(Reader reader);//ɾ��������Ϣ
	public void saveBook(Book book);//ͼ�����
	public void deleteBook(Book book);//ͼ���¼�
	public void updateBook(Book book);
	public void updateReader(Reader reader);
	public String validate(String �û���,String ��������);
}
