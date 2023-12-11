package arrayListTask.food;

import java.util.ArrayList;

public class Restaurant {
	public ArrayList<Food> foods = DBConnecter.foods;
	
	
//	음식 추가
	public void addFood(Food food) {
		foods.add(food);
	}
	
	
//	음식 이름으로 음식 종류 조회
	public String checkType(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return food.getType();
			}
		}
		return null;
	}
	
	
//	사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> TypeAll(String type){
		ArrayList<Food> typeFoods = new ArrayList<Food>();
		for(Food food : foods) {
			if(food.getType().equals(type)) {
				typeFoods.add(food);
			}
		}
		return typeFoods;
	}
	
	
//	음식 종류 수정 후 가격 10% 상승
	public void changeType(Food food) {
		for(Food foodInDB : foods) {
			if(foodInDB.getName().equals(food.getName())) {
				foodInDB.setType(food.getType());
				foodInDB.setPrice(food.getPrice());
			}
		}
	}
	
	
//	음식 이름으로 음식 정보 구하기
	public Food select(String name) {
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}
	
	
//	사용자가 원하는 종류의 음식 개수 조회
	public int TypeNum(String type){
		ArrayList<Food> typeFoods = new ArrayList<Food>();
		for(Food food : foods) {
			if(food.getType().equals(type)) {
				typeFoods.add(food);
			}
		}
		return typeFoods.size();
	}
	
}
