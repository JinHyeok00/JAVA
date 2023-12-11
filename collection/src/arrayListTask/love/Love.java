package arrayListTask.love;

public class Love implements Comparable<Love> {
//	   - 번호
//	   - 이름
//	   - 나이

	
	private int number;
	private String name;
	private int age;
	
	public Love() {
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Love [number=" + number + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Love o) {
		if(this.age>o.age) {
			return 1;
		}
		else if(this.age < o.age) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
