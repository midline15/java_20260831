package dya3;

import java.util.Arrays;

public class _17_배열 {

	public static void main(String[] args) {

		int arr[] = { 7, 2, 4, 3, 8 };
		int tmp = arr[0];

		arr[0] = arr[3];
		arr[3] = tmp;

		System.out.println(Arrays.toString(arr));

	}

}
