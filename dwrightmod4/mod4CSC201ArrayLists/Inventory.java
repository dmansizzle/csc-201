package mod4CSC201ArrayLists;

public class Inventory {
	private int invNum;
	private String desc;
	private int num;
	
	private static int nextNum=100;
	
	public Inventory(int invNum, String desc, int num) {
		super();
		this.invNum = invNum;
		this.desc = desc;
		this.num = num;
	}
	public Inventory() {
		super();
		invNum = nextNum;
		nextNum++;
	}
	
	
	public Inventory(String desc, int num) {
		super();
		this.desc = desc;
		this.num = num;
		invNum = nextNum;
		nextNum++;
	}
	public String toString()
	{
		return "You have " + num + " " + desc + " with inventory # " + invNum;
	}
	
	
	public int getInvNum() {
		return invNum;
	}
	public void setInvNum(int invNum) {
		this.invNum = invNum;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
