package register.model;

public class Borrow {
	private String 图书证号;
	private String 书号;
	private String 借阅日期;
	private String 应还日期;
	private String 状态;
	public String get图书证号() {
		return 图书证号;
	}
	public void set图书证号(String 图书证号) {
		this.图书证号 = 图书证号;
	}
	public String get书号() {
		return 书号;
	}
	public void set书号(String 书号) {
		this.书号 = 书号;
	}
	public String get借阅日期() {
		return 借阅日期;
	}
	public void set借阅日期(String 借阅日期) {
		this.借阅日期 = 借阅日期;
	}
	public String get应还日期() {
		return 应还日期;
	}
	public void set应还日期(String 应还日期) {
		this.应还日期 = 应还日期;
	}
	public String get状态() {
		return 状态;
	}
	public void set状态(String 状态) {
		this.状态 = 状态;
	}
	public String toString(){
		return "图书证号:"+get图书证号()+"<br>书号"+get书号()+"<br>借阅日期"+get借阅日期()+"<br>应还日期"+get应还日期()+"<br>状态"+get状态();
	}
}
