package day0603;

public class TryCatch1 {
	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) { // 모든 오류를 걸러줌
			System.out.println(4);
		}
		System.out.println(5);	
	}
}
