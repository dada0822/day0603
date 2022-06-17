package day0603;

class OuterClass { // 외부 클래스
	
	private int value = 10;
	
	class InnerClass { // 내부 클래스
		public void myMethod() {
			int num = 1;
			System.out.println("Inner클래스의 num : " + num);
			System.out.println("Inner클래스의 value : " + value);
		}
	}
	
	OuterClass(){
		InnerClass inner = new InnerClass();
		inner.myMethod();
	}
}

public class InnerClassMain {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		
	}
	
}