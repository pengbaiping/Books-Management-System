package register.model;

public class Book {
	private String ���;
	private String ����;
	private String ����;
	private String ������;
	private String ���ʱ��;
	private String �Ƿ���;
	
	public String get���() {
		return ���;
	}
	
	public void set���(String ���) {
		this.��� = ���;
	}
	
	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public String get���ʱ��() {
		return ���ʱ��;
	}

	public void set���ʱ��(String ���ʱ��) {
		this.���ʱ�� = ���ʱ��;
	}

	public String get�Ƿ���() {
		return �Ƿ���;
	}

	public void set�Ƿ���(String �Ƿ���) {
		this.�Ƿ��� = �Ƿ���;
	}
	public String toString(){
		return "���:"+get���()+"<br>����:"+get����()+"<br>����:"+get����()+"<br>������:"+get������()+"<br>���ʱ��:"+get���ʱ��()+"<br>�Ƿ���:"+get�Ƿ���();
	}
}
