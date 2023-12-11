package arrayListTask.food;

import java.util.ArrayList;

public class Restaurant {
	public ArrayList<Food> foods = DBConnecter.foods;
	
	
//	���� �߰�
	public void addFood(Food food) {
		foods.add(food);
	}
	
	
//	���� �̸����� ���� ���� ��ȸ
	public String checkType(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return food.getType();
			}
		}
		return null;
	}
	
	
//	����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<Food> TypeAll(String type){
		ArrayList<Food> typeFoods = new ArrayList<Food>();
		for(Food food : foods) {
			if(food.getType().equals(type)) {
				typeFoods.add(food);
			}
		}
		return typeFoods;
	}
	
	
//	���� ���� ���� �� ���� 10% ���
	public void changeType(Food food) {
		for(Food foodInDB : foods) {
			if(foodInDB.getName().equals(food.getName())) {
				foodInDB.setType(food.getType());
				foodInDB.setPrice(food.getPrice());
			}
		}
	}
	
	
//	���� �̸����� ���� ���� ���ϱ�
	public Food select(String name) {
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}
	
	
//	����ڰ� ���ϴ� ������ ���� ���� ��ȸ
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
