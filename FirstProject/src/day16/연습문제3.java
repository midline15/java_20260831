package day16;

import java.util.ArrayList;
import java.util.Arrays;

public class 연습문제3 {

	public static void main(String[] args) {

		int arr[] = { 3, 5, -1, -7, 6 };
		// 음수를 무시하고 오름차순
		// {-1, 3, 5, 6, -7}
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				list.add(arr[i]);
				arr[i] = Math.abs(arr[i]);
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (list.contains(-arr[i])) {
				arr[i] = -arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));

		// 배열에서 홀수와 짝수들의 합의 차이 구하기
		int arr2[] = { 3, 5, 2, 4, 6, 9, 8 };
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				evenSum += arr2[i];
			} else {
				oddSum += arr2[i];
			}
		}
		System.out.println(Math.abs(evenSum-oddSum));
	}

}
