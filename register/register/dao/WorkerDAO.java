package register.dao;
import register.model.Borrow;
import register.model.Repay;
import register.model.Worker;
public interface WorkerDAO {
	public void updateWorker(Worker worker);
	public void saveBorrow(Borrow borrow);
	public void saveRepay(Repay repay);
	public void saveNotices(Worker worker);
	public String validate(String π§∫≈,String √‹¬Î);
}
