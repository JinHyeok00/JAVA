package markerInterfaceTest;

public class Lap {
	public void checkKineds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof CarnivorMarker) {
				System.out.println("육식동물");
			}
			else if(animals[i] instanceof HerbivoreMarker) {
				System.out.println("초식동물");
			}
			else {
				System.out.println("잡식동물");
			}
		}
	}
	
	public static void main(String[] args) {
		Animal[] animals = {
				new Cow(),
				new Dog(),
				new Tiger(),
				new Bear()
		};
		new Lap().checkKineds(animals);
	}
}
