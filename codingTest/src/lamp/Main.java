package lamp;

public class Main {
	public static void main(String[] args) {
		TimerDeskLamp timerDeskLamp = new TimerDeskLamp();
		timerDeskLamp.turnOn();
		timerDeskLamp.offDelayThread();
		timerDeskLamp.turnOff();
		timerDeskLamp.offDelayThread();
	}
}
