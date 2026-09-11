package day04;

import java.util.Arrays;
import java.util.Random;

public class _6_배열문제 {

	public static void main(String[] args) {

		// 6개 공간에 1부터 45사이의
		int[] arr = new int[6];

		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {

			arr[i] = ran.nextInt(45) + 1;
			
			for(int j = 0; j <i; j++) {
				
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
				
			}
			
		}

		System.out.println(Arrays.toString(arr));

	}

}
