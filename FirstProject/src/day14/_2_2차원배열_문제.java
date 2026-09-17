package day14;

import java.util.Arrays;

public class _2_2차원배열_문제 {

	public static void main(String[] args) {
		int arr[][] = {
				new int[1],
				new int[2],
				new int[3],
				new int[4],
				new int[5]
		};
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
			
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
