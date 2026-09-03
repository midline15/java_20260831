package day4;

import java.util.Arrays;
import java.util.Scanner;

public class _3_배열 {

	public static void main(String[] args) {

		// 사용자로부터 입력받은 숫자를 배열에 저장
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i + 1) + "번째 숫자 입력 : ");
			arr[i] = scan.nextInt();

		}

		System.out.println(Arrays.toString(arr));

	}

}
