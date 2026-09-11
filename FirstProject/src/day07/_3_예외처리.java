package day07;

import java.util.Scanner;

public class _3_예외처리 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		try {
			System.out.print("나누기를 할 숫자를 입력해주세요 : ");
			int num = s.nextInt();

			System.out.println("100을 " + num + "으로 나누면" + 100 / num);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
		}
	}

}
