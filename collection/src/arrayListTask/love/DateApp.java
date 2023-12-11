package arrayListTask.love;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {
	ArrayList<Love> loves = DBConnecter.loves;
//	   - ����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ
//	   - �̻����� ���� ����
//	   - �̻��� ���� �� ����

	
	public ArrayList<Love> listofAge(int age){
		ArrayList<Love> ageList = new ArrayList<Love>();
		for(Love love : loves) {
			if(age == love.getAge()) {
				ageList.add(love);
			}
		}
		return ageList;
	}
	
	public void changeAge(Love love, int age) {
		love.setAge(age);
	}
	
//	���� �����ڷ� ���� �ּҸ� ������ mutable�̱� ������
//	�ٸ� ������ ������ ��� ������ �� �ִ�.
//	������ �̷� ������� ���踦 �ϸ�, ��𿡼� ������ �����ߴ� �� �� �� ����.
	
//	���� ���縦 ����ϸ� ���� ���� �ϳ��� �����ؼ� ���� ������,
//	�ٸ� ������ �ʵ带 �����ص� ������ �ٲ��� �ʴ´�.
//	������, ���� �ʵ忡 ��ü�� ����Ǿ� �ִٸ� ���� ���縦 ���� �ش� ��ü�� �ּҰ���
//	�״�� ������ �ȴ�.
//	����, ���� �ʵ忡 ����� ��ü�� ����ȴٸ�, ���� ����� ��ü�鵵 �ش� ������ ����ȴ�.
	
//	�ʵ� �ȿ� �� �ٸ� ��ü�� ����Ǿ� ������(���� "��ü �׷���") ���� ���簡 �ʿ��Ѵ�.
//	���� �ּҸ� �״�� �޴� ���� �ƴ϶� ��ü �׷��� ��ŭ new�� ����Ͽ� ���� ���縦 �����ؾ� �Ѵ�.
//	�̷��� ��ü �׷����� ��쿡�� ���� ���縦 ������� �ʰ� ���� ���縦 ���� immutable�� ������ �޼��ؾ� �Ѵ�.
	
	public void collectionAge(ArrayList<Love> loves) {
		Collections.sort(loves);
		for(Love love : loves) {
			love.setNumber(loves.indexOf(love)+1);
		}
	}
}
