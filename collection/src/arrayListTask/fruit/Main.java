package arrayListTask.fruit;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Market market = new Market();
		Fruit fruit1 = new Fruit();
		fruit1.setName("사과");
		fruit1.setPrice("5000");	
		market.plusFruit(fruit1);
		
		Fruit fruit2 = new Fruit();
		fruit2.setName("배");
		fruit2.setPrice("3000");
		market.plusFruit(fruit2);	
		
		System.out.println(market.checkAverageOf(fruit2));
		ArrayList<Fruit> fruits = market.showFruit();
		System.out.println(fruits);
		System.out.println(market.showPrice("사과"));
		
//		System.out.println(DBConnecter.fruits);
//		market.deleteFruit("사과");
//		System.out.println(DBConnecter.fruits);
	}
}
