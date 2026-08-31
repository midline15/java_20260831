package day1;

class _3_변수 {

	public static void main(String[] args) {

//		int num1 = 2190000000;// -2^31 ~ 2^31 - 1
		long num2 = 2190000000L;//-2^63 ~ 2^63 - 1
		
		float num3 = 1.1234f;
		double num4 = 1.1234;
		
		// char 변수 값은 숫자랑 매핑이 된다(ASCII)
		char num5 = 'a';
		System.out.println(num5+2);
		
		// 학생을 만들어서 출력
		String stuName = "홍길동";
		int age = 20;
		String addr = "인천";
		String phone = "010-1234-5678";
		double stuGrade = 3.93;
		
		System.out.println(stuName + "의 나이는 " + age + ", 학점은 " + stuGrade + "점 입니다.");
		
	}

}
