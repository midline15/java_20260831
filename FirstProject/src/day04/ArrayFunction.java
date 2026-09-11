package day04;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunction {

	void arrayMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("\"배열에서 가장 큰 값은 " + max + " 입니다.\"");
	}

	int arraySum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	int arrayChoice(int[] arr, int i) {

		return arr[i - 1];
	}

	void arrayRandom(int i) {
		int arr[] = new int[i];
		Random ran = new Random();

		for (int j = 0; j < i; j++) {
			arr[j] = ran.nextInt(30) + 1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
