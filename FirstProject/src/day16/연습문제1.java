package day16;

import java.util.Arrays;

public class 연습문제1 {

	public static void main(String[] args) {

		int arr[] = {3,5,-9,2,8};
		// 1.배열의 모든 숫자의 합 구하기
		// 단, 음수는 양수로 바꿔서 계산
		int sum =0;
		for (int num : arr) {
			sum += Math.abs(num);
		}
		System.out.println(sum);
		
		int[] arr2 = new int[6];
		//2. 1부터 50사이 랜덤한 숫자 배열에 넣은후
		// 두번째로 큰 숫자 구하기.
		// 중복 숫자 안들어 간다고 가정(중복체크안해도됨)
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random()*50) +1;
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[arr2.length-2]);
	}

}
