package day4;

import java.util.Arrays;

public class _12_선택정렬 {

	public static void main(String[] args) {

		int arr[] = { 9, 6, 7, 3, 5 };

		// arr 에서 가장 작은 숫자를 찾아서 자리 바꾸기
		

		for(int j = 0; j < arr.length-1; j++) {
			int minIndex = j;

			for (int i = j+1; i < arr.length; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}

			int tmp = arr[minIndex];
			arr[minIndex] = arr[j];
			arr[j] = tmp;

			System.out.println(Arrays.toString(arr));
		}
		
	}

}
