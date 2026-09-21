package day16;

import java.util.Arrays;

public class 유용한함수 {

	public static void main(String[] args) {

		int arr[] = { 3, -10, 4, 7, -8 };
		// 배열에 있는 숫자를 양수로 바꾼 후 오름차순 하세요.
		//{3,4,7,8,10}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.abs(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
