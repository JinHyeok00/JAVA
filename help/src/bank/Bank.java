package bank;

public class Bank {
	private String name;			//�̸�
	private String accountNum;		//���¹�ȣ
	private String phoneNum;		//��ȭ��ȣ
	private int password;			//��й�ȣ
	private int balance;			//�ܾ�
	
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
