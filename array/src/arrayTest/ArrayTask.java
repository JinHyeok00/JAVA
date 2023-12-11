package arrayTest;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		String[] arButton = { "btn1", "btn2", "btn3", "btn4" };
		String[] arMessage = { "회원가입 성공", "로그인 성공", "한동석(20)", "로그아웃 성공" };
		String[] arError = { "회원가입을 먼저 진행해주세요", "로그인을 먼저 진행해주세요" };
		String errorMessage = "다시 시도해주세요";

		Scanner sc = new Scanner(System.in);
		int choice = 0, previous = 0;

		while (true) {
			for (int i = 0; i < arButton.length; i++) {
				System.out.println(i + 1 + ". " + arButton[i]);
			}

			previous = previous == 0 ? 0 : choice;
			choice = sc.nextInt();
			if (choice < 1 || choice > 4) {
				System.out.println(errorMessage);
				continue;
			}
			if (choice == 4) {
				break;
			}

			if (choice - 1 != previous) {
				previous = 0;
				System.out.println(arError[choice - 2]);
				continue;
			}
			System.out.println(arMessage[choice - 1]);
			previous = choice;
		}
	}
}


//      각 버튼을 눌렀을 때, 이동하는 페이지는 다음과 같다.
//      btn1 : 회원가입 페이지
//      btn2 : 로그인 페이지
//      btn3 : 마이 페이지
//      btn4 : 로그아웃

//      회원가입 -> 로그인 -> 마이 페이지
//      위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누를 경우, 이전 단계에 대한 메세지를 출력해준다.
//      예) 로그인 클릭 시, "회원가입을 먼저 진행해주세요" 출력
//          회원가입에 성공했어도, 로그인을 안하고 마이페이지를 선택하면 메세지는 이전 단계에 대한 메세지가 출력되지만
//         다시 회원가입부터 진행해야 한다.

//      알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//      예)		회원가입 클릭 시, 회원가입 성공
//				로그인 클릭 시 , 로그인 성공
//				마이 페이지 클릭 시, 본인 이름과 나이 출력

//	    Scanner sc = new Scanner(System.in);
//	    int btn = 0, progress = 0, age =0;
//	    String name = null;
//	    String[] level = new String[4];
//	    level[0] = "회원가입";
//	    level[1] = "로그인";
//	    level[2] = "마이페이지";
//	    level[3] = "로그아웃";
//	    progress = 1;
//	    while(true) {
//		    if(progress == 5) {
//		    	break;
//		    }
//		    for (int i = 0; i < level.length; i++) {
//				System.out.println(i+1 +". " + level[i]);
//			}
//		    System.out.print("입력: " );
//		    btn = sc.nextInt();
//		    switch (btn) {
//			case 1:
//				System.out.println("나이를 입력해주세요");
//				age = sc.nextInt();
//				sc.nextLine();
//				System.out.println("이름을 입력해주세요");
//				name = sc.nextLine();
//				System.out.println(level[btn-1]+ "성공");
//				progress = 2;
//				break;
//			case 2:
//				if(progress == 2) {
//					System.out.println(level[btn-1]+ "성공");
//					progress = 3;
//				}
//				else {
//					System.out.println(level[progress-1]+"를 먼저 진행해주세요");
//					progress =1;
//				}
//				break;
//			case 3:
//				if(progress == 3) {
//					System.out.println(level[btn-1]+ "성공");
//					System.out.println("나이: " + age);
//					System.out.println("이름: " + name);
//					progress = 4;
//				}
//				else {
//					System.out.println(level[progress-1]+"를 먼저 진행해주세요");
//					progress =1;
//				}
//				break;
//			case 4:
//				if(progress == 4) {
//					System.out.println(level[btn-1]+ "성공");
//					progress = 5;
//				}
//				else {
//					System.out.println(level[progress-1]+"를 먼저 진행해주세요");
//					progress =1;
//				}
//				break;
//			default:
//				System.out.println("다시입력해주세요");
//				progress =1;
//				break;
//		
//			}
//	    }
