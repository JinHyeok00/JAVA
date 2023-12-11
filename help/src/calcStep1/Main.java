package calcStep1;

public class Main {
	Purson makePurson(String name, int age) {
		Purson purson = new Purson(age, name);
		
		return purson;
	}
	
	
	public static void main(String[] args) {
		String name = "ÁøÇõ";
		int age = 24;
		
		
		
		Main main = new Main();
		System.out.println(main.makePurson(name, age).toShowAll());
		
	}
	

}
