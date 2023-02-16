package 과제.과제7.model;

public class Member {
	// 필드
	public int num;
	public String password;
	public String name;
	public int balance;
	
	
	// 생성자
	public Member() {}
	public Member(int num, String password, String name, int balance) {
		this.num = num;
		this.password = password;
		this.name = name;
		this.balance = balance;
	}
	
	// 메소드
	@Override
	public String toString() {
		return "Member [num=" + num + ", password=" + password + ", name=" + name + ", balance=" + balance + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	} 
}
