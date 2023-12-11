package arrayListTask.fruit;

import java.util.ArrayList;

public class Market {
	public ArrayList<Fruit> fruits = DBConnecter.fruits;	//db에 연결
	
//	과일 검사
	   public Fruit checkFruit(String name) {
		      for (Fruit fruit : fruits) {
		         if(fruit.getName().equals(name)) {
		            return fruit;
		         }
		      }
		      return null;
		   }

//	   - 과일 추가
	public void plusFruit(Fruit fruit) {
		fruits.add(fruit);	
	}
	
//	   - 과일 삭제
	   public void remove(String name) {
		      Fruit fruit = checkFruit(name);
		      fruits.remove(fruit);
		   }

//	   - 과일 가격이 평균 가격보다 낮은 지 검사
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
//	   - 과일 전체 조회
	public ArrayList<Fruit> showFruit() {
		return fruits;
	}
//	   - 과일 이름으로 가격 조회
	public int showPrice(String name) {
		for(Fruit temp : fruits) {
			if(temp.getName().equals(name)) {
				return Integer.parseInt(temp.getPrice());
			}
		}
		return 0;
	}
}
