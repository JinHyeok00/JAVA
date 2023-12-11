package bank;

public class Shinhan extends Bank{
	
	public Shinhan(String name, int accountNum, String phoneNum, int password, int balance) {
		super(name,accountNum,phoneNum,password,balance);
	}
	@Override
	void deposit(int money) {
		balance += money/2;
	}
}
