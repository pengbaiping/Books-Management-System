package register.dao;
import register.model.Reader;
public interface ReaderDAO {
	public void saveReader(Reader reader);//��Ӷ���
	public void updateReader(Reader reader);
	public String validate(String ͼ��֤��,String ��¼����);
}
