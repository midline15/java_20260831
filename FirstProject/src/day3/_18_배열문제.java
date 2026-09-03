package day3;

import java.util.Arrays;
import java.util.Random;

public class _18_배열문제 {

	public static void main(String[] args) {

		// 1. 6개의 공간을 가지는 int형 배열을 만든 후
		// 1~100 사이의 랜덤한 숫자를 넣어주세요.
		// 단, 홀수만 넣을 것

		int[] arr = new int[6];

		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			int num = ran.nextInt(100) + 1;

			if (num % 2 == 1) {
				arr[i] = num;
			} else {
				i--;
			}
		}

		System.out.println(Arrays.toString(arr));

		// 2. 1번에서 만든 배열의 숫자들의 평균을 구하시오
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / arr.length);

		// 3. 1번에서 만든 배열에서 가장 큰 숫자와 가장 작은 숫자의
		// 위치를 바꾸기
		// 중복된 숫자 무시
		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}

		int tmp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = tmp;

		System.out.println(Arrays.toString(arr));

	}

}
