package interfaceTask2;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("텍시가 달린다");
	}
	
	public void checkTaxi() {
		System.out.println("미터기가 올라간다");
	}

}
