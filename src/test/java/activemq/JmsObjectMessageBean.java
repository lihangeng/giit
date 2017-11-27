package activemq;

import java.io.Serializable;

public class JmsObjectMessageBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7082509107662382888L;
	
	private String userName;
	private int age = 16;
	private boolean flag = true;

	public JmsObjectMessageBean(String string, int i, boolean b) {
		this.setUserName(string);
		this.setAge(age);
		this.setFlag(b);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
