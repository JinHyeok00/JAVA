package arrayListTask.fruit;

import java.util.ArrayList;

public class Market {
	public ArrayList<Fruit> fruits = DBConnecter.fruits;	//db�� ����
	
//	���� �˻�
	   public Fruit checkFruit(String name) {
		      for (Fruit fruit : fruits) {
		         if(fruit.getName().equals(name)) {
		            return fruit;
		         }
		      }
		      return null;
		   }

//	   - ���� �߰�
	public void plusFruit(Fruit fruit) {
		fruits.add(fruit);	
	}
	
//	   - ���� ����
	   public void remove(String name) {
		      Fruit fruit = checkFruit(name);
		      fruits.remove(fruit);
		   }

//	   - ���� ������ ��� ���ݺ��� ���� �� �˻�
	public boolean checkAverageOf(Fruit fruit) {
		int total=0;
		for(Fruit temp : fruits) {
			total+=Integer.parseInt(temp.getPrice());
		}
		if((total/fruits.size())>Integer.parseInt(fruit.getPrice())){
			return true;
		}
		return false;
	}
//	   - ���� ��ü ��ȸ
	public ArrayList<Fruit> showFruit() {
		return fruits;
	}
//	   - ���� �̸����� ���� ��ȸ
	public int showPrice(String name) {
		for(Fruit temp : fruits) {
			if(temp.getName().equals(name)) {
				return Integer.parseInt(temp.getPrice());
			}
		}
		return 0;
	}
}
