package bank;

public class Kookmin extends Bank{
	
	public Kookmin(String name, int accountNum, String phoneNum, int password, int balance) {
		super(name,accountNum,phoneNum,password,balance);
	}
	@Override
	boolean withdraw(int money) {
		if(balance>(money*1.5)) {
			balance -=money*1.5;
			return true;
		}
		return false;
	}
}
