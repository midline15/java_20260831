package day5;

public class ArrayFunc {

	public void maxMinChange(int[] arr) {
		int min = 0;
		int max = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
			if (arr[i] < arr[min]) {
				min = i;
			}
		}
		int tmp = arr[max];
		arr[max] = arr[min];
		arr[min] = tmp;
	}

}
