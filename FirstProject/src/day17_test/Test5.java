package day17_test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자 : ");
			int input = s.nextInt();
			if ((i % 2 == 0 && input % 2 == 1) || (i % 2 == 1 && input % 2 == 0)) {
				arr[i] = input;
			} else {
				i--;
				System.out.println("다시");
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
