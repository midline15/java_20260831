package day1;

public class _7_산술연산자 {

	public static void main(String[] args) {

		int num = 100;

		System.out.println(num + 5);// 105
		System.out.println(num / 3);// 33
		System.out.println(100.0 / 3);// 33.3333333 실수가 포함된 연산의 결과는 실수
		System.out.println((double)num/7);
		
		//계산순서 (),*/%,+-
		System.out.println(3+5*2);//13
		System.out.println((3+5)*2);//16
	}

}
