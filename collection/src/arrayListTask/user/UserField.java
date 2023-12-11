package arrayListTask.user;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
//	���̵� �ߺ��˻�
	public static boolean checkId(DBConnecter dbc, User user) {
		return dbc.db.contains(user);		//User�� toString�� equles �����Ƿ� User�� ���ص� Ȯ�ΰ����ϴ�
	}
	
	
//	ȸ������
	public static void joinMemberShip(DBConnecter dbc) {	
		Scanner sc = new Scanner(System.in);	//�Է¹޾ƾ� �Ǳ� ������
		Random rand = new Random();				//������ȣ�� �����ϱ�����
		User user = new User();			//db�� ���� �ӽ� userŸ�� ����
		String code = null;				//������ȣ
		String passWord = null;			//�ӽ� ��й�ȣ
		
		System.out.println("�̸��� �Է��ϼ���");
		user.setName(sc.nextLine());		//�Է¹��� ������ �ٷ� user�� name���� �ִ´�
		while(true) {						// �ߺ����� �ʴ� ���̵� �Է��Ҷ����� ���ѹݺ�
			System.out.print("����� ���̵� �Է��ϼ���: ");		
			user.setId(sc.nextLine());		//�Է¹��� ������ �ٷ� user�� id�� �ִ´�
			if(!checkId(dbc,user)) {		//���̵� �ߺ�Ȯ�� �޼ҵ� ���
				System.out.println("��밡���� ���̵� �Դϴ�");	
				break;		//�ߺ����� ������ while�� ��������
			}
			System.out.println("�̹� �ִ� ���̵� �Դϴ�");		//if������ ������ ���̵� �ߺ� �Ȱ�
		}
		while(true) {									//��й�ȣ�� 8�ڸ� �̻��϶����� �ݺ�
			System.out.print("��й�ȣ�� �Է��ϼ���: ");
			passWord = sc.nextLine();	
			if(passWord.length()>=8) {					//8�ڸ����� ���
				break;									//while�� Ż��
			}
			System.out.println("��й�ȣ�� 8�ڸ����� ���� �˴ϴ�");
		}
		user.setPassWord(Integer.toString(passWord.hashCode()));	//�Է¹��� ������ �ٷ� user�� password�� �ִ´�, �ؽ��±׸� �̿��Ͽ� ��ȣȭ
		System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
		user.setPhoneNumber(sc.nextLine().replace("-", ""));		//�Է¹��� ������ �ٷ� user�� phoneNumber�� �ִ´�,���� 010-0000-0000���� �־ �ڵ����� ��ȯ
		code = Integer.toString(rand.nextInt(9000)+1000);		//StringŸ�Կ� ���� �� �ְ� �������� StringŸ������ ����
//		sendCode(user.getPhoneNumber(), code);					//���� ������ �Լ� ���, �Է¹��� ��ȭ��ȣ�� �������� ������ȣ�� ����
//		System.out.println("�ش��ȣ�� ������ȣ�� �߼��Ͽ����ϴ�");
//		while(true) {											//�ùٸ� ������ȣ�� �Է��Ҷ����� ���ѹݺ�
//			System.out.print("������ȣ �Է�:");
//			if(code.equals(sc.nextLine())) {					//����ڰ� ������ȣ �Է¹ް�
//				System.out.println("�����Ϸ�Ǿ����ϴ�");
//				break;											//������ while�� Ż��
//			}
//			System.out.println("������ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���");	//�ƴϸ� �ٽ� �ݺ�
//		}
		System.out.println("ȸ������ �Ϸ�Ǿ����ϴ�");
		dbc.db.add(user);										//db�� �ӽ� User �߰�
	}
	
	
//	 ��й�ȣ ����(���� ������)
	public static void changePassword(DBConnecter dbc, int index) {	//�α��ν� ����� index���� ����
		String password = null;										//�ӽ÷� ��й�ȣ ����
		Scanner sc = new Scanner(System.in);						//�Է¹��� ���̱⿡ Scanner ����
		System.out.println("�ٲ� ��й�ȣ�� �Է��ϼ���");
		password = Integer.toString(sc.nextLine().hashCode());		//�Է¹������� �ؽ��ڵ�� ��ȯ
		if(password.equals(dbc.db.get(index).getPassWord())) {		//���� ���� ��й�ȣ�� ���ٸ�
			System.out.println("���� ��й�ȣ�� �����մϴ�");
			return;
		}
		
		dbc.db.get(index).setPassWord(password);					//�ٸ��ٸ�, ���� �ε�����ȣ�� �ش��ϴ� User�� ��й�ȣ �缳��
		System.out.println("��й�ȣ�� ����Ǿ����ϴ�");
	}
	
//	�α���
	public static int logIn(DBConnecter dbc) {						
		Scanner sc = new Scanner(System.in);						//�Է¹��� ���̱⿡ Scanner ����
		User user = new User();										//�ӽ� UserŬ���� ����
		while(true) {												//�ùٸ� ���̵� ��й�ȣ�� �Է¹����� ���� �ݺ�
			System.out.print("���̵�: " );
			user.setId(sc.nextLine());								//���̵� �Է¹ް�
			System.out.print("��й�ȣ: ");
			user.setPassWord(Integer.toString(sc.nextLine().hashCode()));		//�����Ҷ� �ؽ��ڵ�� ��ȣȭ �߱� ������ hashcode�� �پ��ش�
			if(dbc.db.indexOf(user)!=-1) {										//�ش�Ǵ� ���̵� �ִ��� Ȯ��
				if(user.getPassWord().equals( dbc.db.get(dbc.db.indexOf(user)).getPassWord())) {	//��й�ȣ�� �³� Ȯ���ϰ�
					System.out.println("�α��� ����");
					break;											//������ while�� Ż��
				}
			}
			System.out.println("�ٽ��Է��ϼ���");						//Ʋ������ �ٽ� �Է¹���
		}
		return dbc.db.indexOf(user);								//�α����Ҷ� ����� �ε��� ���� �����Ѵ�
	}
	
//	- ������ȣ ����(API)
	public static void sendCode(String phoneNumber, String code) {		//String���� �ؾ� �ӽú�й�ȣ�� �ޱ� ���ϴ�.
	       String api_key = "NCSRA3IYCYXPPBKN";
	       String api_secret = "6ICGXVWXGR3T5KUIOZT4JVT5IU0A5HHS";
	       Message coolsms = new Message(api_key, api_secret);

	       // 4 params(to, from, type, text) are mandatory. must be filled
	       HashMap<String, String> params = new HashMap<String, String>();
	       params.put("to", phoneNumber);
	       params.put("from", "01064896879");
	       params.put("type", "SMS");
	       params.put("text", "java.������ȣ �߼� "+code);
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
			System.out.println("1.ȸ������");
			System.out.println("2.�α���");
			System.out.println("3.������");
			choice = sc.nextInt();			//�޴����� ���ùް�
			if(choice==1) {
				joinMemberShip(dbc);		//ȸ������ �̺�Ʈ
			}
			else if(choice==2) {
				index = logIn(dbc);			//�α��� �̺�Ʈ, �ε��� �� ����
				while(true) {
					System.out.println("����������");
					System.out.println("1.��й�ȣ ����");
					System.out.println("2.�α׾ƿ�");
					System.out.println("�Է�>>");
					choice = sc.nextInt();					//�ٽ� �޴����� �Է¹ް�
					if(choice==1) {
						changePassword(dbc, index);			//��й�ȣ ���� �̺�Ʈ, ����� �ε��� �� �ֱ�
					}
					else if(choice == 2) {
						System.out.println("�α׾ƿ� �Ǿ����ϴ�");
						break;								//�α׾ƿ��Ǹ� �ٽ� ó������
					}
					else {
						System.out.println("�ٽ��Է��ϼ���");
					}
				}
			}
			else if(choice==3) {
				System.out.println("����");
				break;									//����
			}
			else {
				System.out.println("�ٽ��Է��ϼ���");
			}
		}		
	}
	
}
