package day17_test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {

		int arr[] = { 3, 9, 6, 5, 4, 2, 15, 8 };
		Arrays.sort(arr);
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			}else {
				oddList.add(arr[i]);
			}
		}

		for(int i = 0; i< arr.length; i++) {
			if(i%2 == 0) {
				arr[i] = oddList.getFirst();
				oddList.removeFirst();
			}else {
				arr[i] = evenList.getLast();
				evenList.removeLast();
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
