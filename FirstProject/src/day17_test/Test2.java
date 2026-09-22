package day17_test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.print("숫자 입력 : ");
		System.out.println(s.nextInt() % 2 == 0 ? "짝수" : "홀수");
		
		}
		
	}

}
