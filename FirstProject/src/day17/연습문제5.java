package day17;

import java.util.Arrays;

public class 연습문제5 {

	public static void main(String[] args) {
//		1. 5 x 5 크기의 숫자형 배열 선언 후 1부터 25까지의 숫자를 세로방향으로 순차적으로 채우세요.
		int arr1[][] = new int[5][5];
		int k =1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[j][i] = k++;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		//2. 7 × 7 배열을 만들고 다음과 같이 출력되도록 하세요.
		int arr2[][] = new int[7][7];
		for (int l = 4; l >= 1; l--) {
			for (int i = 0; i < arr2.length; i++) {
				for (int j = 0; j < arr2[i].length; j++) {
					if(i == l-1 || i == arr2.length -l || j == l-1 || j == arr2[i].length -l) {
						arr2[i][j] = l;
					} 
				}
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		
	}

}
