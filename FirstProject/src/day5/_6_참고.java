package day5;

public class _6_참고 {

	public static void main(String[] args) {

		// 삼항연산자
		String result; // score 60 이상 pass, 아래 fail
		int score = 75;

		if (score >= 60) {
			result = "Pass";
		} else {
			result = "Fail";
		}

		result = score >= 60 ? "Pass" : "Fail";

		// 향상된 for 문
		int arr[] = { 1, 3, 5, 2, 4 };
		
		for(int num : arr) {
			System.out.println(num);
		}

		// final
		int age = 30; // 변하는 값, 변수
		age +=1;
		
		final double PI = 3.1415926535; // 변하지 않는 수. 상수. 대문자
//		PI += 1;
	}

}
