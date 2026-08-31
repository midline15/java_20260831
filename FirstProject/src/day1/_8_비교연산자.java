package day1;

public class _8_비교연산자 {

	public static void main(String[] args) {

		// >,<,>=,<=,==,!=
		int num1 = 100;
		int num2 = 50;
		
		System.out.println(num1 > num2); // true
		System.out.println(num1 < num2); // false
	
		System.out.println(num1 > 100); // false
		System.out.println(num1 >= 100); // true
		
		
		System.out.println(num1 = 100); // 100
		System.out.println(num1 == 100); // true
		System.out.println(num1 != 100); // false
		
		System.out.println(!(num1 > num2)); //false
	}

}
