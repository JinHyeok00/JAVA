package interfaceTask2;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			((Bus) vehicle).checkFare();
		}
		else if(vehicle instanceof Taxi) {
			((Taxi) vehicle).checkTaxi();
		}
		
		vehicle.run();
	}
}
