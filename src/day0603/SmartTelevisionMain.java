package day0603;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
		SmartTelevision st = new SmartTelevision();
			
//		RemoteControl rc1 = new SmartTelevision();
		RemoteControl rc1 = st;
		Searchable sa = st;
		
		st.trunOn();
		st.search("공휴일");
		st.setVolume(4);
		st.turnOff();
		
		rc1.trunOn();
//		rc1.search("공휴일"); 에러 RemoteControl에는 search()가 없다
		rc1.setVolume(4);
		rc1.turnOff();
		
//		sa.trunOn(); 참조변수가 가지고 있는 것만 실행 가능
		sa.search("공휴일");
//		sa.setVolume(4);
//		sa.turnOff();
	}

}
