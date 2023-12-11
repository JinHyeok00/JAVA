package calcStep1;

public class Purson {
	private int age;
	private String name;
	
	public Purson() {;}

	public Purson(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toShowAll(){
		return name+"이는"+age+"살 입니다";
	}
}
