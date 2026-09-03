package day3;

public class _16_배열문제 {

	public static void main(String[] args) {

		int arr[] = { 7, 2, 4, 3, 8 };
		int minIndex = 0;

		// 배열안에 있는 숫자 중에서 가장 작은 숫자의 위치(index)를 출력

		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		System.out.println(minIndex);
	}

}
