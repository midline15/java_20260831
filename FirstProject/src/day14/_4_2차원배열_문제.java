package day14;

import java.util.Arrays;
import java.util.Random;

public class _4_2차원배열_문제 {

	public static void main(String[] args) {
		// #. 4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 임의의 위치에 삽입하라.
		// 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라.
		// (중복 x, 나머지 6개는 0으로 출력)
		int arr[][] = new int[4][4];
//		Random r = new Random();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			int x = (int) (Math.random() * 4);
			int y = (int) (Math.random() * 4);
//			int x = r.nextInt(4);
//			int y = r.nextInt(4);
			if (arr[x][y] == 0) {
				arr[x][y] = i;
			} else {
				i--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
