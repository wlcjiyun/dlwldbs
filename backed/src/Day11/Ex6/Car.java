package Day11.Ex6;

public class Car {
	public Tire tire;
	public void run() {
		tire.roll();
	}
	public void parking( Tire tire ) {
		tire.stop();
	}
}	
