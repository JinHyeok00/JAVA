package arrayListTask.food;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		Food food = new Food();
		food.setName("����");
		food.setPrice(5000);
		food.setType("���");
		
		restaurant.addFood(food);
		System.out.println(DBConnecter.foods);
		System.out.println(restaurant.checkType(food.getName()));
		ArrayList<Food> a = restaurant.TypeAll("���");
		System.out.println(a);
		System.out.println(DBConnecter.foods);
		System.out.println(restaurant.TypeNum("�߽�"));
		System.out.println(restaurant.TypeNum("���"));
	}
}
