package arrayListTask.fruit;

public class Fruit {
//	   - 과일 이름(중복 없음)
//	   - 과일 가격
	private String name;
	private String price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
}
