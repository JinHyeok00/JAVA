package arrayListTask.user;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
//	아이디 중복검사
	public static boolean checkId(DBConnecter dbc, User user) {
		return dbc.db.contains(user);		//User의 toString과 equles 재정의로 User만 비교해도 확인가능하다
	}
	
	
//	회원가입
	public static void joinMemberShip(DBConnecter dbc) {	
		Scanner sc = new Scanner(System.in);	//입력받아야 되기 떄문에
		Random rand = new Random();				//인증번호를 생성하기위해
		User user = new User();			//db에 넣을 임시 user타입 생성
		String code = null;				//인증번호
		String passWord = null;			//임시 비밀번호
		
		System.out.println("이름을 입력하세요");
		user.setName(sc.nextLine());		//입력받은 문장을 바로 user의 name으로 넣는다
		while(true) {						// 중복되지 않는 아이디를 입력할때까지 무한반복
			System.out.print("사용할 아이디를 입력하세요: ");		
			user.setId(sc.nextLine());		//입력받은 문장을 바로 user의 id에 넣는다
			if(!checkId(dbc,user)) {		//아이디 중복확인 메소드 사용
				System.out.println("사용가능한 아이디 입니다");	
				break;		//중복되지 않으면 while문 빠져나감
			}
			System.out.println("이미 있는 아이디 입니다");		//if문에서 나오면 아이디가 중복 된것
		}
		while(true) {									//비밀번호가 8자리 이상일때까지 반복
			System.out.print("비밀번호를 입력하세요: ");
			passWord = sc.nextLine();	
			if(passWord.length()>=8) {					//8자리보다 길면
				break;									//while문 탈출
			}
			System.out.println("비밀번호는 8자리보다 길어야 됩니다");
		}
		user.setPassWord(Integer.toString(passWord.hashCode()));	//입력받은 문장을 바로 user의 password에 넣는다, 해쉬태그를 이용하여 암호화
		System.out.print("전화번호를 입력하세요: ");
		user.setPhoneNumber(sc.nextLine().replace("-", ""));		//입력받은 문장을 바로 user의 phoneNumber에 넣는다,만약 010-0000-0000으로 넣어도 자동으로 변환
		code = Integer.toString(rand.nextInt(9000)+1000);		//String타입에 넣을 수 있게 랜덤값을 String타입으로 변경
//		sendCode(user.getPhoneNumber(), code);					//문자 보내는 함수 사용, 입력받은 전화번호와 랜덤값의 인증번호를 보냄
//		System.out.println("해당번호로 인증번호를 발송하였습니다");
//		while(true) {											//올바른 인증번호를 입력할때까지 무한반복
//			System.out.print("인증번호 입력:");
//			if(code.equals(sc.nextLine())) {					//사용자가 인증번호 입력받고
//				System.out.println("인증완료되었습니다");
//				break;											//맞으면 while문 탈출
//			}
//			System.out.println("인증번호가 틀렸습니다. 다시 입력해주세요");	//아니면 다시 반복
//		}
		System.out.println("회원가입 완료되었습니다");
		dbc.db.add(user);										//db의 임시 User 추가
	}
	
	
//	 비밀번호 변경(마이 페이지)
	public static void changePassword(DBConnecter dbc, int index) {	//로그인시 저장된 index값을 받음
		String password = null;										//임시로 비밀번호 저장
		Scanner sc = new Scanner(System.in);						//입력받을 것이기에 Scanner 정의
		System.out.println("바꿀 비밀번호를 입력하세요");
		password = Integer.toString(sc.nextLine().hashCode());		//입력받은것을 해쉬코드로 변환
		if(password.equals(dbc.db.get(index).getPassWord())) {		//만약 이전 비밀번호와 같다면
			System.out.println("기존 비밀번호와 동일합니다");
			return;
		}
		
		dbc.db.get(index).setPassWord(password);					//다르다면, 받은 인덱스번호에 해당하는 User에 비밀번호 재설정
		System.out.println("비밀번호가 변경되었습니다");
	}
	
//	로그인
	public static int logIn(DBConnecter dbc) {						
		Scanner sc = new Scanner(System.in);						//입력받을 것이기에 Scanner 정의
		User user = new User();										//임시 User클래스 정의
		while(true) {												//올바른 아이디 비밀번호를 입력받을때 까지 반복
			System.out.print("아이디: " );
			user.setId(sc.nextLine());								//아이디 입력받고
			System.out.print("비밀번호: ");
			user.setPassWord(Integer.toString(sc.nextLine().hashCode()));		//저장할때 해쉬코드로 암호화 했기 때문에 hashcode를 붙어준다
			if(dbc.db.indexOf(user)!=-1) {										//해당되는 아이디가 있는지 확인
				if(user.getPassWord().equals( dbc.db.get(dbc.db.indexOf(user)).getPassWord())) {	//비밀번호가 맞나 확인하고
					System.out.println("로그인 성공");
					break;											//맞으면 while문 탈줄
				}
			}
			System.out.println("다시입력하세요");						//틀렸으면 다시 입력받음
		}
		return dbc.db.indexOf(user);								//로그인할때 저장된 인덱스 값을 리턴한다
	}
	
//	- 인증번호 전송(API)
	public static void sendCode(String phoneNumber, String code) {		//String으로 해야 임시비밀번호를 받기 편하다.
	       String api_key = "NCSRA3IYCYXPPBKN";
	       String api_secret = "6ICGXVWXGR3T5KUIOZT4JVT5IU0A5HHS";
	       Message coolsms = new Message(api_key, api_secret);

	       // 4 params(to, from, type, text) are mandatory. must be filled
	       HashMap<String, String> params = new HashMap<String, String>();
	       params.put("to", phoneNumber);
	       params.put("from", "01064896879");
	       params.put("type", "SMS");
	       params.put("text", "java.인증번호 발송 "+code);
	       params.put("app_version", "test app 1.2"); // application name and version

	       try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	       } catch (CoolsmsException e) {
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	       }
	}
	
	
	public static void main(String[] args) {
		DBConnecter dbc = new DBConnecter();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int index = 0;
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.나가기");
			choice = sc.nextInt();			//메뉴에서 선택받고
			if(choice==1) {
				joinMemberShip(dbc);		//회원가입 이벤트
			}
			else if(choice==2) {
				index = logIn(dbc);			//로그인 이벤트, 인덱스 값 저장
				while(true) {
					System.out.println("마이페이지");
					System.out.println("1.비밀번호 변경");
					System.out.println("2.로그아웃");
					System.out.println("입력>>");
					choice = sc.nextInt();					//다시 메뉴에서 입력받고
					if(choice==1) {
						changePassword(dbc, index);			//비밀번호 변경 이벤트, 저장된 인덱스 값 넣기
					}
					else if(choice == 2) {
						System.out.println("로그아웃 되었습니다");
						break;								//로그아웃되면 다시 처음으로
					}
					else {
						System.out.println("다시입력하세요");
					}
				}
			}
			else if(choice==3) {
				System.out.println("종료");
				break;									//종료
			}
			else {
				System.out.println("다시입력하세요");
			}
		}		
	}
	
}
