package day1;

public class _4_변수 {

	public static void main(String[] args) {

		int age;// 1. 변수 선언만 한 상태
//		System.out.println(age);// 값이 없어서 출력 불가
		age = 30;//2. 초기화(값을 지정)
		System.out.println("변경 전 : " + age);
//		int age;// 한번선언된 변수는 다시 선언 불가능
		System.out.println("변경 후 : " + age);
		age = 35;// 변수값 수정은 가능
		System.out.println("변경 후 : " + age);
		//보통은 선언과 동시에 초기화
		//int age =20;
	}

}
