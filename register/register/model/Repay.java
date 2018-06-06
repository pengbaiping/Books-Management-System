package register.model;

public class Repay {
	private String 图书证号;
	private String 书号;
	private String 还书日期;
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
	public String get还书日期() {
		return 还书日期;
	}
	public void set还书日期(String 还书日期) {
		this.还书日期 = 还书日期;
	}
	public String toString(){
		return "图书证号:"+get图书证号()+"<br>书号"+get书号()+"<br>还书日期"+get还书日期();
	}
}
