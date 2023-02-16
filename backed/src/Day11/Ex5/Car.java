package Day11.Ex5;

public class Car {
	public Tire tire;
	public void run() {
		tire.roll();
	}
	public void parking( Tire tire ) {
		tire.stop();
	}
}	
