package register.dao;
import register.model.Admin;
import register.model.Worker;
import register.model.Reader;
import register.model.Book;
public interface AdminDAO {
	public void saveWorker(Worker worker);//��ӹ�����Ա
	public void updateAdmin(Admin admin);//������Ϣ
	public void deleteWorker(String ����);//ɾ��������Ա��Ϣ
	public void deleteReader(String ͼ��֤��);//ɾ��������Ϣ
	public void saveBook(Book book);//ͼ�����
	public void updateBook(Book book);//����ͼ����Ϣ
	public void deleteBook(String ���);//ͼ���¼�
	public String validate(String �û���,String ��������);
}
