package day2;

public class _6_증감연산자 {

	public static void main(String[] args) {

		// 전위연산자 , 후위연산자
		int num1 = 10;
		int num2 = num1++;
		System.out.println(num2); // 10, num1 은 11
		int num3 = --num1; //num3 = 10, num1 = 10
		int num4 = num2++; // num4 = 10 , num2 = 11;
	}

}
