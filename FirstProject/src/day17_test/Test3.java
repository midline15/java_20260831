package day17_test;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*30)+1;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
