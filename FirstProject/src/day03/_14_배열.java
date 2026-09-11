package day03;

import java.util.Arrays;
import java.util.Random;

public class _14_배열 {

	public static void main(String[] args) {
		
		int arr[] = new int [5];
		
		// 다섯개의 공간을 가지는 숫자형 배열에
		// 1~10 사이의 랜덤한 숫자를 채우기
		
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
		}

		System.out.println(Arrays.toString(arr));
		
	}
}
