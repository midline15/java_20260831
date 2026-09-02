package dya3;

import java.util.Scanner;

class _2_조건문복습 {

	public static void main(String[] args) {

		// 나이를 입력받은 후, 19세 이하면 1000원 출력
		// 20~65 2000원 65초과는 무료
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		if(age < 20) {
			System.out.println("1000원");
		}else if(age>=20 && age<=65) {
			System.out.println("2000원");
		}else {
			System.out.println("무료");
		}
		
	}

}
