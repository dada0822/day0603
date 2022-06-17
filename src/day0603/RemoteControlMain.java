package day0603;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Television();
		
		rc.trunOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio(); // 인터페이스의 다형성
		
		rc.trunOn();
		rc.setVolume(7);
		rc.turnOff();
		
	}

}
