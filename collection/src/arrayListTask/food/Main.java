package arrayListTask.food;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		Food food = new Food();
		food.setName("피자");
		food.setPrice(5000);
		food.setType("양식");
		
		restaurant.addFood(food);
		System.out.println(DBConnecter.foods);
		System.out.println(restaurant.checkType(food.getName()));
		ArrayList<Food> a = restaurant.TypeAll("양식");
		System.out.println(a);
		System.out.println(DBConnecter.foods);
		System.out.println(restaurant.TypeNum("중식"));
		System.out.println(restaurant.TypeNum("양식"));
	}
}
