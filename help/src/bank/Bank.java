package bank;

public class Bank {
	private String name;			//이름
	private String accountNum;		//계좌번호
	private String phoneNum;		//전화번호
	private int password;			//비밀번호
	private int balance;			//잔액
	
	public Bank() {;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", accountNum=" + accountNum + ", phoneNum=" + phoneNum + ", password=" + password
				+ ", balance=" + balance + "]";
	}

}
