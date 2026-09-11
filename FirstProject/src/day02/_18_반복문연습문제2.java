package day02;

import java.util.Scanner;

public class _18_반복문연습문제2 {

	public static void main(String[] args) {

		// 1. 숫자 10부터 1까지 역순으로 출력
		System.out.println("======1번문제======");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		// 2. 1부터 100까지 숫자 중 3의 배수의 합 출력
		System.out.println("======2번문제======");
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		// 3. 스캐너로 숫자를 하나 입력 받고 1부터 해당 숫자까지의 합 출력
		System.out.println("======3번문제======");
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);

		scan.close();

	}

}
