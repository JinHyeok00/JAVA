package bank;

import java.util.Random;
import java.util.Scanner;

public class Atm {
	
	public Atm() {
		int choice = 0;
		int choiceBank = 0;
		
		Scanner sc =new Scanner(System.in);
		
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		while(true) {
			System.out.println("사용할 은행 ATM기를 선택해주세요");
			showBank();
			choiceBank =Integer.parseInt(sc.nextLine());
			showMainMenu();
			choice = Integer.parseInt(sc.nextLine());
			if(choice ==1) {
				logine(arrBank,arCount);
			}
			else if(choice == 2) {
				makeAccount(arrBank, arCount);
			}
			else if(choice == 3) {
				findAccountNum(arrBank, arCount);
			}
			else if(choice == 4) {
				deposit(arrBank,arCount,choiceBank);
			}
			else if(choice == 5) {
				System.out.println("서비스를 종료합니다");
				break;
			}
			else {
				System.out.println("다시입력하세요");
			}
		}
	}
	
	
	void showBank() {
		System.out.println("1. 신한은행");
		System.out.println("2. 카카오은행");
		System.out.println("3. 국민은행");
	}
	
	void showMainMenu(){
		System.out.println("1. 로그인");
		System.out.println("2. 계좌개설");
		System.out.println("3. 계좌번호 찾기");
		System.out.println("4. 입금하기");
		System.out.println("5. 종료");
		System.out.print("사용할 서비스를 선택하세요>>");
	}
	
	void showLoginMenu() {
		System.out.println("1. 출금하기");
		System.out.println("2. 잔액조회");
		System.out.println("3. 로그아웃");
		System.out.print("사용할 서비스를 선택하세요>>");
	}
	
	void logine(Bank[][] arrBank,int[] arCount) {
		Scanner sc =new Scanner(System.in);
		int accountNum = 0;
		int password = 0;
		boolean flag = false;
		int bankNum =0;
		int customerNum = 0;
		int choice = 0;
		int money = 0;
		while(true) {
			if(arCount[0]==0&&arCount[1]==0&&arCount[2]==0) {
				System.out.println("계좌를 먼저 개설해야 합니다");
				break;
			}
			System.out.println("로그인하기");
			System.out.println("계좌번호를 입력하세요");
			accountNum = Integer.parseInt(sc.nextLine());
			System.out.println("비밀번호를 입력하세요");
			password = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < arrBank.length; i++) {
				for (int j = 0; j < arCount[i]; j++) {
					if(Bank.login(arrBank[i][j].accountNum, arrBank[i][j].password, accountNum, password)) {
						bankNum = i;
						customerNum = j;
						flag = true;
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			if(flag) {
				System.out.println("로그인 성공");
				while(true) {
					showLoginMenu();
					choice = Integer.parseInt(sc.nextLine());
					if(choice == 3) {
						break;
					}
					else if(choice == 1) {
						System.out.println("출금하기");
						System.out.print("출금할 금액을 입력하세요>>");
						money = Integer.parseInt(sc.nextLine());
						if(arrBank[bankNum][customerNum].withdraw(money)) {
							System.out.println("출금성공");
						}
						else {
							System.out.println(money+"보다 잔액이 적습니다");
						}
					}
					else if(choice == 2) {
						System.out.println(arrBank[bankNum][customerNum].name
								+"님의 계좌" + arrBank[bankNum][customerNum].accountNum
								+"의 잔액은" +arrBank[bankNum][customerNum].balanceCheck()
								+"원입니다"
								);
					}
					else {
						System.out.println("다시 입력하세요");
					}
				}
				break;
			}
			System.out.println("로그인 실패");
		}
	}
	
	
	
	
	void makeAccount(Bank[][] arrBank, int[] arCount) {
		Scanner sc =new Scanner(System.in);
		Random rand = new Random();
		
		int bankNum = 0;
		String name = null;
		String phoneNum = "";
		int password = 0;
		int accountNum = 0;
		int balance =0;
		boolean flag = false;
		
		System.out.println("개설할 계좌의 은행명을 입력하세요");
		showBank();
		System.out.print(">>");
		bankNum = Integer.parseInt(sc.nextLine());
		if(arCount[bankNum-1] >=100) {
			System.out.println("해당 은행은 계좌 개설이 불가능 합니다");
			return;
		}
		System.out.print("이름을 입력하세요>>");
		name = sc.nextLine();
		System.out.print("전화번호를 입력하세요>>");
		System.out.print("010");		
		while(true) {
			flag = false;
			phoneNum = sc.nextLine();
			phoneNum = "010"+ phoneNum;
			for (int i = 0; i < arrBank.length; i++) {
				for (int j = 0; j < arCount[i]; j++) {
					if(Bank.samePhoneCheck(arrBank[i][j].phoneNum, phoneNum)) {
						flag = Bank.samePhoneCheck(arrBank[i][j].phoneNum, phoneNum);
						break;
					}
				}
				if(flag) {
					System.out.println("이미 등록된 전화번호 입니다.");
					System.out.print("다시 입력하세요>>010");
					break;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.print("비밀번호를 입력하세요>>");
		while(true) {
			password = Integer.parseInt(sc.nextLine());
			if(password>=1000 && password<10000) {
				break;
			}
			System.out.print("다시입력하세요>>");
		}
		while(true) {
			accountNum = rand.nextInt(900000)+100000;
			for (int i = 0; i < arrBank.length; i++) {
				
				for (int j = 0; j < arCount[i]; j++) {
					if(Bank.sameAccountCheck(arrBank[i][j].accountNum, accountNum)) {
						flag = Bank.sameAccountCheck(arrBank[i][j].accountNum, accountNum);
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			if(!flag) {
				break;
			}
			accountNum =0;
		}
		System.out.println("발급된 계좌번호는"+accountNum+"입니다");
		balance += 10000;
		System.out.println("계좌생성 축하금액 10000원 입금되었습니다");
		if(bankNum -1 ==0) {
			arrBank[bankNum-1][arCount[bankNum-1]] = new Shinhan(name, accountNum, phoneNum, password, balance);
		}
		else if(bankNum -1 ==1) {
			arrBank[bankNum-1][arCount[bankNum-1]] = new Kakao(name, accountNum, phoneNum, password, balance);
		}
		else if(bankNum -1 ==2) {
			arrBank[bankNum-1][arCount[bankNum-1]] = new Kookmin(name, accountNum, phoneNum, password, balance);
		}
		arCount[bankNum-1]++;
		System.out.println("계좌생성 완료되었습니다");
	}
	
	
	
	public void findAccountNum(Bank[][] arrBank, int[] arCount) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int bankNum =0;
		int customerNum = 0;
		int accountNum = 0;
		String phoneNum = "";
		boolean flag = false;
		
		System.out.println("계좌번호 찾기");
		while(true) {
			flag = false;
			System.out.print("휴대폰번호를 입력해주세요 >>");
			System.out.print("010");
			phoneNum = sc.nextLine();
			phoneNum = "010"+ phoneNum;
			for (int i = 0; i < arrBank.length; i++) {
				for (int j = 0; j < arCount[i]; j++) {
					if(Bank.samePhoneCheck(arrBank[i][j].phoneNum, phoneNum)) {
						bankNum = i;
						customerNum = j;
						flag = Bank.samePhoneCheck(arrBank[i][j].phoneNum, phoneNum);
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			if(flag) {
				break;
			}
			System.out.println("해당되는 계좌가 없습니다 다시입력해주세요");
		}
		flag = false;
		while(true) {
			accountNum = rand.nextInt(900000)+100000;
			for (int i = 0; i < arrBank.length; i++) {
				
				for (int j = 0; j < arCount[i]; j++) {
					if(Bank.sameAccountCheck(arrBank[i][j].accountNum, accountNum)) {
						flag = Bank.sameAccountCheck(arrBank[i][j].accountNum, accountNum);
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			if(!flag) {
				break;
			}
			accountNum =0;
		}
		arrBank[bankNum][customerNum].accountNum =accountNum;
		System.out.println(arrBank[bankNum][customerNum].name+"님 계좌번호를 재발급 해드리겠습니다");
		System.out.println("계좌번호는"+arrBank[bankNum][customerNum].accountNum+"입니다");
	}
	
	public void deposit(Bank[][] arrBank, int[] arCount, int choiceBank) {
		Scanner sc = new Scanner(System.in);
		int money=0;
		int accountNum = 0;
		int bankNum = 0;
		int customerNum = 0;
		boolean flag = false;
		
		System.out.println("입금하기");
		while(true) {
			flag = false;
			System.out.print("입금할 계좌의 계좌번호를 입력하세요 >>");
			accountNum = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < arrBank.length; i++) {
				for (int j = 0; j < arCount[i]; j++) {
					if(Bank.sameAccountCheck(arrBank[i][j].accountNum, accountNum)) {
						bankNum = i;
						customerNum = j;
						flag = Bank.sameAccountCheck(arrBank[i][j].accountNum, accountNum);
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			if(flag) {
				break;
			}
			System.out.println("해당되는 계좌가 없습니다 다시입력해주세요");
		}
		if(choiceBank-1==bankNum) {
			System.out.println("입금할 금액을 입력하세요");
			money = Integer.parseInt(sc.nextLine());
			arrBank[bankNum][customerNum].deposit(money);
			System.out.println("입금 완료 되었습니다");
		}
		else {
			System.out.println("입금은 계좌와 같은 은행의 ATM기에서만 가능합니다");
		}
		
	}
}
