package day3;

import java.util.Scanner;

public class _1_조건문복습 {

	public static void main(String[] args) {

		// if, else if, else, 중첩
		// 스캐너
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		/* 
		 * // 스캐너로 입력받은 숫자가 100이상이면 '큰수' 출력 if (num >= 100) { System.out.println("큰 수");
		 * }
		 */
		
		if (num >= 100) {
			System.out.println("큰 수");
		} else {
			System.out.println("작은 수");
		}
	}

}
