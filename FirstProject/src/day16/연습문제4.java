package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 연습문제4 {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//		// 스캐너를 통해 입력받은 값을 배열에 넣기
//		// 값은 10~ 30 사이 값만 넣기
//		// 그외 값을 다시 입력받기
//		int i = 0;
//		while (arr[arr.length - 1] == 0) {
//			System.out.print("숫자 입력 : ");
//			int num = s.nextInt();
//			if (num >= 10 && num <= 30) {
//				arr[i] = num;
//				i++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		int arr2[] = { 3, 9, 6, 5, 4, 2, 15, 8 };
		// 홀수 먼저 정렬 => 오름차순
		// 짝수 뒤에 정렬 => 내림차순
		// 결과 {3,5,9,15,8,6,4,2}
		// 결과는 배열로 출력, 새로운 배열 만들어도 됨.
		// 최초 배열의 홀수, 짝수 개수는 같다고 가정
		ArrayList<Integer> elist = new ArrayList<Integer>();
		ArrayList<Integer> olist = new ArrayList<Integer>();
		for (int j : arr2) {
			if (j % 2 == 0) {
				elist.add(j);
			} else {
				olist.add(j);
			}
		}

//		Collections.sort(olist);
		olist.sort(Comparator.naturalOrder());
		Collections.sort(elist, Collections.reverseOrder());
		olist.addAll(elist);
		System.out.println(olist);
		System.out.println(Arrays.toString(olist.toArray()));
	}

}
