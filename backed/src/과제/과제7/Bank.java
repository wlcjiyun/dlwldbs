package 과제.과제7;
/*
	[상위클래스] 계좌 클래스를 만든다.
	필드 : 계좌번호[ 은행코드-난수2자리-난수2자리 ] , 계좌비밀번호[4자리] , 계좌주 , 잔금 [초기 0원 ]
	메소드 : 
		계좌생성()	: 
			1. 3개 은행중 선택를 받는다. 선택한 은행으로 계좌를 생성한다.
			2. 비밀번호와 계좌주 입력받고 계좌번호는 자동생성 , 예금액은 0 으로 계좌를 생성한다.
		예금() : 해당 계좌번호와 예금액을 입력받아 해당 계좌번호에 금액을 더해준다.
*/
public class Bank {
	public int account; 		// 계좌번화
	public int bankpassword;	// 비밀번호	
	public String name;			// 예금주
	public int balance;			// 잔금
	
	public Bank() {}
	
	public Bank(int account, int bankpassword, String name, int balance) {
		this.account = account;
		this.bankpassword = bankpassword;
		this.name = name;
		this.balance = balance;
	}

	//----------------------------------------------------------------------------
	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getBankpassword() {
		return bankpassword;
	}

	public void setBankpassword(int bankpassword) {
		this.bankpassword = bankpassword;
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
