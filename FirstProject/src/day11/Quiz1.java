package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 2, 3 };
		int arr2[] = { 3, 3, 2, 1 };
		System.out.println(sameNumberCounts(arr1, arr2));

		int arr3[] = { 3, 4, 4, 5 };
		int arr4[] = { 1, 2, 3, 4 };
		System.out.println(findIntersection(arr3, arr4));

	}

//	# 두 정수 배열이 주어졌을 때,
//	순서는 다르더라도 동일한 숫자들이 동일한 개수만큼 
//	포함되어 있다면 true를 반환하는 메소드를 작성하시오
	public static boolean sameNumberCounts(int[] arr1, int[] arr2) {

		if (arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean flag = true;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return true;
			}
		}
		return false;

	}

	// 입력: [1, 2, 2, 3], [3, 2, 1, 2]
	// 출력: true

	// 입력: [1, 2, 2], [1, 2, 3]
	// 출력: false

//	# 두 개의 정수 배열이 주어졌을 때, 공통으로 포함된 숫자들만 중복 없이 리스트로 반환
//	 예시 입력: {3, 4, 4, 5}, {1, 2, 3, 4}
//	 예시 출력: [3, 4]
	public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			if (list2.contains(arr1[i])) {
				continue;
			}
			for (int j = i + 1; j < arr1.length; j++) {

				if (arr1[i] == arr1[j]) {
					break;
				}
			}
			list2.add(arr1[i]);
		}

		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (list2.get(i).equals(arr2[j])) {
					list.add(list2.get(i));
					break;
				}
			}
		}

		return list;
	}
}
