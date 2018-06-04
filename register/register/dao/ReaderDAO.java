package register.dao;
import register.model.Reader;
public interface ReaderDAO {
	public void saveReader(Reader reader);//Ìí¼Ó¶ÁÕß
	public void updateReader(Reader reader);
	public String validate(String Í¼ÊéÖ¤ºÅ,String µÇÂ¼ÃÜÂë);
}
