package day08;

public class _0_and_or {

	static boolean test(int x) {
		System.out.println(x + "는 10보다 큽니다.");
		return x> 10;
	}
	
	public static void main(String[] args) {

		int a =100;
		int b =50;
		if(a> 100 && test (b)) { // 앞이 false면 뒤를 확인하지 않는다
			System.out.println("두 수 모두 큰 수 입니다.");
		}
		if(a> 100 & test (b)) { // 앞이 false여도 뒤를 확인
			System.out.println("두 수 모두 큰 수 입니다.");
		}
		
	}

}
