package calcStep2;

public class Main {
	static Calc operate(String oper) {
		if(oper.equals("+")) {
			return (a,b)->a+b;
		}
		return (a,b)->a-b;
	}
	
	
	public static void main(String[] args) {
		//�Լ��� �������̽�
		//�߻��� �޼ҵ尡 �ϳ��ۿ� ��� �޼ҵ�ó�� ���� �ִ� �������̽�
		//���ٽ��� �����ִ�
		//���ٽ��� �߻��� �޼ҵ带 �����ִ°Ŷ� ���̿���
		
		//num1 num2, �̵ΰ��� ������ �E���� ������ߵǴ°� �ƴϿ���
//		
		
		System.out.println(Main.operate("+").calc(10, 5));
		
		
//		Calc p = (a,b) -> a+b;
//		System.out.println(p.calc(15, 10));
	}
}
