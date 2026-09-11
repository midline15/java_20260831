package day02;

import java.util.Scanner;

public class _21_중첩반복연습문제 {

	public static void main(String[] args) {

		// 1. 구구단 9단부터 출력
		for (int i = 0; i < 10; i++) {
			for (int j = 9; j > 1; j--) {
				if (i == 0) {
					System.out.print(j + "단\t\t");
				} else {
					System.out.print(j + "x" + i + "=" + j * i + "\t");
				}
			}
			System.out.println();
		}
		System.out.println("==================================================");
		// 2. 숫자하나 입력 받아서 해당 숫자만큼 별표
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		for(int i =1; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
