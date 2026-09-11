package day04;

import java.util.Arrays;

public class _12_선택정렬 {

	public static void main(String[] args) {

		int arr[] = { 9, 6, 7, 3, 5 };

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			int tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;

			System.out.println(Arrays.toString(arr));
		}

	}

}
