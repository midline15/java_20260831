package day03;

public class _15_배열 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int max = 0;

		// 배열안에 있는 숫자 중에서 가장 큰 숫자 찾기
		for (int i = 0; i < arr.length; i++) {

			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);

	}

}
