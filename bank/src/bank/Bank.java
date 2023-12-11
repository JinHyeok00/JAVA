package bank;

public class Bank {
	String name;
	int accountNum;
	String phoneNum;
	int password;
	int balance;
	
	public Bank() {;}
	
	public Bank(String name, int accountNum, String phoneNum, int password, int balance) {
		super();
		this.name = name;
		this.accountNum = accountNum;
		this.phoneNum = phoneNum;
		this.password = password;
		this.balance = balance;
	}


	//	게좌번호 중복검사
	static boolean sameAccountCheck(int accountNum, int checkAccountNum) {
		if(accountNum == checkAccountNum) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	핸드폰번호 중복검사
	static boolean samePhoneCheck(String phoneNum, String checkPhoneNum) {
		if(checkPhoneNum.equals(phoneNum)) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	로그인
	static boolean login(int accountNum, int password,int checkAccountNum,int checkPassword) {
		if(!(accountNum == checkAccountNum)) {
			return false;
		}
		else {
			if(!(password == checkPassword)) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
//	입금
	void deposit(int money) {
		balance += money;
	}
//	출금
	boolean withdraw(int money) {
		if(balance>money) {
			balance -=money;
			return true;
		}
		return false;
	}
//	잔액조회
	int balanceCheck() {
		return balance;
	}
}
