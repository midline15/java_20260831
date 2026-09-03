package day4;

import java.util.Arrays;
import java.util.Scanner;

public class _5_배열문제 {

	public static void main(String[] args) {

		// 사용자로부터 입력받은 숫자를 배열에 저장
		// 중복된 숫자가 없으면 좋겠다.
		// 0을 입력하지 않는다.
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i + 1) + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			arr[i] = input;

			for (int j = 0; j < i; j++) {

				if (arr[j] == input) {
					System.out.println("중복");
					i--;
					break;
				}

			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
