package day10_ex;

import java.util.ArrayList;
import java.util.Random;

public class Quiz1 {

	public static void main(String[] args) {
//# 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//
//2) 각 숫자의 개수를 출력하시오.
//답변 예시 : '1 : 6개, 2 : 3개, 3 : 5개, ... 10 : 2개'
//
//2) 중복된 숫자가 가장 많은 수의 숫자와 개수를 출력하시오.
//ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//위처럼 배열이 생성된 경우 2는 6개로 가장 많으므로 
//답변 예시 : '가장 많은 수 : 2, 개수 : 6' 
		int[] arr = new int[20];
		int[] count = new int[10];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1;
			count[arr[i] - 1]++;
		}
		// 1
		for (int i = 0; i < count.length; i++) {
			System.out.print((i + 1) + " : " + count[i] + "개");
			if (i != 9)
				System.out.print(", ");
		}
		// 2
		int maxIndex = 0;
		for (int i = 1; i < count.length; i++) {
			if (count[maxIndex] < count[i]) {
				maxIndex = i;
			}
		}

		int max = count[maxIndex];
		ArrayList<Integer> countList = new ArrayList<Integer>();
		for (int i = maxIndex; i < count.length; i++) {
			if (max == count[i]) {
				countList.add(i + 1);
			}
		}
		System.out.println();
		System.out.println("가장 많은 수 : " + countList + ", 개수 : " + max);

	}

}
