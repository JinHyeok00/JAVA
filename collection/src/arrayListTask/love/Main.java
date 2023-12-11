package arrayListTask.love;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		DateApp dateApp = new DateApp();
		Love love1 = new Love();
		love1.setAge(22);
		love1.setName("영희");
		love1.setNumber(1);

		Love love2 = new Love();
		love2.setAge(20);
		love2.setName("순자");
		love2.setNumber(2);
		
		Love love3 = new Love();
		love3.setAge(19);
		love3.setName("미자");
		love3.setNumber(3);
		
		DBConnecter.loves.add(love1);
		DBConnecter.loves.add(love2);
		DBConnecter.loves.add(love3);
		System.out.println(DBConnecter.loves);
		
		ArrayList<Love> a = dateApp.listofAge(19);
		System.out.println(a);
		dateApp.changeAge(love3, 25);
		System.out.println(DBConnecter.loves);
		
		dateApp.collectionAge(DBConnecter.loves);
		System.out.println(DBConnecter.loves);
	}
}
