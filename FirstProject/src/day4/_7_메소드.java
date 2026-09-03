package day4;

import java.util.Random;

public class _7_메소드 {
	
	static void firstMethod() {
		System.out.println("내가 만든 첫번째 메소드 호출");
	}
	
	static int returnMethod() {
		
		int number = 10;
		
		return number;
		
	}

	static int sum(int x, int y) {
		
		return x+y;
	}
	
	
	public static void main(String[] args) {

		// 특정 행동을 하도록 정의되어 있는 요소
		firstMethod();
		
		// 1. 실행하고 끝나는 메소드(void) 2. 값을 리턴하는 메소드
//		Random ran = new Random();
//		int ranNum = ran.nextInt(10);
//		System.out.println();
		int num = returnMethod();
		
		// 매개변수(parameter)
		int result1 = sum(3,5);
		int result2 = sum(10, 5);
	}

}
