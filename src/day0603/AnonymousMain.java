package day0603;

interface RemoteControl1 {
	void turnOn();
	void turnOff();
}

//class Power implements RemoteControl1 {
//	public void turnOn() {
//		System.out.println("Tv on");
//	}
//
//	public void turnOff() {
//		System.out.println("Tv off");
//	}
//	
//}

public class AnonymousMain {

	public static void main(String[] args) {
//		RemoteControl1 rc = new Power();
//		rc.turnOn();
//		rc.turnOff();
		
		RemoteControl1 rc = new RemoteControl1() {
			public void turnOn() {
				System.out.println("Tv on");
			}

			public void turnOff() {
				System.out.println("Tv off");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
}