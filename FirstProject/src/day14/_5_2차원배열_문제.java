package day14;

import java.util.Arrays;

public class _5_2차원배열_문제 {

	public static void main(String[] args) {

		int arr[][] = new int[6][6];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {

				if (i != arr.length - 1) {
					arr[i][j] = (int) (Math.random() * 10 + 1);
					arr[i][arr[i].length - 1] += arr[i][j];
					arr[arr.length - 1][j] += arr[i][j];
					arr[arr.length-1][arr[i].length-1] += arr[i][j];
				}
			}
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
