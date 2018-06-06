package register.model;

public class Worker {
	private String ¹¤ºÅ;
	private String ÃÜÂë;
	private String ½ÇÉ«;
	private String notices;
	private String createtime;
	public String get¹¤ºÅ() {
		return ¹¤ºÅ;
	}
	public void set¹¤ºÅ(String ¹¤ºÅ) {
		this.¹¤ºÅ = ¹¤ºÅ;
	}
	public String getÃÜÂë() {
		return ÃÜÂë;
	}
	public void setÃÜÂë(String ÃÜÂë) {
		this.ÃÜÂë = ÃÜÂë;
	}
	public String get½ÇÉ«() {
		return ½ÇÉ«;
	}
	public void set½ÇÉ«(String ½ÇÉ«) {
		this.½ÇÉ« = ½ÇÉ«;
	}
	public String getNotices() {
		return notices;
	}
	public void setNotices(String notices) {
		this.notices = notices;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String toString() {
		return "¹¤ºÅ£º"+get¹¤ºÅ()+"<br>ÃÜÂë"+getÃÜÂë()+"<br>½ÇÉ«"+get½ÇÉ«();
	}
}
