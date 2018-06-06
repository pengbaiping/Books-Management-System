package register.dao;
import register.model.Borrow;
import register.model.Repay;
import register.model.Worker;
import register.model.Reader;
public interface WorkerDAO {
	public void updateWorker(Worker worker);
	public void saveBorrow(Borrow borrow);
	public void saveRepay(Repay repay);
	public void saveReply(Reader reader);
	public void saveNotices(Worker worker);
	public String validate(String π§∫≈,String √‹¬Î);
}
