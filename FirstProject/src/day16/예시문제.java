package day16;

import java.util.Arrays;
import java.util.Comparator;

public class 예시문제 {

	public static void main(String[] args) {
		
		int arr[] = {3,5,2,4,1};
		Integer [] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Integer [] arr1 = {3,5,2,4,1};
		
		Arrays.sort(arr1,Comparator.reverseOrder());
		
		System.out.println(arr1[0]-arr1[arr1.length-1]);
		
	}
	
}
