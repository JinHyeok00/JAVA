package bank;

public class Kakao extends Bank{
	
	public Kakao(String name, int accountNum, String phoneNum, int password, int balance) {
		super(name,accountNum,phoneNum,password,balance);
	}
	@Override
	int balanceCheck() {
		balance = balance/2;
		return balance;
	}
}
