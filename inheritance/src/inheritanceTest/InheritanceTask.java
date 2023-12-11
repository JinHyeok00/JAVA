package inheritanceTest;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {;}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	void engineStart() {
		System.out.println("열쇠 시동 켜짐");
	}
	
	
	void engineStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
}



class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}

	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("음성으로 시동 켜짐");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 꺼짐");
	}
	
}



public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 75_000, "Sports");
		System.out.println(ferrari.brand);
		ferrari.engineStart();
		ferrari.engineStop();
	}
}
