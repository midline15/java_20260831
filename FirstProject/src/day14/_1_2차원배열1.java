package day14;

import java.util.Arrays;

public class _1_2차원배열1 {

	public static void main(String[] args) {

		int arr[][] = new int[3][5];
		// {0, 0, 0, 0, 0}
		// {0, 0, 0, 99, 0}
		// {0, 0, 0, 0, 0}
		arr[1][3] = 99;
		System.out.println(arr.length);// 행의 갯수
		System.out.println(arr[0].length);// 0번째의 열의 갯수

		int arr1[][] = {
				{0,0},
				{0,0,0},
				{0,0,0,0,0,0}
		};
		System.out.println(Arrays.toString(arr1));
		
		
		
	}

}
