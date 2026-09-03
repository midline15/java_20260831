package day3;

public class _12_배열 {

	public static void main(String[] args) {

		// 배열 [] {}
//		int arr1[] = {}; // int[] arr1
//		int arr2[] = new int[3];
//		int arr3[] = {1,2,3,4,5}; 

		int arr[] = new int[5]; // {0,0,0,0,0}
		arr[0] = 10; // {10,0,0,0}
		arr[1] = 15; // {10,15,0,0,0}
		arr[2] = 3;
		arr[3] = 8;
		arr[4] = 12; // {10,15,3,8,12}
//		System.out.println(arr[1]); // index

		int arr2[] = { 10, 15, 3, 8, 12 };

		// arr2에 있는 모든 수의 합 구하기
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		System.out.println(sum);

	}

}
