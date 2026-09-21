package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		// 1. 스캐너를 통해 숫자 5개 입력받아서 배열에 넣기
		// 양수를 입력하면 음수로, 음수를 입력하면 양수로 넣기
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -(s.nextInt());
		}
		System.out.println(Arrays.toString(arr));
		
		int arr2[] = { 30, 20, 60, 15, 25, 20, 60, 15, 10, 30 };
		// 2. 배열에서 중복된 값 제거 후 출력
		// 단, 배열에 0은 없다고 가정
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num : arr2) {
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		System.out.println(Arrays.toString(Arrays.stream(arr2).distinct().toArray()));
		System.out.println(Arrays.toString(list.toArray()));
		
	}

}
