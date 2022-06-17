package day0603;

interface OperateCar {
	void start();
	void stop();
	void serSpeed(int speed);
	void turn(int degree);
	
	default void fly() {
		System.out.println("하늘을 날아요~~");
	}
}

class OldCar implements OperateCar {

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void serSpeed(int speed) {
		
	}

	@Override
	public void turn(int degree) {
		
	}
	
}

public class DefaultMethod2 {

	public static void main(String[] args) {
		
		OldCar oc = new OldCar();
		oc.fly();

	}

}

