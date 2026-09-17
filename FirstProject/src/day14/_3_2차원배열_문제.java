package day14;

public class _3_2차원배열_문제 {

	public static void main(String[] args) {
		int arr[][] = { { 8, 5, 2, 65, 1 }, { 1, 8, 6, 2, 3 }, { 8, 12, 2, 25, 5 } };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1)
					sum += arr[i][j];
			}
		}

		System.out.println(sum);
	}

}
