package day02;

public class _9_조건문 {

	public static void main(String[] args) {

		int age = 15;

		// age 가 20 이상이면 '성인입니다' 출력
		// 아닐경우 아무것도 출력 안함

		if (age >= 20) {
			System.out.println("성인입니다.");
		}
		if (age < 20) {
			System.out.println("청소년입니다.");
		}
	}

}
